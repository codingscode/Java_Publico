package programa;

import java.util.Arrays;

public class Tut001 {

	
	static int[] mais_1(int[] amostra) {
		int[] novo = new int[amostra.length];
		int i = 0;
		
		for (int cada : amostra) {
			novo[i] = cada + 1;
			i += 1;
		}
		return novo;
	}
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//Locale.setDefault(Locale.US);
        
		int[] lista = {7, 2, 5, 10, 9, 4};
		
		
		System.out.println(Arrays.toString(lista));

		System.out.println("novo array:");
		System.out.println(Arrays.toString(mais_1(lista)));
		

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
[7, 2, 5, 10, 9, 4]
novo array:
[8, 3, 6, 11, 10, 5]
--------------------------
tempo execução em ms: 0





 
 
 
*/
