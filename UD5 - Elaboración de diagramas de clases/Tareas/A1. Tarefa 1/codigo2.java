class Clase1 { //Clase, Asociación(System)

	public void prueba() //Método, Encapsulación
	{
		System.out.println("\n Metodo sin Argumentos:()"); //Envío de Mensaje
	}
	public void prueba(int x) //Método sobrecargado, Encapsulación
	{
		System.out.print("\n Metodo con un Argumento:"); //Envío de Mensaje
		System.out.println(" x= " +x);//Envío de mensaje
	}
	public void prueba(double x, double y, double z) //Método sobrecargado, Encapsulación
	{
		System.out.print("\n Metodo con tres Argumentos:"); //Envío de mensaje
		System.out.println(" x= " +x+ "    y= " + y + "    z= " + z + "\n"); //Envío de mensaje
	}
}
class UsarClase1 { //Clase, Asociación(Clase 1)
		public static void main (String [] var) //Método estático, Encapsulación
		{
			Clase1 objeto= new Clase1(); //Instancia de un Objeto
			objeto.prueba(); //Envío de Mensaje
			objeto.prueba(30); //Envío de Mensaje
			objeto.prueba(-3.5,20.0,18.6); //Envío de mensaje
		}
}
