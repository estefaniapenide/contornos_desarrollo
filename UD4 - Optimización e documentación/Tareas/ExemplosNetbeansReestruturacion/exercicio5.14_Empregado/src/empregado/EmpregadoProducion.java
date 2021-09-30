/*
 * Exemplo para o apartado 5.14 "Extraer superclase"
 * do documento "Reestruturar código Java con NetBeans"
 */
package empregado;

/*
 * Clase EmpregadoProducion antes de extraer unha superclase Empregado
 * os campos nome, dni, diasVacacións e os métodos que os encapsulan trasladaranse
 * a superclase Empregado
*/
public class EmpregadoProducion
{
  public String nome;
  public String dni;
  public int diasVacacions;
  public String turno;

  public EmpregadoProducion(String nome, String dni, int diasVacacions, String turno)
  {
    this.nome=nome;
    this.dni=dni;
    this.diasVacacions=diasVacacions;
    this.turno = turno;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getDiasVacacions() {
        return diasVacacions;
    }

    public void setDiasVacacions(int diasVacacions) {
        this.diasVacacions = diasVacacions;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}
