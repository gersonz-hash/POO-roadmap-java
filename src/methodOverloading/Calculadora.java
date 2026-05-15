package methodOverloading;

public class Calculadora {
	//METODO SUMA CON 2 ENTEROS
	public int suma(int a, int b) {
		return a + b;
		
	}
	//METODO SUMA CON 3 ENTEROS
	public int suma(int a, int b, int c) {
		return a + b + c;
		
	}
	//METODO SUMA CON DECIMAALES
	public double suma(double a, double b) {
		return a+b;
		
	}
}
