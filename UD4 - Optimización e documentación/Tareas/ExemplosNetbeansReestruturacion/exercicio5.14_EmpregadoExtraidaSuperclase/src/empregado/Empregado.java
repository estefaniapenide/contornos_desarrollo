/*
 * Exemplo para o apartado 5.14 "Extraer superclase"
 * do documento "Reestruturar código Java con NetBeans"
 */

package empregado;

/*
 * Superclase Empregado resultante da reestruturación dos campos e métodos
 * comúns a EmpregadoDistribución e EmpregadoProducion
 */
public class Empregado {
    public int diasVacacions;
    public String dni;
    public String nome;

    public Empregado() {
    }

    public int getDiasVacacions() {
        return diasVacacions;
    }

    public String getDni() {
        return dni;
    }

    public String getNome() {
        return nome;
    }

    public void setDiasVacacions(int diasVacacions) {
        this.diasVacacions = diasVacacions;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
