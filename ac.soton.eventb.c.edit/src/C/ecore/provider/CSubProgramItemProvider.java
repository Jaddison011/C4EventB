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
 * This is the item provider adapter for a {@link C.ecore.CSubProgram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CSubProgramItemProvider extends CNamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSubProgramItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(C.ecore.EcorePackage.Literals.CSUB_PROGRAM__PARAMETERS);
			childrenFeatures.add(C.ecore.EcorePackage.Literals.CSUB_PROGRAM__LOCAL_VARIABLES);
			childrenFeatures.add(C.ecore.EcorePackage.Literals.CSUB_PROGRAM__BODY);
			childrenFeatures.add(C.ecore.EcorePackage.Literals.CSUB_PROGRAM__PRECONDITIONS);
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
	 * This returns CSubProgram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CSubProgram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((C.ecore.CSubProgram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CSubProgram_type") :
			getString("_UI_CSubProgram_type") + " " + label;
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

		switch (notification.getFeatureID(C.ecore.CSubProgram.class)) {
			case C.ecore.EcorePackage.CSUB_PROGRAM__PARAMETERS:
			case C.ecore.EcorePackage.CSUB_PROGRAM__LOCAL_VARIABLES:
			case C.ecore.EcorePackage.CSUB_PROGRAM__BODY:
			case C.ecore.EcorePackage.CSUB_PROGRAM__PRECONDITIONS:
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
				(C.ecore.EcorePackage.Literals.CSUB_PROGRAM__PARAMETERS,
				 C.ecore.EcoreFactory.eINSTANCE.createCParameter()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CSUB_PROGRAM__LOCAL_VARIABLES,
				 C.ecore.EcoreFactory.eINSTANCE.createCVariable()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CSUB_PROGRAM__LOCAL_VARIABLES,
				 C.ecore.EcoreFactory.eINSTANCE.createCArrayVariable()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CSUB_PROGRAM__BODY,
				 C.ecore.EcoreFactory.eINSTANCE.createCExpression()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CSUB_PROGRAM__BODY,
				 C.ecore.EcoreFactory.eINSTANCE.createCPreCondition()));

		newChildDescriptors.add
			(createChildParameter
				(C.ecore.EcorePackage.Literals.CSUB_PROGRAM__PRECONDITIONS,
				 C.ecore.EcoreFactory.eINSTANCE.createCPreCondition()));
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
			childFeature == C.ecore.EcorePackage.Literals.CSUB_PROGRAM__BODY ||
			childFeature == C.ecore.EcorePackage.Literals.CSUB_PROGRAM__PRECONDITIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
