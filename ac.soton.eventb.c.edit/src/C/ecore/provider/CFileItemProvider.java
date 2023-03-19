/**
 */
package C.ecore.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link C.ecore.CFile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CFileItemProvider extends CNamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFileItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(C.ecore.EcorePackage.Literals.CFILE__SUB_PROGRAMS);
			childrenFeatures.add(C.ecore.EcorePackage.Literals.CFILE__GLOBAL_VARIABLES);
			childrenFeatures.add(C.ecore.EcorePackage.Literals.CFILE__TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CFile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CFile"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((C.ecore.CFile)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CFile_type") :
			getString("_UI_CFile_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(C.ecore.CFile.class)) {
			case C.ecore.EcorePackage.CFILE__SUB_PROGRAMS:
			case C.ecore.EcorePackage.CFILE__GLOBAL_VARIABLES:
			case C.ecore.EcorePackage.CFILE__TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__SUB_PROGRAMS,
				 C.ecore.EcoreFactory.eINSTANCE.createCSubProgram()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__SUB_PROGRAMS,
				 C.ecore.EcoreFactory.eINSTANCE.createCFunction()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__SUB_PROGRAMS,
				 C.ecore.EcoreFactory.eINSTANCE.createCProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__GLOBAL_VARIABLES,
				 C.ecore.EcoreFactory.eINSTANCE.createCVariable()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__GLOBAL_VARIABLES,
				 C.ecore.EcoreFactory.eINSTANCE.createCArrayVariable()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__TYPES,
				 C.ecore.EcoreFactory.eINSTANCE.createCType()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__TYPES,
				 C.ecore.EcoreFactory.eINSTANCE.createCDerivedType()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__TYPES,
				 C.ecore.EcoreFactory.eINSTANCE.createCStruct()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__TYPES,
				 C.ecore.EcoreFactory.eINSTANCE.createCField()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__TYPES,
				 C.ecore.EcoreFactory.eINSTANCE.createCDiscreteType()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__TYPES,
				 C.ecore.EcoreFactory.eINSTANCE.createCEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__TYPES,
				 C.ecore.EcoreFactory.eINSTANCE.createCArray()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__TYPES,
				 C.ecore.EcoreFactory.eINSTANCE.createCPointer()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CFILE__TYPES,
				 C.ecore.EcoreFactory.eINSTANCE.createCArrayVariable()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == C.ecore.EcorePackage.Literals.CFILE__GLOBAL_VARIABLES ||
			childFeature == C.ecore.EcorePackage.Literals.CFILE__TYPES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
