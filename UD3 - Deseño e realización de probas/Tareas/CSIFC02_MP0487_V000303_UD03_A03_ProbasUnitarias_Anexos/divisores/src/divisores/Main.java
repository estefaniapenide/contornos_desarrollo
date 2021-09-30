/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisores;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("\nVER DIVISORES DE UN ENTERO POSITIVO\n");
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.printf("Teclee el número entero (entre 0 y %d): ", Byte.MAX_VALUE);
            byte numero = teclado.nextByte();
            Divisores divisor = new Divisores();
            System.out.println("Divisores:" + divisor.obterDivisores(numero));
        } catch (Exception ex) {
            teclado.nextLine(); //para limpiar INTRO del buffer de teclado
            System.out.println(ex.getMessage()); // Muestra el error
        }
    }
}
