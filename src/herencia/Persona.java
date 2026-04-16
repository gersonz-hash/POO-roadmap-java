package herencia;

public class Persona {
	protected String nombre;
	protected int edad;
	protected int numero;
	
	public Persona(String nombre, int edad, int numero) {
		this.nombre = nombre;
		this.edad = edad;
		this.numero = numero;
	}
	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Numero: "+numero);
	}
	
}
