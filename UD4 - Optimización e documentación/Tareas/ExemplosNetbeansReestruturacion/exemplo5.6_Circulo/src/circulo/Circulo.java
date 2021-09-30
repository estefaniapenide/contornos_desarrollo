/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

/**
 *
 * @author usuario
 */
import java.lang.Math;
import java.util.Scanner;

public class Circulo {

    double Radio;
    double Area;
    Scanner L = new Scanner(System.in);

    public Circulo() {
        Radio = 0;
        Area = 0;
    }

    public void leerRadio() {
        System.out.println("Escribe el valor del Radio:");
        Radio = L.nextDouble();
    }

    public void Area() {
        Area = 3.1416 * Math.pow(Radio, 2);
    }

    /*
     * Se situamos o cursor no método Mostrar e imos o menú
     * Reestructurar/Eliminación segura, o tentar eliminalo facendo clic no
     * botón Vista previa avísa de que ten algunhas referencias.
     * Facendo clic no botón de Mostrar Usos avísa de que se está chamando
     * dende a clase PruebaCirculo e debemos eliminar antes esta referencia
     * antes de eliminar o método.
    */
    public void Mostrar() {
        System.out.println("El Radios es:" + Radio);
        System.out.println("El Area del Circulo es:" + Area);
    }
}