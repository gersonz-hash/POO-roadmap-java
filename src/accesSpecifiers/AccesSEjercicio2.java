package accesSpecifiers;

public class AccesSEjercicio2 {
	public String marca;
	private int velocidad;
	private boolean encendido;
	
	public void encender() {
		if(encendido=true) {
			System.out.println("Vehiculo encendido");
		}else {
			System.out.println("Vehículo apagado");
		}
	}
	public void apagar() {
		if(velocidad==0) {
			encendido=false;
			System.out.println("\nNo puedes apagar el vehículo en movimiento");
		}else {
			System.out.println("Puedes apagar el vehículo");
		}
	}
	public void acelerar(int incremento) {
		if(encendido) {
			velocidad +=incremento;
		}else {
			System.out.println("\nNo puedes acelerar el vehiculo esta apagado... ");
		}
	}
	public void frenar(int decremento) {
		velocidad -=decremento;
		if(velocidad < 0) {
			velocidad =0;
		}
	}
	public void mostrarEstado() {
		System.out.println("MARCA: "+marca);
		System.out.println("Velocidad: "+velocidad);
		System.out.println("Encendido: "+encendido);
	}
}
