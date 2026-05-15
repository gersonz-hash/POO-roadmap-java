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
import methodOverloading.*;
import stringAndMethods.*;
import mathOperations.*;
import arrays.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*****TYPE CASTING******");
		EjerciciosTypeCasting.ejecutar();
		
		System.out.println("\n********CLASES Y OBJETOS*******");
		Clases.ejecutar();
		
		System.out.println("\n********PACKAGE*********");
		PackageEjercicio.ejecutar();
		
		//System.out.println("\n**********EXCEPTION HANDING**********");
		//ExceptionHandling.ejecutar();
		
		//System.out.println("\n********ENCAPSULATION**********");
		//ejecutar();
		
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
		
		System.out.println("\n************OVERRIGIND/OVERLOADING***************");
		ejecutarEje1Overloading();
		
		System.out.println("\n************STRING AND METHODS***************");
		ejecutarStringAndMethods();
		
		System.out.println("\n************Math Operations***************");
		mathOperations();
		
		System.out.println("\n************ARRAYS**************");
		arrays();
		
		
		
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
		    System.out.println("");
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
		
		public static void ejecutarEje1Overloading() {
			Calculadora c= new Calculadora();
			Vehiculo v1=new Carro("Honda", 190, "4 ");
			Vehiculo v2=new Moto("Crf Honda", 100, "Automática" );
			
			
			System.out.println("---------EJERCICIO 1 Suma Numeros--------");
			System.out.println("Suma de 2 numeros enteros: "+c.suma(10, 20));
			System.out.println("Suma de 3 numeros enteros: "+c.suma(5, 10, 8));
			System.out.println("Suma de 2 numeros con decimales: "+c.suma(12.10, 5.25));
			 
			
			System.out.println("\n-------EJERCICIO 2 VEHICULO, MOTO, CARRO---------");
			System.out.println("*****Carro*****");
			v1.mostrarInformacion();
			v1.mover();
			
			System.out.println("*****MOTO*******");
			v2.mostrarInformacion();
			v2.mover();
			
			System.out.println("\n----------EJERCICIO 3. SISTEMA EMPLEADOS----------");
			Programador p=new Programador("Pedro", 5000, "Java");
			Diseñador d=new Diseñador("Marlon", 4000, "Photoshop");
			CalculadoraSalario cs= new CalculadoraSalario();
			
			System.out.println("----Programador----");
			p.mostrarInfo();
			p.trabajar();
			System.out.println("Salario actual: "+cs.calcular(5000));
			System.out.println("Salario + bono: "+cs.calcular(5000, 250));
			System.out.println("Salario menos el descuento: "+cs.calcular(5000.89, 500.50));
			
			
			System.out.println("\n----Diseñador----");
			d.mostrarInfo();
			d.trabajar();
			System.out.println("Salario actual: "+cs.calcular(4000));
			System.out.println("Salario + bono: "+cs.calcular(4000, 250));
			System.out.println("Salario menos el descuento: "+cs.calcular(4000.89, 50.50));
			
		}
		public static void ejecutarStringAndMethods() {
			System.out.println("---Metodos de String.---");
			MetodosString m1=new MetodosString();
			MetodosString m2=new MetodosString();
			MetodosString m3=new MetodosString();
			MetodosString m4=new MetodosString();
			MetodosString m5=new MetodosString();
			MetodosString m6=new MetodosString();
			MetodosString m7=new MetodosString();
			MetodosString m8=new MetodosString();
			
			
			System.out.println("Metodo 1 legth: ");
			m1.compilar();//Cuenta las letras 
			
			System.out.println("Metodo 2 toUpperCase:");
			m2.metodo2();//Convierte todas a mayusculas 
			
			System.out.println("Metodo 3 toLowerCase:");
			m3.metodo3();//convierte todas las letras a minusculas
			
			System.out.println("Metodo 4 equals:");
			m4.metodo4();//comparar textos
			
			System.out.println("Metodo 5 contains:");
			m5.metodo5();//busca una palabra o letra
			
			System.out.println("Metodo 6 charAt: ");
			m6.metodo6();//obtiene una letra específica
			
			System.out.println("Metodo 7 substring: ");
			m7.metodo7();//extrae parte del texto
			
			System.out.println("Metodo 8 replace: ");
			m8.metodo8();//reemplaza letras o palabras
		}
		
		public static void mathOperations() {
			Operaciones op=new Operaciones();
			op.operacionesMath();
			
		}
		public static void arrays() {
			ArraysNumeros a=new ArraysNumeros();
			
			
			System.out.println("Muestra en que posicion está cada uno...");
			a.arraysNum();
			
			System.out.println("---Ejercicio Array---");
			a.ejercicioArray();
		}
		
}
