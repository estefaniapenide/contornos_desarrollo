package parimpar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short n; 
        
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Teclee o número enteiro entre %d e %d:", Short.MIN_VALUE, Short.MAX_VALUE);
        n = teclado.nextShort();
        if(n%2==0){
            System.out.printf("%d é par\n",n);
        }
        else{
            System.out.printf("%d é impar\n",n);
        }System.out.println();
        
        
    }
}
