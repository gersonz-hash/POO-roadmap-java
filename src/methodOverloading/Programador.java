package methodOverloading;

public class Programador extends Empleadoo {
	public String lenguaje;

	public Programador(String nombre, double salario, String lenguaje) {
		super(nombre, salario);
		this.lenguaje = lenguaje;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Lenguaje: "+lenguaje);
	}

	@Override
	public void trabajar() {
	System.out.println("El programador escribe codigo...");
	}
	
}
