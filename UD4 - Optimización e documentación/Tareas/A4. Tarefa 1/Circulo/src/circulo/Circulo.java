package circulo;

/**
 * Clase con los atributos, constructores y métodos necesarios para calcular las
 * carácteristicas básicas de un círculo.
 *
 * @author profesor
 */
public class Circulo {
//atributos

    /**
     * Constante que indica el valor mínimo que puede tener el radio. Tratándose
     * este de una longitud que por lo tanto no puede ser negativa, se le asigna
     * el valor 0.0.
     */
    public static final double MINIMO = 0.0;

    private int x;
    private int y;
    private double radio;

//constructores
    /**
     * Constructor vacío Circulo
     */
    public Circulo() {
    }

    /**
     * Constructor Circulo. Requiere las coordenadas del centro y la longitud
     * del radio.
     *
     * @param valorX Coordenada 'x' centro del círculo.
     * @param valorY Coordenada 'y' centro del círculo.
     * @param valorRadio Longitud del radio.
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        x = valorX;
        y = valorY;
        establecerRadio(valorRadio);
    }

//métodos
    /**
     * Establece la coordenada 'x' de la posición del centro del círculo.
     *
     * @param valorX Coordenada 'x' centro del círculo.
     */
    public void establecerX(int valorX) {
        x = valorX;
    }

    /**
     * Devuelve la coordenada 'x' de la posición del centro del círculo.
     *
     * @return Coordenada 'x' centro círculo
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Establece la coordenada 'y' de la posición del centro del círculo.
     *
     * @param valorY Coordenada 'y' centro del círculo.
     */
    public void establecerY(int valorY) {
        y = valorY;
    }

    /**
     * Devuelve la coordenada 'y' de la posición del centro del círculo.
     *
     * @return Coordenada 'y' centro circulo
     */
    public int obtenerY() {
        return y;
    }

    /**
     * Establece la longitud del radio dado por parámetro simpre que este sea
     * mayor que cero. Si se introduce un parámetro negativo, establece como
     * valor del radio cero.
     *
     * @param valorRadio Longitud del radio
     */
    public void establecerRadio(double valorRadio) {

        radio = (valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    /**
     * Devuelve el valor de la longitud del radio.
     *
     * @return Longitud del radio
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Devuelve el valor de la longitud del diámetro.
     *
     * @return Longitud del diámetro
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Obtiene el valor de la longitud de la circunferencia
     *
     * @return Longitud de la circunferencia
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Obtiene el valor del área del círculo.
     *
     * @return Área del círculo
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    /**
     * Sobreescribe el método toString devolviendo los valores de las
     * coordenadas del centro y la longitud del radio.
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }

    /**
     * Obtiene una nueva posición del centro del círculo (y por lo tanto del
     * círculo), moviendo las coordenadas según lo indicado por parámetros.
     *
     * @param trasladarx Desplaza la coordenada 'x' el valor indicado. Valor
     * positivo -> hacia la derecha. Valor negativo -> hacia la izquierda.
     * @param trasladary Desplaza la coordenada 'y' el valor indicado. Valor
     * positivo -> hacia arriba. Valor negativo -> hacia abajo.
     */
    public void trasladarCentro(int trasladarx, int trasladary) {
        x = x + trasladarx;
        y = y + trasladary;
    }
}
