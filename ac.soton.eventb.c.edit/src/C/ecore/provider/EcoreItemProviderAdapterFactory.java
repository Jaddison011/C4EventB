/**
 */
package C.ecore.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreItemProviderAdapterFactory extends C.ecore.util.EcoreAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CNamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CNamedElementItemProvider cNamedElementItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CNamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCNamedElementAdapter() {
		if (cNamedElementItemProvider == null) {
			cNamedElementItemProvider = new CNamedElementItemProvider(this);
		}

		return cNamedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTypeItemProvider cTypeItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCTypeAdapter() {
		if (cTypeItemProvider == null) {
			cTypeItemProvider = new CTypeItemProvider(this);
		}

		return cTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVariableItemProvider cVariableItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCVariableAdapter() {
		if (cVariableItemProvider == null) {
			cVariableItemProvider = new CVariableItemProvider(this);
		}

		return cVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CStruct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CStructItemProvider cStructItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CStruct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCStructAdapter() {
		if (cStructItemProvider == null) {
			cStructItemProvider = new CStructItemProvider(this);
		}

		return cStructItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFieldItemProvider cFieldItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCFieldAdapter() {
		if (cFieldItemProvider == null) {
			cFieldItemProvider = new CFieldItemProvider(this);
		}

		return cFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CEnumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEnumerationItemProvider cEnumerationItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCEnumerationAdapter() {
		if (cEnumerationItemProvider == null) {
			cEnumerationItemProvider = new CEnumerationItemProvider(this);
		}

		return cEnumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CEnumProperties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEnumPropertiesItemProvider cEnumPropertiesItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CEnumProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCEnumPropertiesAdapter() {
		if (cEnumPropertiesItemProvider == null) {
			cEnumPropertiesItemProvider = new CEnumPropertiesItemProvider(this);
		}

		return cEnumPropertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CArray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CArrayItemProvider cArrayItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CArray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCArrayAdapter() {
		if (cArrayItemProvider == null) {
			cArrayItemProvider = new CArrayItemProvider(this);
		}

		return cArrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CArrayElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CArrayElementItemProvider cArrayElementItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CArrayElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCArrayElementAdapter() {
		if (cArrayElementItemProvider == null) {
			cArrayElementItemProvider = new CArrayElementItemProvider(this);
		}

		return cArrayElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CPointer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPointerItemProvider cPointerItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CPointer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCPointerAdapter() {
		if (cPointerItemProvider == null) {
			cPointerItemProvider = new CPointerItemProvider(this);
		}

		return cPointerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CExpressionItemProvider cExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCExpressionAdapter() {
		if (cExpressionItemProvider == null) {
			cExpressionItemProvider = new CExpressionItemProvider(this);
		}

		return cExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CSubProgram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSubProgramItemProvider cSubProgramItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CSubProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCSubProgramAdapter() {
		if (cSubProgramItemProvider == null) {
			cSubProgramItemProvider = new CSubProgramItemProvider(this);
		}

		return cSubProgramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CDerivedType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDerivedTypeItemProvider cDerivedTypeItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CDerivedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCDerivedTypeAdapter() {
		if (cDerivedTypeItemProvider == null) {
			cDerivedTypeItemProvider = new CDerivedTypeItemProvider(this);
		}

		return cDerivedTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CDiscreteType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDiscreteTypeItemProvider cDiscreteTypeItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CDiscreteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCDiscreteTypeAdapter() {
		if (cDiscreteTypeItemProvider == null) {
			cDiscreteTypeItemProvider = new CDiscreteTypeItemProvider(this);
		}

		return cDiscreteTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CParameterItemProvider cParameterItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCParameterAdapter() {
		if (cParameterItemProvider == null) {
			cParameterItemProvider = new CParameterItemProvider(this);
		}

		return cParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFunctionItemProvider cFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCFunctionAdapter() {
		if (cFunctionItemProvider == null) {
			cFunctionItemProvider = new CFunctionItemProvider(this);
		}

		return cFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CProcedure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CProcedureItemProvider cProcedureItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CProcedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCProcedureAdapter() {
		if (cProcedureItemProvider == null) {
			cProcedureItemProvider = new CProcedureItemProvider(this);
		}

		return cProcedureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CTranslationUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTranslationUnitItemProvider cTranslationUnitItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CTranslationUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCTranslationUnitAdapter() {
		if (cTranslationUnitItemProvider == null) {
			cTranslationUnitItemProvider = new CTranslationUnitItemProvider(this);
		}

		return cTranslationUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CSourceFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSourceFileItemProvider cSourceFileItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CSourceFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCSourceFileAdapter() {
		if (cSourceFileItemProvider == null) {
			cSourceFileItemProvider = new CSourceFileItemProvider(this);
		}

		return cSourceFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CHeaderFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CHeaderFileItemProvider cHeaderFileItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CHeaderFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCHeaderFileAdapter() {
		if (cHeaderFileItemProvider == null) {
			cHeaderFileItemProvider = new CHeaderFileItemProvider(this);
		}

		return cHeaderFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CIncludeDirective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIncludeDirectiveItemProvider cIncludeDirectiveItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CIncludeDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCIncludeDirectiveAdapter() {
		if (cIncludeDirectiveItemProvider == null) {
			cIncludeDirectiveItemProvider = new CIncludeDirectiveItemProvider(this);
		}

		return cIncludeDirectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFileItemProvider cFileItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCFileAdapter() {
		if (cFileItemProvider == null) {
			cFileItemProvider = new CFileItemProvider(this);
		}

		return cFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CArrayVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CArrayVariableItemProvider cArrayVariableItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CArrayVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCArrayVariableAdapter() {
		if (cArrayVariableItemProvider == null) {
			cArrayVariableItemProvider = new CArrayVariableItemProvider(this);
		}

		return cArrayVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link C.ecore.CPreCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPreConditionItemProvider cPreConditionItemProvider;

	/**
	 * This creates an adapter for a {@link C.ecore.CPreCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCPreConditionAdapter() {
		if (cPreConditionItemProvider == null) {
			cPreConditionItemProvider = new CPreConditionItemProvider(this);
		}

		return cPreConditionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cNamedElementItemProvider != null) cNamedElementItemProvider.dispose();
		if (cTypeItemProvider != null) cTypeItemProvider.dispose();
		if (cVariableItemProvider != null) cVariableItemProvider.dispose();
		if (cStructItemProvider != null) cStructItemProvider.dispose();
		if (cFieldItemProvider != null) cFieldItemProvider.dispose();
		if (cEnumerationItemProvider != null) cEnumerationItemProvider.dispose();
		if (cEnumPropertiesItemProvider != null) cEnumPropertiesItemProvider.dispose();
		if (cArrayItemProvider != null) cArrayItemProvider.dispose();
		if (cArrayElementItemProvider != null) cArrayElementItemProvider.dispose();
		if (cPointerItemProvider != null) cPointerItemProvider.dispose();
		if (cExpressionItemProvider != null) cExpressionItemProvider.dispose();
		if (cSubProgramItemProvider != null) cSubProgramItemProvider.dispose();
		if (cDerivedTypeItemProvider != null) cDerivedTypeItemProvider.dispose();
		if (cDiscreteTypeItemProvider != null) cDiscreteTypeItemProvider.dispose();
		if (cParameterItemProvider != null) cParameterItemProvider.dispose();
		if (cFunctionItemProvider != null) cFunctionItemProvider.dispose();
		if (cProcedureItemProvider != null) cProcedureItemProvider.dispose();
		if (cTranslationUnitItemProvider != null) cTranslationUnitItemProvider.dispose();
		if (cSourceFileItemProvider != null) cSourceFileItemProvider.dispose();
		if (cHeaderFileItemProvider != null) cHeaderFileItemProvider.dispose();
		if (cIncludeDirectiveItemProvider != null) cIncludeDirectiveItemProvider.dispose();
		if (cFileItemProvider != null) cFileItemProvider.dispose();
		if (cArrayVariableItemProvider != null) cArrayVariableItemProvider.dispose();
		if (cPreConditionItemProvider != null) cPreConditionItemProvider.dispose();
	}

}
