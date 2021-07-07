/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package DAO;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Braham Marin
 */
public class listarDAOTest {

    /**
     *this white
     */
    public listarDAOTest() {
    }

    /**
     *this white
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *this white
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *this white
     */
    @Before
    public void setUp() {
    }

    /**
     *this white
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of listar method, of class listarDAO.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        listarDAO instance = new listarDAO();
        List expResult = instance.listar();;
        List result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class listarDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String nombres = "";
        String apellidos = "";
        String codigo = "";
        String color = "";
        String descripcion = "";
        listarDAO instance = new listarDAO();
        instance.insert( nombres,apellidos,codigo,color,descripcion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class listarDAO.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        int Id = 0;
        String nombres = "";
        String apellidos = "";
        String codigo = "";
        String color = "";
        String descripcion = "";
        listarDAO instance = new listarDAO();
        instance.Editar(Id, nombres, apellidos,codigo,color,descripcion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPerson method, of class listarDAO.
     */
    @Test
    public void testEliminarPerson() {
        System.out.println("eliminarPerson");
        int id = 0;
        listarDAO instance = new listarDAO();
        instance.eliminarPatineta(id);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPatineta method, of class listarDAO.
     */
    @Test
    public void testEliminarPatineta() {
        System.out.println("eliminarPatineta");
        int id = 0;
        listarDAO instance = new listarDAO();
        instance.eliminarPatineta(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
