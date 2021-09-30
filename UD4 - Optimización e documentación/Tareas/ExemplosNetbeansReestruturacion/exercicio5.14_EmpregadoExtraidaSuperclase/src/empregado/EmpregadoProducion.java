/*
 * Exemplo para o apartado 5.14 "Extraer superclase"
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
