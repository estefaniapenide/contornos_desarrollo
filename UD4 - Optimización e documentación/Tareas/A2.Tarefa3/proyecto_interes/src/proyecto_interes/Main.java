/*****************************************************************************
 * Visualizar el interes simple que produce un capital (capital)
 * a un determinado tipo de interes (redito) anual expresado en tanto por ciento
 * y considerando el tiempo (tiempo) en años.
 * La formula es: interes= (capital*redito*tiempo)/100
 * autor: profesor
 ******************************************************************************/

package proyecto_interes;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("CÁLCULO DEL INTERÉS SIMPLE");
        Scanner teclado = new Scanner(System.in);
        boolean error;
        do{
            error=false;
            try{
                System.out.print("Teclee el capital>0: ");
                float capital = teclado.nextFloat();
                System.out.print("Teclee el rédito: ");
                float redito = teclado.nextFloat();
                System.out.print("Teclee el tiempo en años>0 y sin decimales: ");
                int tiempo = teclado.nextInt();
                Interes supuesto = new Interes(capital,redito,tiempo);
                double resultado = supuesto.CalcularInteres();
                supuesto.x=50;
                System.out.printf("El interés simple es %f: ",resultado);                
            }catch (NumberFormatException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error en la conversión");
                error = true;
            } catch (InputMismatchException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error. El dato tecleado no es válido");
                error = true;
            }catch(Exception e){
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println(e.getMessage()); // Muestra el error
                error=true;
            }
        }while(error);                
    }
}
