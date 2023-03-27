/*
 * generated by Xtext 2.25.0
 */
package ac.soton.xtext.c.ui;

import ac.soton.xtext.c.ui.internal.CActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XcExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(CActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		CActivator activator = CActivator.getInstance();
		return activator != null ? activator.getInjector(CActivator.AC_SOTON_XTEXT_C_XC) : null;
	}

}
