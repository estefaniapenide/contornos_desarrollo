/*
 * Subclase EmpregadoProducion da superclase Empregado utilizada como exemplo para o
 * apartado 5.7 "Mover membros dunha clase a unha superclase"
 * do documento "Reestruturar código Java con NetBeans"
 */
package empregado;


public class EmpregadoProducion extends Empregado
{
    public String turno;
    public int diasVacacions;

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

    /*
     * Para mover o método getDiasVacacions dende a subclase EmpregadoProducion
     * a superclase Empregado iluminase getDiasVacacións e no menú opción
     * Reestructurar / Ascender aparecerá un formulario que permitirá escoller
     * que membros mover, con getDiasVacacions xa escollido haberá que escoller
     * tamén setDiasVacacions e o campo diasVacacions.
    */
    public int getDiasVacacions() {
        return diasVacacions;
    }

    public void setDiasVacacions(int diasVacacions) {
        this.diasVacacions = diasVacacions;
    }

}
