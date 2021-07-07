/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author : Braham Marin
 */
public class PatinetaTest {
    
    /**
     *Metho Public
     */
    public PatinetaTest() {
    }
    
    /**
     *Method  BeforeClass
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *Method AfterClass
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *Method Before 
     */
    @Before
    public void setUp() {
    }
    
    /**
     *Method After 
     */ 
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Patineta.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Patineta instance = new Patineta();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Patineta.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Patineta instance = new Patineta();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Patineta.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Patineta instance = new Patineta();
        String expResult = null;
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Patineta.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "kk";
        Patineta instance = new Patineta();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Patineta.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Patineta instance = new Patineta();
        String expResult = null;
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Patineta.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Patineta instance = new Patineta();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoPatin method, of class Patineta.
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

    /**
     * Test of setCodigoPatin method, of class Patineta.
     */
    @Test
    public void testSetCodigoPatin() {
        System.out.println("setCodigoPatin");
        String codigoPatin = "";
        Patineta instance = new Patineta();
        instance.setCodigoPatin(codigoPatin);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Patineta.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Patineta instance = new Patineta();
        String expResult = null;
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Patineta.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        Patineta instance = new Patineta();
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Patineta.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Patineta instance = new Patineta();
        String expResult = null;
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Patineta.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Patineta instance = new Patineta();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
