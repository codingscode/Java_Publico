package programa;

import java.util.Arrays;

public class Tut001 {
	
	static int[] comum(int[] a, int[] b) {
		int c1 = 0;
		
		for (int a1 : a) {
			for (int b1 : b) {
				if (a1 == b1) {
					c1 += 1;
				}
			}
		}
		int[] junto = new int[c1];
		c1 = 0;
		
		for (int a1 : a) {
			for (int b1 : b) {
				if (a1 == b1) {
					junto[c1] = a1;
					c1 += 1;
				}
			}
		}
		return junto;
	}
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int[] lista1 = {4, 1, 5, 8, 3, 9, 6, 10};
		
		int[] lista2 = {20, 1, 2, 5, 9, 11, 6};
		
		
		System.out.println(Arrays.toString(lista1));
		System.out.println(Arrays.toString(lista2));
		
		System.out.println("o que há de comum nas listas:");
		System.out.println(Arrays.toString(comum(lista1, lista2)));
		
		
		System.out.println();
		
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
[4, 1, 5, 8, 3, 9, 6, 10]
[20, 1, 2, 5, 9, 11, 6]
o que há de comum nas listas:
[1, 5, 9, 6]

--------------------------
tempo execução em ms: 0




*/
