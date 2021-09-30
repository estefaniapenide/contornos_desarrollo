package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulo
 * @author profesor
 */
public class Circulo {
    public static final double MINIMO = 0.0;

    private int x;
    private int y;
    private double radio;

    public Circulo() {
    }

    public Circulo(int valorX, int valorY, double valorRadio) {
        x = valorX;
        y = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        x=valorX;
    }

    public int obtenerX() {
        return x;
    }

    public void establecerY(int valorY) {
        y=valorY;
    }

    public int obtenerY() {
        return y;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    public double obtenerRadio() {
        return radio;
    }

    public double obtenerDiametro() {
        return radio * 2;
    }

    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }

    public void trasladarCentro(int trasladarx, int trasladary){
        x=x + trasladarx;
        y=y + trasladary;
    }
}
