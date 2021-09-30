/*
 * Clase que permite teclear os datos dun vendedor e visualiza o
 * complemento que debería de cobrar utilizando a clase Complementos.java
 */
package examen;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("\nCALCULAR COMPLEMENTOS\n");
        Scanner teclado = new Scanner(System.in);
        boolean error;
        float ventas;
        float km;
        short categoria;
        short seccion;
        do {
            try {
                error = false;
                System.out.print("Teclee importe de ventas (>0): ");
                ventas = teclado.nextFloat();
                System.out.print("Teclee Km realizados (>=0): ");
                km = teclado.nextFloat();
                System.out.print("Teclee categoría profesional (1, 2, 3): ");
                categoria = teclado.nextShort();
                System.out.print("Teclee sección (10, 50): ");
                seccion = teclado.nextShort();
                /*ventas=1000;
                km=500;
                categoria=2;
                seccion=10;*/
                Complementos comple= new Complementos(ventas,km,categoria,seccion);
                float totales= comple.CalculoComplemento();
                System.out.println("Cálculo del complemento a cobrar:"+totales);
                }
            catch (NumberFormatException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error en la conversión");
                error = true;
            } catch (InputMismatchException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error. El dato tecleado no es válido");
                error = true;
            } catch (Exception e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println(e.getMessage()); // Muestra el error
                error = true;
            }
        } while (error);
    }
}
