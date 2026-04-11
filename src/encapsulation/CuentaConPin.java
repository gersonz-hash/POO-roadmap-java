package encapsulation;

public class CuentaConPin {
	private String titular;
	private double saldo;
	private int pin;
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void retirar(double monto, int pinIngresado) {
		if(pin==pinIngresado) {
		if(monto<=saldo) {
			saldo =saldo-monto;
			System.out.println("Retiro exitoso. nuevo saldo: "+saldo);
			
		}else {
			System.out.println("DINERO INSUFICIENTE");
		}
		}else {
			System.out.println("Pin incorrecto. ");
		}
	}
}
