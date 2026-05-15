package methodOverloading;

public class Empleadoo {
	private String nombre;
	private double salario;
	public Empleadoo(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}
	public void mostrarInfo() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Salario: "+salario);
	}
	public void trabajar() {
		System.out.println("El empleado está trabajadno...");
	}
}
