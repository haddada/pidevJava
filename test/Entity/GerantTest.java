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
public class GerantTest {
    
    public GerantTest() {
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
     * Test of getNumFix method, of class Gerant.
     */
    @Test
    public void testGetNumFix() {
        System.out.println("getNumFix");
        Gerant instance = new Gerant();
        String expResult = "";
        String result = instance.getNumFix();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setNumFix method, of class Gerant.
     */
    @Test
    public void testSetNumFix() {
        System.out.println("setNumFix");
        String numFix = "";
        Gerant instance = new Gerant();
        instance.setNumFix(numFix);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getNumTel method, of class Gerant.
     */
    @Test
    public void testGetNumTel() {
        System.out.println("getNumTel");
        Gerant instance = new Gerant();
        String expResult = "";
        String result = instance.getNumTel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setNumTel method, of class Gerant.
     */
    @Test
    public void testSetNumTel() {
        System.out.println("setNumTel");
        String numTel = "";
        Gerant instance = new Gerant();
        instance.setNumTel(numTel);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of equals method, of class Gerant.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Gerant instance = new Gerant();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of toString method, of class Gerant.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Gerant instance = new Gerant();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
