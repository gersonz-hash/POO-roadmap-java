package methodOverloading;

public class Moto extends Vehiculo {
	public String tipo;

	public Moto(String marca, int velocidad, String tipo) {
		super(marca, velocidad);
		this.tipo = tipo;
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Tipo: "+tipo);
	}

	@Override
	public void mover() {
		System.out.println("La moto se mueve por la carretera...");
	}
	

}
