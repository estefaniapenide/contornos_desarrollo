/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_division;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a20estefaniapc
 */
public class DivisionTest {
    
    public DivisionTest() {
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
     * Test of calcularDivision method, of class Division.
     */
    /*
    @Test
    public void testCalcularDivision() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 0.0F;
        float divisor = 0.0F;
        Division instance = new Division();
        float expResult = 0.0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
*/
        @Test
 public void testCalcularDivisionC1() throws Exception {
 System.out.println("Caso1: 1.40130E-45/1.40130E-45=1 con valor delta 0");
 Division instance = new Division();
 float resultado = instance.calcularDivision(1.40130E-45F,1.40130E-45F);
 assertEquals(1, resultado, 0.0);
 } 
 
     @Test
 public void testCalcularDivisionC2() throws Exception {
 System.out.println("Caso2: 3.40282E+38/3.40282E+38=1 con valor delta 0");
 Division instance = new Division();
 float resultado = instance.calcularDivision(3.40282E+38F,3.40282E+38F);
 assertEquals(1, resultado, 0.0);
 } 
    
    @Test
 public void testCalcularDivisionC3() throws Exception {
 System.out.println("Caso3: 1.40130E-45/3.40282E+38=4.1181E-084 con valor delta 0");
 Division instance = new Division();
 float resultado = instance.calcularDivision(1.40130E-45F,3.40282E+38F);
 assertEquals(4.1181E-084, resultado, 0.0);
 } 
 
     @Test
 public void testCalcularDivisionC4() throws Exception {
 System.out.println("Caso4: 3.40282E+38/1.40130E-45=2.4283E+083 con valor delta 0");
 Division instance = new Division();
 float resultado = instance.calcularDivision(3.40282E+38F,1.40130E-45F);
 assertEquals(2.4283E+083, resultado, 0.0);
 } 
 
      @Test
 public void testCalcularDivisionC5() throws Exception {
 System.out.println("Caso5: 1/3=0.33 con valor delta 1E-2");
 Division instance = new Division();
 float resultado = instance.calcularDivision(1F,3F);
 assertEquals(0.33, resultado, 1E-2);
 } 
 
      @Test
 public void testCalcularDivisionC6() throws Exception {
 System.out.println("Caso6: 0/1.40130E-45=0 con valor delta 0");
 Division instance = new Division();
 float resultado = instance.calcularDivision(0F,1.40130E-45F);
 assertEquals(0, resultado, 0.0);
 } 
 
 
 @Test(expected = Exception.class)
public void testCalcularDivisionC7() throws Exception {
 System.out.println("Caso7: 1.40130E-45/0 con valor delta 0");
 Division instance = new Division();
 float resultado = instance.calcularDivision(1.40130E-45F, 0F);
}

    
}
