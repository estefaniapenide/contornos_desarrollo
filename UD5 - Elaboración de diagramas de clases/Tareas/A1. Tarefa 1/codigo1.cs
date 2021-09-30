using System;
using System.Windows.Forms;
namespace ClasesAbstractas
{
    abstract class FiguraGeometrica //Clase abstracta, Abastracción
    {
        public abstract double Area(); //Método abstarcto
    }    
   class Circulo : FiguraGeometrica //Clase, Herencia, Especialización
    {
        private int radio; //Atributo
        public int Radio //Propiedad, Encapsulamiento
        {
            get //Método
            {
                return radio;
            }
            set //Método
            {
                radio = value;
            }
        }
        public Circulo(int r) //Constructor
        {
            Radio = r;
        }
        public override double Area() //Método sobreescrito, Polimorfismo
        {
            return (double)(Radio * Radio * 3.14);
        }
    }
    class Triangulo : FiguraGeometrica //Clase, Herencia, Especialización
    {
        private int ladA; //Atributo
        private int ladB; //Atributo
        private int ladC; //Atributo
        public int LadoA //Propiedad, Encapsulamiento
        {
            get //Método
            {
                return ladA;
            }
            set //Método
            {
                ladA = value;
            }
        }
        public int LadoB //Propiedad, Encapsulamiento
        {
            get //Método
            {
                return ladB;
            }
            set //Método
            {
                ladB = value;
            }
        }
        public int LadoC //Propiedad, Encapsulamiento
        {
            get //Método
            {
                return ladC;
            }
            set //Método
            {
                ladC = value;
            }
        }
        public Triangulo(int a, int b, int c) //Constructor
        {
            LadoA = a;
            LadoB = b;
            LadoC = c;
        }
        public override double Area() //Método sobreescrito, Polimorfismo
        {
            double num, mPer;
            mPer = (double)(LadoA + LadoB + LadoC) / 2; //Envío de Mensajes
            num = mPer * (mPer - LadoA) * (mPer - LadoB) * (mPer - LadoC); //Envío de Mensajes
            if (num <= 0)
            {
                MessageBox.Show("posiblemente el triangulo no exista, inten-telo nuevamente"); //Envío de Mensajes
                return 0;
            }
            else
                return Math.Pow(num, 0.5); //Envío de Mensajes
        }
    }
    class Cuadrado : FiguraGeometrica //Clase, Herencia, Especialización
    {
        private int lado; //Atributo
        public int Lado //Propiedad, Encapsulamiento
        {
            get //Método
            {
                return lado;
            }
            set //Método
            {
                lado = value;
            }
        }
        public Cuadrado(int l) //Constructor
        {
            Lado = l;
        }
        public override double Area() //Método sobreescrito, Polimorfismo
        {
            return Lado * Lado;
        }
    }
}
