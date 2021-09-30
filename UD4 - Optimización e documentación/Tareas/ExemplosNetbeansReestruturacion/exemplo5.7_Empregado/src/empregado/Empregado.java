/*
 * Superclase Empregado utilizada como exemplo para o
 * apartado 5.7 "Mover membros dunha clase a unha superclase"
 * do documento "Reestruturar código Java con NetBeans"
 */

package empregado;

public class Empregado {
    public String dni;
    public String nome;

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
}
