package ac.soton.eventb.c.generator.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import org.eventb.core.IContextRoot;
import org.eventb.core.IEventBProject;
import org.eventb.core.IMachineRoot;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.persistence.EMFRodinDB;
import org.eventb.emf.persistence.SaveResourcesCommand;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;
import ch.ethz.eventb.utils.EventBUtils;
import ac.soton.emf.translator.TranslatorFactory;
import ac.soton.eventb.c.generator.utils.CResourceUtils;

public class CTranslateHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Object obj = getCurrentSelectedObject(event);
	    if ((obj == null))
	      return null;
	 
	    if ((obj instanceof IProject)) {
	      IProject prj = ((IProject) obj);
	      IEventBProject eBPrj = EventBUtils.getEventBProject(prj.getName());
	      if ((eBPrj != null)) {
	        try {
	          IRodinFile[] rodinFiles = eBPrj.getRodinProject().getRodinFiles();
	          for ( IRodinFile rodinFile : rodinFiles) {
	            
	              IInternalElement root = rodinFile.getRoot();
	              if ((root instanceof IMachineRoot)) {
	                  convert(((IMachineRoot) root));
	              } else if ((root instanceof IContextRoot)) {
	                  convert(((IContextRoot) root));
	              }
	            }
	         
	         } catch (final RodinDBException e) {
	            e.printStackTrace();
	        }
	      }
	    } else  if (obj instanceof IMachineRoot) {
	        convert((IMachineRoot) obj);
	      } else if (obj instanceof IContextRoot) {
	          convert((IContextRoot) obj);
	        }
	    return null;

	}
	  /**
	   * Get the current only selected object. If more than one objects are
	   * selected, return <code>null</code>.
	   * 
	   * @param event
	   *          the execution event
	   * @return the only selected object.
	   * @throws ExecutionException
	   *          if some unexpected error occurs.
	   */
	  private Object getCurrentSelectedObject(final ExecutionEvent event) throws ExecutionException {
		// Get the current selection
		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
	    if ((selection instanceof IStructuredSelection)) {
	      IStructuredSelection ssel = ((IStructuredSelection) selection);
	      if(ssel.size() == 1){
	        return ssel.getFirstElement();
	      }
	    }
	    return null;
	  }
	  /**
	   * Converting a machine root to C
	   * 
	   * @param root
	   *          the input machine root.
	   */
	  private void convert(final IMachineRoot root) {
		System.out.println("Starting conversion");
	    EMFRodinDB emfRodinDB = new EMFRodinDB();
	    EventBElement mch = emfRodinDB.loadEventBComponent(root);
	    System.out.println("Identified machine: " + mch);
	    // create the c folder
	    String file_name = root.getElementName();
	    try {
			IFolder cFolder = CResourceUtils.getCFolder(mch);
			System.out.println("Created new Output folder at: " + cFolder);
//			CResourceUtils.getPackageFile(file_name, cFolder, false);
//			CResourceUtils.getPackageFile(file_name, cFolder, true);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //----------------
	    TransactionalEditingDomain editingDomain = emfRodinDB.getEditingDomain();
		try {
			
		       TranslatorFactory factory = (TranslatorFactory) TranslatorFactory.getFactory();
		        String commandId = "ac.soton.eventb.c.generator.CConvert";
		       
		        if (factory.canTranslate(commandId, mch.eClass())) {
		          NullProgressMonitor monitor = new NullProgressMonitor();
		          try {
					factory.translate(editingDomain, mch, commandId, monitor);
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        }
		} catch (Exception e) {
			// TODO: Changed from CoreException to Exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		//save
		System.out.println("EditingDomain: " + editingDomain);
		var arr = editingDomain.getResourceSet().getResources().toArray();
		for (var a : arr) {
			System.out.println("EditingDomainArrayElement: " + a);
		}

	      SaveResourcesCommand saveCommand = new SaveResourcesCommand(editingDomain);
	      IWorkspaceRunnable wsRunnable = new IWorkspaceRunnable() {
	        @Override
	        public void run(IProgressMonitor monitor) throws CoreException {
	          try {
			  saveCommand.execute(monitor, null);
			} catch (ExecutionException e) {
			  
			    Status status = new Status(IStatus.ERROR, "C handler save command error", "Nothing", e);
			    throw new CoreException(status);
			  
			}
	        }
	      };
	      NullProgressMonitor monitor = new NullProgressMonitor();
	     
	      if (saveCommand.canExecute()) {
	        Resource[] emptyResource = {};
	       
				try {
					RodinCore.run(wsRunnable, 
					  getSchedulingRule(editingDomain.getResourceSet().getResources().<Resource>toArray(emptyResource)), monitor);
				} catch (RodinDBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	      }
	      monitor.done();

	  }
	  
	  /**
	   * Converting a context root to C.
	   * 
	   * @param root
	   *          the input context root.
	   */
	  private void convert(final IContextRoot root) {
//		  EMFRodinDB emfRodinDB = new EMFRodinDB();
//		    EventBElement mch = emfRodinDB.loadEventBComponent(root);
//		  TransactionalEditingDomain editingDomain = emfRodinDB.getEditingDomain();
//			try {
//				
//			       TranslatorFactory factory = (TranslatorFactory) TranslatorFactory.getFactory();
//			        String commandId = "ac.soton.eventb.c.generator.CConvert";
//			       
//			        if (factory.canTranslate(commandId, mch.eClass())) {
//			          NullProgressMonitor monitor = new NullProgressMonitor();
//			          try {
//						factory.translate(editingDomain, mch, commandId, monitor);
//					} catch (ExecutionException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//			        }
//			} catch (CoreException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		    
//			//save
//		      SaveResourcesCommand saveCommand = new SaveResourcesCommand(editingDomain);
//		      IWorkspaceRunnable wsRunnable = new IWorkspaceRunnable() {
//		        @Override
//		        public void run(IProgressMonitor monitor) throws CoreException {
//		          try {
//				  saveCommand.execute(monitor, null);
//				} catch (ExecutionException e) {
//				  
//				    Status status = new Status(IStatus.ERROR, "C handler save command error", "Nothing", e);
//				    throw new CoreException(status);
//				  
//				}
//		        }
//		      };
//		      NullProgressMonitor monitor = new NullProgressMonitor();
//		     
//		      if (saveCommand.canExecute()) {
//		        Resource[] emptyResource = {};
//		       
//					try {
//						RodinCore.run(wsRunnable, 
//						  getSchedulingRule(editingDomain.getResourceSet().getResources().<Resource>toArray(emptyResource)), monitor);
//					} catch (RodinDBException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//			
//		      }
//		      monitor.done();

	  }
	  
	  private ISchedulingRule getSchedulingRule(final Resource[] resources) {
		    if(resources.length == 0) {
		      return null;
		    } else if(resources.length == 1){
		        return WorkspaceSynchronizer.getFile(resources[0]);
		      } else {
		        IProject project = getProject(resources[0]);
		        for (Resource resource : resources) {
		          if (project != getProject(resource)) {
		            return ResourcesPlugin.getWorkspace().getRoot();
		          }
		        }
		        return project;
		      }    
	   }
	  
	  private IProject getProject(Resource resource) {
		    IFile file = WorkspaceSynchronizer.getFile(resource);
		    IProject project = null;
		    if (file!=null) 
		      project=file.getProject();
		   return project;

		  }
}