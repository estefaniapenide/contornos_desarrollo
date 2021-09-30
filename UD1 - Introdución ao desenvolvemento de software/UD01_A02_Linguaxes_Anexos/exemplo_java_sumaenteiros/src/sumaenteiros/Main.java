package sumaenteiros;
/*
 * File: Main.java
 * Author: profesor
 * Date: 14/08/2011 12:25:00
 * Obxectivo: visualizar a suma dos 20 primeiros números naturais
 */
public class Main {

    public static void main(String[] args) {
        int suma=0;     /* sumador dos números enteiros */
        for (int i=1;i<=20;i++)    
        {
            suma=suma+i;
        }
        System.out.printf("Exemplo Java\n");
        System.out.printf("Suma dos 20 primeiros números naturais = %d\n",suma);
    }
}
