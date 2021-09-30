/* 
 * Programa C++ que suma os números enteiros do 1 ó 20
 */
#include <iostream>
int main(int argc, char**argv) {
    int i;              /* contador de números enteiros */
    long int suma;      /* sumador dos números enteiros */
    suma = 0;
    for (i = 1; i <=20; i++) {
        suma = suma + i;
    }
    std::cout <<"A suma total e "<< suma<< std::endl;
    return 0;
}

