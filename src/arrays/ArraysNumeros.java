package arrays;

public class ArraysNumeros {
	public void arraysNum() {
		int[]numeros= {10, 20, 30, 40, 50};
		int[]num= new int[5];
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		for(int i=0; i<num.length; i++) {
			System.out.println("valor: "+num[i]);//sino hay más valores los coloca como 0
		}
		
			
		}
public void ejercicioArray() {
	  int[] numeros = {5, 80, 20, 100, 10};

      int mayor = numeros[0];

      for(int i = 0; i < numeros.length; i++) {

          if(numeros[i] > mayor) {

              mayor = numeros[i];
          }
      }

      System.out.println("Mayor: " + mayor);
  }
}
