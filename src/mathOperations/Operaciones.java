package mathOperations;

public class Operaciones {
	public void operacionesMath() {
		int a=20;
		int b=5;
		
		System.out.println("Suma: "+(a+b));
		System.out.println("Resta: "+(a-b));
		System.out.println("Multiplicacion: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Modulo: "+(a%b));
		System.out.println("Potencia: "+Math.pow(2, 3));
		System.out.println("Raiz Cuadrada: "+Math.sqrt(81));
		System.out.println("Valor Absoluto: "+Math.abs(-5));
		System.out.println("Mayor Numero: "+Math.max(500, 501));
		System.out.println("Menor Numero: "+Math.min(450, 400));
		System.out.println("Redondea Numeros: "+Math.round(5.9));
		
		int numero=(int)(Math.random()*10)+1;//numero aleatorio entre 0 a 10
		System.out.println("Numero Aleatorio: "+numero);
	}
	

}
