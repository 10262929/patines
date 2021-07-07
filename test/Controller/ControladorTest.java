/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Entidad.Patineta;
import javax.servlet.http.HttpServletRequest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author : Braham Marin
 */
public class ControladorTest {
    
    /**
     *Metodo 
     */
    public ControladorTest() {
    }
    
    /**
     *Metodo
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *Metodo
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *Metodo
     */
    @Before
    public void setUp() {
    }
    
    /**
     *Metodo
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of listar method, of class Controlador.
     * 
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class Controlador.
     */
    @Test
    public void testAgregar_0args() {
        System.out.println("Agregar");
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.Agregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class Controlador.
     */
    @Test
    public void testAgregar_3args() {
        System.out.println("Agregar");
        Patineta p = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.Agregar(p, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class Controlador.
     */
    @Test
    public void testEditar_HttpServletRequest() {
        System.out.println("Editar");
        HttpServletRequest request = null;
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.Editar(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class Controlador.
     */
    @Test
    public void testEditar_3args() {
        System.out.println("Editar");
        Patineta p = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.Editar(p, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPatinetaxID method, of class Controlador.
     */
    @Test
    public void testBuscarPatinetaxID() {
        System.out.println("buscarPatinetaxID");
        int id = 0;
        Controlador instance = new Controlador();
        Patineta expResult = null;
        Patineta result = instance.buscarPatinetaxID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class Controlador.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        HttpServletRequest request = null;
        Controlador instance = new Controlador();
        ModelAndView expResult = null;
        ModelAndView result = instance.Eliminar(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
