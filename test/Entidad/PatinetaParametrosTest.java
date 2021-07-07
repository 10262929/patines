/**
 * Este es para la parametrizacion de los metodos para agregar valores 
 * y se ejecute varias veces Segun sea metodo
 * 
 */
package Entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author : Braham Marin
 */
@RunWith(value = Parameterized.class)
public class PatinetaParametrosTest {
    
 private int id;
     private String nombre;
     private String apellidos;
     private String codigoPatin;
     private String color;
     private String descripcion;
     private String 
          
    @Parameters

    /**
     *
     * @return obj
     */
    public static Iterator<Object[]> getData(){
        List<Object[]> obj = new ArrayList<>();
        obj.add(new object[]{9542});
        return obj;
    }

    /**
     *Este metodo  es para agregar nueva patineta
     */
    @Test
    public void testGetCodigoPatin() {
        System.out.println("getCodigoPatin");
        Patineta instance = new Patineta();
        String expResult = null;
        String result = instance.getCodigoPatin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
