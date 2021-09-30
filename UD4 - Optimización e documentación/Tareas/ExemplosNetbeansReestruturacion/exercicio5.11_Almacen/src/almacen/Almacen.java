/*
 * Clase Almacen utilizada como exemplo para o
 * apartado 5.11 "Mover clase de nivel interior a exterior"
 * do documento "Reestruturar código Java con NetBeans"
 */
package almacen;

/*
 * Clase que xestiona un array de obxectos dun almacen  a modo de inventario
*/
public class Almacen {
    Object [] listaObjetos;
    int numElementos = 0;

    Almacen (int maxElementos) {
        listaObjetos = new Object[maxElementos];
    }

    public Object get(int i) {
        return listaObjetos[i];
    }

    public void add(Object obj) {
        listaObjetos[numElementos++] = obj;
    }

    Iterador getIterador() {
        return new Iterador();
    }

    /*
     * Clase interna que ten o método "siguiente" que devolve en cada chamada
     * un obxecto dos gardados na lista do almacen ata chegar o final onde
     * devolve null
     * Iluminando esta clase Iterador e indo o menú "Reestructurar / Mover de
     * nivel interior a exterior" aparece un formulario que permite escoller
     * se cando esta clase xa non sexa interna vai ter un campo para poder facer
     * referencia ó obxecto de tipo Almacen do que recorre a lista de elementos
     * tamén permite especificar o nome que se lle dará a este campo, neste
     * caso "almacen" tamén crea un constructor na clase con un parámetro para
     * recibir o obxecto de tipo Almacen ó que fai referencia e inicializar o
     * campo na clase
     */
    class Iterador {
        int indice = 0;
        Object siguiente() {
            if (indice < numElementos) return listaObjetos[indice++];
            else return null;
        }
    }
}