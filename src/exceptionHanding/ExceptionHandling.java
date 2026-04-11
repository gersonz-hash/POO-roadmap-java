package exceptionHanding;
import java.util.Scanner;

public class ExceptionHandling {
	public static void ejecutar() {
		
		//EJERCICIO 1 CALCULADORA
		System.out.println("-------------CALCULADORA-------------");
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Ingrese el primer numero: ");
			int a=sc.nextInt();
			
			System.out.println("Ingrese el segundo numero: ");
			int b=sc.nextInt();
			
			System.out.println("Escoja la op(+, -, *, /)");
			char op=sc.next().charAt(0);
			
			int resultado;
			
			
			switch(op) {
			case '+':
				resultado=a+b;
				break;
			case '-':
				resultado=a-b;
				break;
			case '*':
				resultado=a*b;
				break;
			case '/':
				resultado=a/b;
				break;
				default:
					System.out.println("opcion no valida");
					return;
			}
			System.out.println("Resultado: "+resultado);
			
			
		}catch(ArithmeticException e) {
		    System.out.println("Error: no se puede dividir entre 0");
		}catch(Exception e){
		    System.out.println("ERROR: ENTRADA INVALIDA");
		}
		
		
		
		
		//EJERCICIO 2 SISTEMA DE REGISTRO 
		System.out.println("\n-----------SISTEMA DE REGISTRO--------------");
		try {
			sc.nextLine();
			System.out.println("Ingrese su nombre: ");
			String nombre=sc.nextLine();
			
			System.out.println("Ingrese su edad: ");
			int edad=sc.nextInt();
			
			
			System.out.println("Usuario registrado: ");
			System.out.println("Nombre: "+nombre);
			System.out.println("Edad: "+edad);
			
		}catch(Exception e) {
			System.out.println("ERROR: ");
		}
	}
	
}
