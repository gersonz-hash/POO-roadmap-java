package herencia;

public class Doctor extends Persona {
	private String especialidad;

	public Doctor(String nombre, int edad, int numero, String especialidad) {
		super(nombre, edad, numero);
		this.especialidad = especialidad;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Especialidad: "+especialidad);
	}
	

}
