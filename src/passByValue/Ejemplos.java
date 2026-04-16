package passByValue;

public class Ejemplos {
	public static void ejecutarPass(){
	int x=1;
	
	System.out.println("Antes: "+x);
	
	cambiar(x);
	
	
	}
	public static void cambiar(int x) {
		x=10;
		System.out.println("Dentro del metodo: "+x);
			
	}
	
	
	public static void ejecutarPass2() {
		int caja=5;
		System.out.println("\tEJEMPLO 2.");
		
		System.out.println("ANTES: "+caja);
		
		cambiar2(caja);
		
		
	}
	public static void cambiar2(int caja) {
		caja=2;
		System.out.println("Usando el metodo: "+caja);
	}
}
