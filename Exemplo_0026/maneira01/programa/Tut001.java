package programa;

import java.util.Arrays;
import java.util.Locale;

public class Tut001 {

	static int[] inverso(int[] amostra) {
		int tam = amostra.length;
		int[] novo = new int[amostra.length];
		
		for (int i=0; i<tam; i++) {
			novo[i] = amostra[tam-1-i];
		}
		return novo;
	}
	
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		Locale.setDefault(Locale.US);

		//inverso de um array
		
		int[] numeros = {7, 3, 5, 1, 8, 4};
		
		System.out.println("array:");
		System.out.println(Arrays.toString(numeros));
		System.out.println("array inverso:");
		System.out.println(Arrays.toString(inverso(numeros)));
		

		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.print("tempo execução em ms: ");
		System.out.println(duration);
	}

}

/*
array:
[7, 3, 5, 1, 8, 4]
array inverso:
[4, 8, 1, 5, 3, 7]
--------------------------
tempo execução em ms: 0




 
 
 
*/
