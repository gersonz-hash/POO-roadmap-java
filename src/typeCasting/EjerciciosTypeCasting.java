package typeCasting;

public class EjerciciosTypeCasting {
	
	public static void ejecutar() {
		//Ejercicio 1 de int a double  
		
		int a =10;
		double b=a;
		System.out.println("Int a double: "+b);
		
		//Ejercicio 2 de double a int
		double x =10.54;
		int y= (int)x;
		System.out.println("Double a Int: "+y);
		
		//Ejercicio 3 de String a int
		String num="155";
		int valor=Integer.parseInt(num);
		System.out.println("String a int: "+valor);
		
		//Ejercicio 4 de int a String
		int n=30;
		String z =String.valueOf(n);
		System.out.println("Int a String: "+z);
		
		//Ejercicio de repaso 
		double precio=49.99;
		int preint=(int)precio;
		System.out.println("\n------------PRECIO-------------");
		System.out.println("\tEl precio Decimal es: "+precio);
		System.out.println("\tEl precio entero es: "+preint);
		
		
		
		
		
		
	}
}
