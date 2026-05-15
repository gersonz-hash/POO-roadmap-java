package methodOverloading;

public class Carro extends Vehiculo{
	public String puertas;

	public Carro(String marca, int velocidad, String puertas) {
		super(marca, velocidad);
		this.puertas = puertas;
	}

	@Override
	public void mover() {
		System.out.println("El carro avanza en la carretera");
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Puertas: "+puertas);
	}
	
	
}
