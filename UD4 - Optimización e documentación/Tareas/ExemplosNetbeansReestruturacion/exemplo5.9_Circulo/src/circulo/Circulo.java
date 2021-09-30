/*
 * Clase Empregado utilizada como exemplo para o
 * apartado 5.9 "Mover clase a outro package"
 * do documento "Reestruturar código Java con NetBeans"
 */
package circulo;

import java.util.Scanner;
/*
 * Para mover a clase Circulo ao package circulito,
 * -ponse o cursor dentro da clase Circulo
 * -elíxese Reestruturar->Mover... e
 * -elíxese o package Circulito.
 * Observar despois:
 * -En Circulo.java o cambio de package.
 * -En PruebaCirculo.java, a nova liña de import circulito.Circulo;
 * -No proxecto, a creación da nova carpeta Circulito con Circulo.java e a
 *  desaparición dese arquivo da carpeta Circulo
 */
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

    public void Mostrar() {
        System.out.println("El Radios es:" + Radio);
        System.out.println("El Area del Circulo es:" + Area);
    }
}