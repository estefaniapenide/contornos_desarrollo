package almacen;

class Iterador {

    int indice = 0;
    Almacen almacen;

    Iterador(Almacen almacen) {
        super();
        this.almacen = almacen;
    }

    Object siguiente() {
        if (indice < almacen.numElementos) {
            return almacen.listaObjetos[indice++];
        } else {
            return null;
        }
    }
}
