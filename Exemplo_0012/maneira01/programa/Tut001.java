package programa;

import java.util.Arrays;

public class Tut001 {
		
	
		
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// array ordenado
		int[] lista = {7, 3, 5, 9, 2};
		
		System.out.println(Arrays.toString(lista));
		
		Arrays.sort(lista);
		
		System.out.println(Arrays.toString(lista));
			
		
		
		
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
[7, 3, 5, 9, 2]
[2, 3, 5, 7, 9]
--------------------------
tempo execução em ms: 1








*/
