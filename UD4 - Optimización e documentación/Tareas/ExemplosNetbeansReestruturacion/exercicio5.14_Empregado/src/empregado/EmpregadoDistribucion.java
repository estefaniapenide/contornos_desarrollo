/*
 * Exemplo para o apartado 5.14 "Extraer superclase"
 * do documento "Reestruturar código Java con NetBeans"
 */

package empregado;

/*
 * Clase EmpregadoDistribucion antes de extraer unha superclase Empregado
 * os campos nome, dni, diasVacacións e os métodos que os encapsulan trasladaranse
 * a superclase Empregado
*/
public class EmpregadoDistribucion
{
  public String nome;
  public String dni;
  public int diasVacacions;
  public String region;

  public EmpregadoDistribucion(String nome, String dni, int diasVacacions, String region)
  {
    this.nome=nome;
    this.dni=dni;
    this.diasVacacions=diasVacacions;
    this.region = region;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
