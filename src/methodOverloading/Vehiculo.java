package methodOverloading;

public class Vehiculo {
	private String marca;
	private int velocidad;
	public Vehiculo(String marca, int velocidad) {
		this.marca = marca;
		this.velocidad = velocidad;
	}
	public void mostrarInformacion() {
		System.out.println("Marca: "+marca);
		System.out.println("Velocidad: "+velocidad);
	}
	public void mover() {
		System.out.println("El vehiculo se mueve...");
	}
}
