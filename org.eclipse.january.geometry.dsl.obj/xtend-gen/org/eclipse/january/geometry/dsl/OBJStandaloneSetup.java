/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.dsl;

import com.google.inject.Injector;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.january.geometry.GeometryPackage;
import org.eclipse.january.geometry.dsl.OBJStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class OBJStandaloneSetup extends OBJStandaloneSetupGenerated {
  public static void doSetup() {
    new OBJStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  @Override
  public void register(final Injector injector) {
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/january/geometry");
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put("http://www.eclipse.org/january/geometry", GeometryPackage.eINSTANCE);
    }
    super.register(injector);
  }
}
