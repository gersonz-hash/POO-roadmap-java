package basicsOfOOP;

public class Cuenta {
	public String nombre;
	 public double saldo;
	 
	public void depositar(double monto) {
		 saldo +=monto;
		 System.out.println("Depositaste: "+monto);
	 }
	public void retirar(double monto) {
		 if(monto<= saldo) {
			 saldo -=monto;
			 System.out.println("Retiraste: "+monto);
		 }else {
			 System.out.println("No tienes suficiente dinero...");
		 }
	 }
	public void mostrar() {
		 System.out.println("Dueño: "+nombre);
		 System.out.println("Saldo: "+saldo);
	 }
}
