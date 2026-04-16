package accesSpecifiers;

public class AccesSEjercicio {
		public String nombre;
		private double nota;
		protected String carrera;
		String universidad;
		
		public double getNota() {
			return nota;
		}

		public void setNota(double nota) {
			this.nota = nota;
		}

		public static void ejeEstudianteEjecutar() {
			AccesSEjercicio e =new AccesSEjercicio();
			
			e.nombre="Gerson";
			e.carrera="Ingenieria en Sistemas";
			e.universidad="UMG";
			
			e.setNota(90);
			
			System.out.println("NOMBRE: "+e.nombre);
			System.out.println("CARRERA: "+e.carrera);
			System.out.println("UNIVERSIDAD: "+e.universidad);
			System.out.println("NOTA: "+e.getNota());
			
			
		}
		
		
	
}
