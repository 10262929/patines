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
import org.springframework.validation.Errors;

/**
 *
 * @author User
 */
public class PatinetaValidationTest {
    
    /**
     *
     */
    public PatinetaValidationTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of supports method, of class PatinetaValidation.
     */
    @Test
    public void testSupports() {
        System.out.println("supports");
        Class type = null;
        PatinetaValidation instance = new PatinetaValidation();
        boolean expResult = false;
        boolean result = instance.supports(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validate method, of class PatinetaValidation.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Object o = null;
        Errors errors = null;
        PatinetaValidation instance = new PatinetaValidation();
        instance.validate(o, errors);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
