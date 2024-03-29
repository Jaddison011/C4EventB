/*
 * generated by Xtext 2.25.0
 */
package ac.soton.xtext.ide;

import ac.soton.xtext.XcRuntimeModule;
import ac.soton.xtext.XcStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class XcIdeSetup extends XcStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new XcRuntimeModule(), new XcIdeModule()));
	}
	
}
