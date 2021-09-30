/*
 * Subclase EmpregadoProducion utilizada como exemplo para o
 * apartado 5.10 "Copiar clase"
 * do documento "Reestruturar código Java con NetBeans"
 */
package empregado;

/*
 * Clase EmpregadoProducion que se vai copiar para crear EmpregadoDistribucion:
 * -no explorador de proxectos ilumínase a clase EmpregadoProduccion
 * -no menú Restructurar -> Copiar aparece un formulario onde pide o nome da nova clase
 * copiada.
*/
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
