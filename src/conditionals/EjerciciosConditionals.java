package conditionals;

public class EjerciciosConditionals {
	public static void ejecutarConditionals() {
		System.out.println("------------Numero");
		int num=5;
			if(num>0) {
				System.out.println("El numero es positivo");
			}else if(num<0) {
				System.out.println("El numero es Negativo");
			}else {
				System.out.println("El numero es cero");
			}
		System.out.println("Numero: "+num);
		
		
		//SEGUNDO EJERCICIO EDAD
		System.out.println("--------------EDAD---------------");
		int edad=18;
		if(edad>=0 && edad<13) {
			System.out.println("NIÑO");
				
			}else if(edad>=13 && edad<=18) {
				System.out.println("Adolecente");
		}else {
			System.out.println("Adulto");
		}
			System.out.println("Tiene : "+edad+ " Años");
			
			//TERCER EJERCICIO NOTA
		System.out.println("----------NOTA--------------");
		int nota=89;
			if(nota>=90 && nota<=100) {
				System.out.println("Excelente");
			}else if(nota>=70 && nota<=89){
				System.out.println("Aprobado");
			}else if(nota <70 && nota>0) {
				System.out.println("Reprobado");
			}else {
				System.out.println("Numero fuera de rango");
			}
			System.out.println("Su nota fue de: "+nota);
			
			//CUARTO EJERCICIO SWITCH
		System.out.println("------------DIAS DE LA SEMANA------------");
		int dia=6;
		try {
		switch(dia) {
		case 1: System.out.println("Lunes"); break;
		case 2: System.out.println("Martes");  break;
		case 3: System.out.println("Miercoles"); break;
		case 4: System.out.println("Jueves"); break;
		case 5: System.out.println("Viernes"); break;
		case 6: System.out.println("Sabado"); break;
		case 7: System.out.println("Domingo"); break;
		default: System.out.println("Seleccione un numero valido... "); return;
		}
		}catch(Exception e){
			System.out.println("ERROR. ");
		}
		System.out.println("Dia NO. "+dia);
	}
}
