package programa;

import java.util.HashMap;

public class Tut001 {

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

        
		int[][] lista_arrays = {
		   {3, 4, 5},
		   {2, 1, 4},
		   {8, 4, 1},
		   {7, 3, 5},
		   {5, 1, 8},
		   {6, 9, 3}
		};
		
		HashMap<Integer, Integer> freq = new HashMap<>();
		
		for (int[] cada : lista_arrays) {
		   for (int n : cada) {
			  freq.put(n, freq.getOrDefault(n, 0) + 1);
		   }
		}
		
		for (Integer numero : freq.keySet()) {
		   System.out.print(numero);
		   System.out.print(" : ");
		   System.out.print(freq.get(numero));
		   System.out.println(" vezes");
		}
		

		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime);

		// milliseconds
		System.out.print("tempo execução em ns: ");
		System.out.println(duration);
	}

}

/*

1 : 3 vezes
2 : 1 vezes
3 : 3 vezes
4 : 3 vezes
5 : 3 vezes
6 : 1 vezes
7 : 1 vezes
8 : 2 vezes
9 : 1 vezes
--------------------------
tempo execução em ns: 2021123

 
 
*/
