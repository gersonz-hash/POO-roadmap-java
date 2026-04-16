package enums;

public class EnumsEjercicio {
		enum Color{
			AZUL, VERDE, AMARILLO, ROSADO, NEGRO, BLANCO
		}
		public static void enumEjecutar() {
			for(Color col: Color.values()) {
				System.out.println("Color: "+col);	
			}
		Color color=Color.AZUL;
		
		//OBTIENE EL NOMBRE
		System.out.println("Nombre: "+color.name());
		
		//OBTIENE LA POSICION
		System.out.println("Posiión: "+color.ordinal());
		
		//Encontrar
		try {
		Color col=Color.valueOf( "ASUL");
		System.out.println("Encontre: "+col);
		}catch(IllegalArgumentException e) {
			System.out.println("ERROR. NO SE HA ENCONTRADO LO QUE USTED COLOCO...");
		}
}
}
