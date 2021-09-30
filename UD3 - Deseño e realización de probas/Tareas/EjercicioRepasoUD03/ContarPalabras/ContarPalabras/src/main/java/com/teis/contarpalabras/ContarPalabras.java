/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teis.contarpalabras;

import java.util.Scanner;

/**
 *
 * @author luisalb
 */
public class ContarPalabras {

    private String frase;
    public ContarPalabras(String s) {
        frase = s;
    }
    
    //Método que recibe un String y devuelve el número de palabras que contiene
    public int getNumPalabras() {
        int contador = 1, pos;
        frase = frase.trim(); //eliminar los posibles espacios en blanco al principio y al final                              
        if (frase.isEmpty()) { //si la cadena está vacía
            contador = 0;
        } else {
                pos = frase.indexOf(" "); //se busca el primer espacio en blanco
                while (pos != -1) {   //mientras que se encuentre un espacio en blanco
                       contador++;    //se cuenta una palabra
                       pos = frase.indexOf(" ", pos + 1); //se busca el siguiente espacio en blanco                       
                }                                     //a continuación del actual
        }
        return contador;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
       String frase;
       System.out.println("Introduce una frase: ");
       frase = sc.nextLine();
       ContarPalabras cp = new ContarPalabras(frase);
       System.out.println("La frase introducida consta de: "+ cp.getNumPalabras() +" palabras");
       
    }
    
}
