/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_acronimos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Estefania
 */
public class AcronimosTest {
    
    public AcronimosTest() {
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
     * Test of obtenerAcronimo method, of class Acronimos.
     */
    @Test
    public void testObtenerAcronimo() {
        System.out.println("obtenerAcronimo");

        Acronimos instance = new Acronimos();

        String result = instance.obtenerAcronimo("");
        assertEquals("", result);
        System.out.println("C1: -"+result+"-");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        result = instance.obtenerAcronimo("A");
        assertEquals("A.", result);
        System.out.println("C2: -"+result+"-");
        
        result = instance.obtenerAcronimo(" ");
        assertEquals("", result);
        System.out.println("C3: -"+result+"-");
        
        result = instance.obtenerAcronimo("\t");
        assertNotEquals("", result);
        System.out.println("C4: -"+result+"-");
        
        result = instance.obtenerAcronimo("  UNHA OUTRA");
        assertEquals("U.O.", result);
        System.out.println("C5: -"+result+"-");
        
        result = instance.obtenerAcronimo("UNHA OUTRA");
        assertEquals("U.O.", result);
        System.out.println("C6: -"+result+"-");
        
        result = instance.obtenerAcronimo("UNHA  OUTRA ");
        assertEquals("U.O.", result);
        System.out.println("C7: -"+result+"-");
        
         result = instance.obtenerAcronimo("UNHA .OUTRA");
        assertEquals("U...", result);
        System.out.println("C8: -"+result+"-");
    }
    
    
}
