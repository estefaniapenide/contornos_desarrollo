/*
 * Superclase Empregado utilizada como exemplo para o
 * apartado 5.10 "Copiar clase"
 * do documento "Reestruturar código Java con NetBeans"
 */

package empregado;

public class Empregado {
    public String dni;
    public String nome;
    public int diasVacacions;

    public Empregado() {
    }

    public String getDni() {
        return dni;
    }

    public String getNome() {
        return nome;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
     * Para mover o método getDiasVacacions dende a superclase Empregado
     * a subclase Empregado iluminase getDiasVacacións e no menú opción
     * Reestructurar / Descender aparecerá un formulario que permitirá escoller
     * que membros mover, con getDiasVacacions xa escollido haberá que escoller
     * tamén setDiasVacacions e o campo diasVacacions
    */
    public int getDiasVacacions() {
        return diasVacacions;
    }

    public void setDiasVacacions(int diasVacacions) {
        this.diasVacacions = diasVacacions;
    }

}
