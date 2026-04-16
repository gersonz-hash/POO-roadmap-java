package claseMain;

import typeCasting.EjerciciosTypeCasting;

import herencia.*;
import passByValue.Ejemplos;
import initializerBlock.Computadora;
import basicsOfOOP.Cuenta;
import conditionals.EjerciciosConditionals;
import accesSpecifiers.AccesSEjercicio;
import accesSpecifiers.AccesSEjercicio2;
import enums.EnumsEjercicio;
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
		
		System.out.println("\n**********ENUMS***************");
		EnumsEjercicio.enumEjecutar();
		
		System.out.println("\n************ACCESS SPECIFIERS***********");
		AccesSEjercicio.ejeEstudianteEjecutar();
		ejecutarEjercicio2();
		
		System.out.println("\n*************CONDITIONALS******************");
		EjerciciosConditionals.ejecutarConditionals();
		
		System.out.println("\n***************BASICS OF OOP***********");
		basicsOfOOPejercicio();
		
		System.out.println("*************INITIALIZER BLOCK**************");
		initializerComputadora();
		
		System.out.println("\n******************PASS BY VALUE*******************");
		Ejemplos.ejecutarPass();
		Ejemplos.ejecutarPass2();
		
		System.out.println("\n************HERENCIA***************");
		ejecutarHerencia();
		
		
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
		public static void ejecutarEjercicio2() {
			AccesSEjercicio2 c =new AccesSEjercicio2();
			
			c.marca="TOYOTA";
			c.acelerar(150);
			c.encender();
			c.acelerar(155);
			c.frenar(100);
			c.apagar();
			c.frenar(0);
			
			c.mostrarEstado();
		
		}
		public static void basicsOfOOPejercicio() {
			Cuenta c1 =new Cuenta();
			
			c1.nombre = "Gerson";
		    c1.saldo = 1000;

		    c1.mostrar();

		    c1.depositar(500);
		    c1.retirar(300);
		    c1.retirar(2000);
		    
		    c1.mostrar();
		}
		
		public static void initializerComputadora() {
		    Computadora c1 = new Computadora();
		    Computadora c2 = new Computadora();
		}
		public static void ejecutarHerencia() {
			Persona p=new Persona("Gerson", 18, 57621204);
			Empleado e=new Empleado("Pablo",19, 38383839, "Administrador");
			Doctor d=new Doctor("Marlon", 34, 8659590, "Dentista");
			
			p.mostrar();
			e.mostrar();
			d.mostrar();
			
		}

}
