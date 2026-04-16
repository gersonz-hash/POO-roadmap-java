package herencia;

public class Empleado extends Persona{
	private String cargo;

	public Empleado(String nombre, int edad, int numero, String cargo) {
		super(nombre, edad, numero);
		this.cargo = cargo;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Cargo: "+cargo);
		
	}
	
}
