/*
 *Casos de prueba del proyecto interes
 */
package proyecto_interes;

import org.junit.Test;
import static org.junit.Assert.*;

public class InteresTest {

    @Test
    public void testC1() throws Exception {
        Interes instance = new Interes(1.4013E-045F,1.4013E-045F, 1);
        double result = instance.CalcularInteres();
        assertEquals(1.9636E-092, result, 0.0001);
    }

    @Test
    public void testC2() throws Exception {
        Interes instance = new Interes(1.4013E-045F,3.4028E+038F, 1);
        double result = instance.CalcularInteres();
        assertEquals(4.7683E-009, result, 0.0001);
    }

    @Test
    public void testC3() throws Exception {
        Interes instance = new Interes(3.4028E+038F,1.4000E-045F, 1);
        double result = instance.CalcularInteres();
        assertEquals(4.7639E-009, result, 0.0001);
    }
/* el resultado con más precisión */
    @Test
    public void testC4() throws Exception {
        Interes instance = new Interes(3.4028E+038F,3.4028E+038F, 1);
        double result = instance.CalcularInteres();
        assertEquals(1.1579047423430236E75, result,1);
    }

    @Test
    public void testC5() throws Exception {
        Interes instance = new Interes(1.4013E-045F,1.4013E-045F, 2147483647);
        double result = instance.CalcularInteres();
        assertEquals(4.2169E-083, result, 0.0001);
    }

    @Test
    public void testC6() throws Exception {
        Interes instance = new Interes(1.4013E-045F,3.4028E+038F, 2147483647);
        double result = instance.CalcularInteres();
        assertEquals(1.0230E+001, result, 0.01);
    }

    @Test
    public void testC7() throws Exception {
        Interes instance = new Interes(3.4028E+038F,1.4000E-045F, 2147483647);
        double result = instance.CalcularInteres();
        assertEquals(1.0230E+001, result, 0.01);
    }
/* el resultado con más precisión */
    @Test
    public void testC8() throws Exception {
        Interes instance = new Interes(3.4028E+038F,3.4028E+038F, 2147483647);
        double result = instance.CalcularInteres();
        assertEquals(2.486581498965392E84, result, 1);
    }
    @Test
    public void testC9() throws Exception {
        Interes instance = new Interes(3.4028E+038F,0F, 1);
        double result = instance.CalcularInteres();
        assertEquals(0, result, 0.0001);
    }
/*
    @Test
    public void testC10() throws Exception {
        System.out.print("Capital es una letra pero se obtiene resultado: ");
        Interes instance = new Interes('a', 0.01F, 1);
        System.out.printf("Interes= %g\n",instance.CalcularInteres());
    }
*/
    @Test(expected = Exception.class)
    public void testC11() throws Exception {
        Interes instance = new Interes(0F, 0.01F, 1);
        instance.CalcularInteres();
    }
/*
    @Test
    public void testC12() throws Exception {
        System.out.print("Rédito es una letra pero se obtiene resultado: ");
        Interes instance = new Interes(0.01F, 'a', 1);
        System.out.printf("Interes= %g\n",instance.CalcularInteres());
    }
*/
    /*
    @Test
    public void testC13() throws Exception {
        System.out.print("Tiempo es una letra pero se obtiene resultado: ");
        Interes instance = new Interes(0.01, 0.01F,'a');
        System.out.printf("Interes= %g\n",instance.CalcularInteres());
    }
*/
    @Test(expected = Exception.class)
    public void testC14() throws Exception {
        Interes instance = new Interes(0.01F, 0.01F, 0);
        instance.CalcularInteres();
    }
/*
    @Test
    public void testC15() throws Exception {
        Interes instance = new Interes(0.01F, 0.01F, 0.1);
        System.out.printf("Interes= %g\n",instance.CalcularInteres());
    }
*/
    @Test(expected = Exception.class)
    public void testC16() throws Exception {
        Interes instance = new Interes(-1F, 0.01F, 1);
        instance.CalcularInteres();
    }

    @Test(expected = Exception.class)
    public void testC17() throws Exception {
        Interes instance = new Interes(0.01F, 0.01F, -1);
        instance.CalcularInteres();
    }
}