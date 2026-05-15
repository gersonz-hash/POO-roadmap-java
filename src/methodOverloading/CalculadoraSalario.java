package methodOverloading;

public class CalculadoraSalario {
	public double calcular(double salario) {
		return salario;
	}
	public double calcular(double salario, int bono) {
		return salario + bono;
	}
	public double calcular(double salario, double descuento) {
		return salario - descuento;
	}
}
