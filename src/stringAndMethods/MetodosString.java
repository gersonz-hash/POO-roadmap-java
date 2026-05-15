package stringAndMethods;

public class MetodosString {
	public void compilar() {
		 String texto="Hola";
		 
		 System.out.println(texto.length());
	}
	public void metodo2() {
		String nombre ="Gerson";
		
		System.out.println(nombre.toUpperCase());
	}
	public void metodo3() {
		String saludo="HOLA";
		
		System.out.println(saludo.toLowerCase());
	}
	public void metodo4() {
		String a="Hola";
		String b="Hola";
		
		System.out.println(a.equals(b));
	}
	public void metodo5() {
		String texto="Hola Mundo";
		
		System.out.println(texto.contains("Mundo"));
	}
	public void metodo6() {
		String nombre="Gerson";
		
		System.out.println(nombre.charAt(4));
	}
	public void metodo7() {
		String texto="Programación";
		
		System.out.println(texto.substring(0, 6));
	}
	public void metodo8() {
		String txt="Hola";
		
		System.out.println(txt.replace("Hola", "Adios"));
	}
}
