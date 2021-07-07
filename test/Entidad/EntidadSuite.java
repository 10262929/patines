/*
 * Este es el metodo Suite del Modelo Entidad
 *  
 */

package Entidad;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Braham Marin
 */
@RunWith(Suite.class)

@Suite.SuiteClasses(
        {suiteProyecto.class, 
            PatinetaParametrosTest.class,
            PatinetaTest.class, 
            PatinetaValidationTest.class})    
public class EntidadSuite {
           
}
