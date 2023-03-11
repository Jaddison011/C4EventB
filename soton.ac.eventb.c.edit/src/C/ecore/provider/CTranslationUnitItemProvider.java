/**
 */
package C.ecore.provider;


import C.ecore.CTranslationUnit;
import C.ecore.EcoreFactory;
import C.ecore.EcorePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link C.ecore.CTranslationUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CTranslationUnitItemProvider extends CNamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTranslationUnitItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES);
			childrenFeatures.add(EcorePackage.Literals.CTRANSLATION_UNIT__SUB_PROGRAMS);
			childrenFeatures.add(EcorePackage.Literals.CTRANSLATION_UNIT__HEADER_FILES);
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
	 * This returns CTranslationUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CTranslationUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CTranslationUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CTranslationUnit_type") :
			getString("_UI_CTranslationUnit_type") + " " + label;
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

		switch (notification.getFeatureID(CTranslationUnit.class)) {
			case EcorePackage.CTRANSLATION_UNIT__SOURCE_FILES:
			case EcorePackage.CTRANSLATION_UNIT__SUB_PROGRAMS:
			case EcorePackage.CTRANSLATION_UNIT__HEADER_FILES:
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
				(EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES,
				 EcoreFactory.eINSTANCE.createCSourceFile()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.CTRANSLATION_UNIT__SUB_PROGRAMS,
				 EcoreFactory.eINSTANCE.createCSubProgram()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.CTRANSLATION_UNIT__SUB_PROGRAMS,
				 EcoreFactory.eINSTANCE.createCFunction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.CTRANSLATION_UNIT__SUB_PROGRAMS,
				 EcoreFactory.eINSTANCE.createCProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.CTRANSLATION_UNIT__HEADER_FILES,
				 EcoreFactory.eINSTANCE.createCHeaderFile()));
	}

}
