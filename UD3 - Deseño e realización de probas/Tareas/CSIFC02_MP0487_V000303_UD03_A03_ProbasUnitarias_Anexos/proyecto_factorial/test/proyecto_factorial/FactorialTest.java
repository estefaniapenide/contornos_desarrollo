/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_factorial;

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
public class FactorialTest {
    
    public FactorialTest() {
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
     * Test of factorial method, of class Factorial.
     */
    @Test
    public void testFactorialC1() throws Exception {
        System.out.println("Caso1: byte 0");
        byte n = 0;
        Factorial instance = new Factorial();
        float result = instance.factorial(n);
        assertEquals(1, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //
    }
    
    @Test
    public void testFactorialC2() throws Exception {
        System.out.println("Caso2: byte 1");
        byte n = 1;
        Factorial instance = new Factorial();
        float result = instance.factorial(n);
        assertEquals(1, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //
    }
    
    @Test
    public void testFactorialC3() throws Exception {
        System.out.println("Caso3: byte 2");
        byte n = 2;
        Factorial instance = new Factorial();
        float result = instance.factorial(n);
        assertEquals(2, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //
    }
    
    @Test
    public void testFactorialC4() throws Exception {
        System.out.println("Caso4: byte 3");
        byte n = 3;
        Factorial instance = new Factorial();
        float result = instance.factorial(n);
        assertEquals(6, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //
    }
    
    @Test
    public void testFactorialC5() throws Exception {
        System.out.println("Caso5: byte 4");
        byte n = 4;
        Factorial instance = new Factorial();
        float result = instance.factorial(n);
        assertEquals(24, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //
    }
    
    @Test
    public void testFactorialC6() throws Exception {
        System.out.println("Caso6: byte 127");
        byte n = 127;
        Factorial instance = new Factorial();
        float result = instance.factorial(n);
        assertEquals(3.0126600184576595448099770775270596923241649186E+213, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //
    }
    
    @Test(expected = Exception.class)
    public void testFactorialC7() throws Exception {
        System.out.println("Caso7: byte -1");
        byte n = -1;
        Factorial instance = new Factorial();
        float result = instance.factorial(n);
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of factorial method, of class Factorial.
     */
//    @Test
//    public void testFactorial() throws Exception {
//        System.out.println("factorial");
//        byte n = 0;
//        Factorial instance = new Factorial();
//        float expResult = 0.0F;
//        float result = instance.factorial(n);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
