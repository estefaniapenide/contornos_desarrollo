/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarcaracter;

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
public class OperacionsArraysTest {
    
    public OperacionsArraysTest() {
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
     * Test of busca method, of class OperacionsArrays.
     */
    @Test
    public void testBuscaC1() {
        System.out.println("Arrays C1");
        char c = 'k';
        char[] v = {'k'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC2() {
        System.out.println("Arrays C2");
        char c = 'k';
        char[] v = {'j'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(false, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC3() {
        System.out.println("Arrays C3");
        char c = 'k';
        char[] v = {'k','l'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC4() {
        System.out.println("Arrays C4");
        char c = 'k';
        char[] v = {'j','k'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC5() {
        System.out.println("Arrays C5");
        char c = 'k';
        char[] v = {'j','j'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(false, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC6() {
        System.out.println("Arrays C6");
        char c = 'k';
        char[] v = {'a','a','a','a','k','l','l','l','l'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC7() {
        System.out.println("Arrays C7");
        char c = 'k';
        char[] v = {'a','a','a','k','l','l','l','l','l'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC8() {
        System.out.println("Arrays C8");
        char c = 'k';
        char[] v = {'a','a','a','a','a','k','l','l','l'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC9() {
        System.out.println("Arrays C9");
        char c = 'k';
        char[] v = {'a','a','a','a','a','a','a','a','a'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(false, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC10() {
        System.out.println("Arrays C10");
        char c = 'k';
        char[] v = {'a','a','a','a','k','l','l','l','l','l'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC11() {
        System.out.println("Arrays C11");
        char c = 'k';
        char[] v = {'a','a','a','k','l','l','l','l','l','l'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC12() {
        System.out.println("Arrays C12");
        char c = 'k';
        char[] v = {'a','a','a','a','a','k','l','l','l','l'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC13() {
        System.out.println("Arrays C13");
        char c = 'k';
        char[] v = {'a','a','a','a','a','a','a','a','a','a'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        assertEquals(false, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = Exception.class)
    public void testBuscaC14() {
        System.out.println("Arrays C14");
        char c = 'k';
        char[] v = null;
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = Exception.class)
    public void testBuscaC15() {
        System.out.println("Arrays C15");
        char c = 'k';
        char[] v = {'a','a','a','a','a','a','a','a','a','a','a'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = Exception.class)
    public void testBuscaC16() {
        System.out.println("Arrays C16");
        char c = 'k';
        char[] v = {'a','p','s','k'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean result = instance.busca(c, v);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuscaC17() {
        System.out.println("Arrays C17");
        char c = 'k';
        char[] v = {'a','a','a','a','k','a','a','a','a','a'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
