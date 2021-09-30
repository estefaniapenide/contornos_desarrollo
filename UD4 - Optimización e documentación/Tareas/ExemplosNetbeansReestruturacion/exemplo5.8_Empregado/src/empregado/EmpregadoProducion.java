/*
 * Subclase EmpregadoProducion da superclase Empregado utilizada como exemplo para o
 * apartado 5.8 "Mover membros dunha clase a unha subclase"
 * do documento "Reestruturar código Java con NetBeans"
 */
package empregado;

public class EmpregadoProducion extends Empregado
{
    public String turno;

  public EmpregadoProducion(String nome, String dni, int diasVacacions, String turno)
  {
    this.nome=nome;
    this.dni=dni;
    this.diasVacacions=diasVacacions;
    this.turno = turno;
  }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}
