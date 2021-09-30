/*
 * Exemplo para o apartado 5.13 "Extraer interface"
 * do documento "Reestruturar código Java con NetBeans"
 */
package circulo;

import java.util.Scanner;

/*
 * A clase Circulo pasa automáticamente a implementar ó interface extraido
 * Superficie, agora este interface xa se podería usar noutras clases
 */
public class Circulo implements Superficie {

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