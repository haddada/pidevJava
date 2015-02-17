/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seif
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStatusMatrimonial method, of class Client.
     */
    @Test
    public void testGetStatusMatrimonial() {
        System.out.println("getStatusMatrimonial");
        Client instance = new Client();
        String expResult = null;
        String result = instance.getStatusMatrimonial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setStatusMatrimonial method, of class Client.
     */
    @Test
    public void testSetStatusMatrimonial() {
        System.out.println("setStatusMatrimonial");
        String statusMatrimonial = "";
        Client instance = new Client();
        instance.setStatusMatrimonial(statusMatrimonial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Client.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Client instance = new Client();
        String expResult = "";
        String result = instance.toString();
        assertFalse(expResult.equals(result));
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Client.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Client instance = new Client();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
