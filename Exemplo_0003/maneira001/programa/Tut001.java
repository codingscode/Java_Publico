package programa;

import java.util.Arrays;

public class Tut001 {
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int[] array = {7, 3, 8, 1, 5, 9, 2};
		
		if ((array.length) % 2 == 1) {
			int indice_meio = (int) Math.floor(array.length/2.0);
			
			System.out.println(Arrays.toString(array));
			System.out.print("termo do meio: ");
			System.out.println(array[indice_meio]);
			
			System.out.print("indice: ");
			System.out.println(indice_meio);
		}
		else {
			System.out.println("o array não tem termo do meio.");
		}
		
		
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
[7, 3, 8, 1, 5, 9, 2]
termo do meio: 1
indice: 3
--------------------------
tempo execução em ms: 0










*/
