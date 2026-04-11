package claseMain;

import typeCasting.EjerciciosTypeCasting;

import classesAndObjects.Clases;
import exceptionHanding.ExceptionHandling;
import packageE.PackageEjercicio;
import encapsulation.CuentaConPin;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*****TYPE CASTING******");
		EjerciciosTypeCasting.ejecutar();
		
		System.out.println("\n********CLASES Y OBJETOS*******");
		Clases.ejecutar();
		
		System.out.println("\n********PACKAGE*********");
		PackageEjercicio.ejecutar();
		
		System.out.println("\n**********EXCEPTION HANDING**********");
		ExceptionHandling.ejecutar();
		
		System.out.println("\n********ENCAPSULATION**********");
		ejecutar();
		
		
		}
	
		
		public static void ejecutar() {
			System.out.println("--------------CUENTA CON PIN----------");
			
			CuentaConPin cuenta=new CuentaConPin();
			
			cuenta.setTitular("Gerson");
			cuenta.setSaldo(15000.28);
			cuenta.setPin(260523);
			
			System.out.println("TITULAR: "+cuenta.getTitular());
			System.out.println("SALDO: "+cuenta.getSaldo());
			cuenta.retirar(1500.98, 260523);
			
	}
		

}
