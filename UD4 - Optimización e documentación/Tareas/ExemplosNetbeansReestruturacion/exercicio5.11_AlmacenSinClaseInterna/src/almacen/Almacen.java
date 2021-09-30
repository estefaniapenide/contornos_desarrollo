
package almacen;

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
        return new Iterador(this);
    }
}