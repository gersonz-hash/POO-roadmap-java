package packageE;

public class PackageEjercicio {
	public static void ejecutar() {
		System.out.println("--------Ejercicio 1: contar paquete-----------");
		
		Package[]paquetes =Package.getPackages();
		
		//Mostrar los paquetes del proyecto 
		for (Package pkg : paquetes) {
			if(pkg.getName().startsWith(("typeCasting")) ||
					pkg.getName().startsWith("classesAndObjects")||
					pkg.getName().startsWith("packageE")||
					pkg.getName().startsWith("claseMain")){
				System.out.println("Paquete: "+pkg.getName());
				
			}
		}
		//Ejercicio 1
		int contador=0;
		
		for (Package pkg : paquetes) {  //sirve para revisar los paquetes uno a uno 
			if(pkg.getName().startsWith("typeCasting")||
			pkg.getName().startsWith("classesAndObjects")||
			pkg.getName().startsWith("packageE")||
			pkg.getName().startsWith("claseMain")){
				
				contador++;
			}
		}
		System.out.println("total de paquetes: "+contador);
	//EJERCICIO 2
		
		System.out.println("---------Ejercicio 2: Buscar paquete-----------");
	String buscar="classesAndObjects";
	boolean encontrado=false;
	
	for(Package pkg : paquetes) {
		if(pkg.getName().equals(buscar)) {  //el nombre del paquete es igual al que buscamos 
			encontrado=true;
			break; //lo que hace es dejar de buscar si lo encontro 
		}
	}
	if (encontrado) {
		System.out.println("eL PAQUETE "+ buscar + " SI existe");
	}else {
		System.out.println("eL PAQUETE "+ buscar + " No existe");
	}
	}
}


