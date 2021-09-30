/*
 * Exemplo para o apartado 5.14 "Extraer superclase"
 * do documento "Reestruturar código Java con NetBeans"
 */

package empregado;

public class EmpregadoDistribucion extends Empregado
{
  public String region;

  public EmpregadoDistribucion(String nome, String dni, int diasVacacions, String region)
  {
    this.nome=nome;
    this.dni=dni;
    this.diasVacacions=diasVacacions;
    this.region = region;
  }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
