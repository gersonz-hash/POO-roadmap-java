package methodOverloading;

public class Diseñador extends Empleadoo{
	public String herramienta;

	public Diseñador(String nombre, double salario, String herramienta) {
		super(nombre, salario);
		this.herramienta = herramienta;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Herramienta: "+herramienta);
	}

	@Override
	public void trabajar() {
		System.out.println("El diseñador crea interfaces...");
	}
	
	
}
