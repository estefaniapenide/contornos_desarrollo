/* 
 * Programa C que suma os números enteiros do 1 ó 20
 */
#include <stdio.h>
#include <stdlib.h>
int main(int argc, char** argv) {
    int i;              /* contador de números enteiros */
    long int suma;      /* sumador dos números enteiros */
    int final;          
    suma = 0;
    for (i = 1; i <=20; i++) {
        suma = suma + i;
    }
    printf("Programa C\nA suma total e:  %ld\n", suma);
    printf("\nTeclee calquera numero para finalizar...");
    scanf("%d",&final);        
    fflush(stdin);
    return (EXIT_SUCCESS);
}


