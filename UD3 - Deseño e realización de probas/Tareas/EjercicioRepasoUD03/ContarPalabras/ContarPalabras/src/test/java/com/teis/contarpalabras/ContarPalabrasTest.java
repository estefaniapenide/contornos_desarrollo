/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teis.contarpalabras;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author a20estefaniapc
 */
public class ContarPalabrasTest {
    
    public ContarPalabrasTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
  

    /**
     * Test of getNumPalabras method, of class ContarPalabras.
     */
    
    @org.junit.jupiter.api.Test
    public void testGetNumPalabrasC1() {
        System.out.println("C1: Cadena con 0 cracteres");
        ContarPalabras instance = new ContarPalabras("");
        int expResult = 0;
        int result = instance.getNumPalabras();
        System.out.println("C1: valor esperado: "+expResult+" Valor obtenido: "+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
    @org.junit.jupiter.api.Test
    public void testGetNumPalabrasC2() {
        System.out.println("C2: Cadena con al menos 1 carácter visible");
        ContarPalabras instance = new ContarPalabras("Hola");
        int expResult = 1;
        int result = instance.getNumPalabras();
        System.out.println("C2: valor esperado: "+expResult+" Valor obtenido: "+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
     @org.junit.jupiter.api.Test
    public void testGetNumPalabrasC3() {
        System.out.println("C3:  Cadena con 1 carácter no visible (espacio en blanco).");
        ContarPalabras instance = new ContarPalabras(" ");
        int expResult = 0;
        int result = instance.getNumPalabras();
        System.out.println("C3: valor esperado: "+expResult+" Valor obtenido: "+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
    @org.junit.jupiter.api.Test
    public void testGetNumPalabrasC4() {
        System.out.println("C4: Cadena con 1 carácter no visible (tabulador).");
        ContarPalabras instance = new ContarPalabras("\t");
        int expResult = 0;
        int result = instance.getNumPalabras();
        System.out.println("C4: valor esperado: "+expResult+" Valor obtenido: "+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
     @org.junit.jupiter.api.Test
    public void testGetNumPalabrasC5() {
        System.out.println("C5: Cadena con n caracteres visibles y empieza por espacios en blanco. ");
        ContarPalabras instance = new ContarPalabras("   Hola mundo");
        int expResult = 2;
        int result = instance.getNumPalabras();
        System.out.println("C5: valor esperado: "+expResult+" Valor obtenido: "+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
     @org.junit.jupiter.api.Test
    public void testGetNumPalabrasC6() {
        System.out.println("C6: Cadena con n caracteres visibles y acaba por espacios en blanco");
        ContarPalabras instance = new ContarPalabras("Hola mundo   ");
        int expResult = 2;
        int result = instance.getNumPalabras();
        System.out.println("C6: valor esperado: "+expResult+" Valor obtenido: "+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
     @org.junit.jupiter.api.Test
    public void testGetNumPalabrasC7() {
        System.out.println("C7: Cadena con n caracteres visibles y con más de un espacio en blanco separando las palabras");
        ContarPalabras instance = new ContarPalabras("Hola    mundo");
        int expResult = 2;
        int result = instance.getNumPalabras();
        System.out.println("C7: valor esperado: "+expResult+" Valor obtenido: "+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }

   
    
    
}
