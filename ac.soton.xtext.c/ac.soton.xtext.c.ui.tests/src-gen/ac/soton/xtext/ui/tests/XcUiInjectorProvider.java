/*
 * generated by Xtext 2.25.0
 */
package ac.soton.xtext.ui.tests;

import ac.soton.xtext.c.ui.internal.CActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class XcUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CActivator.getInstance().getInjector("ac.soton.xtext.Xc");
	}

}