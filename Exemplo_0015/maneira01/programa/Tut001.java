package programa;

import java.util.Arrays;

public class Tut001 {
	
	static int[] diferenca(int[] c1, int[] c2) {
		int tam = c1.length;
		int cm = 0;
		int i = 0;
		
		for (int cada : c1) {
			for (int x : c2) {
				if (cada == x) {
					cm += 1;
				}
			}
		}
		tam -= cm;
		
		if (cm == 0) {
			return c1;
		}
		
		int[] novo = new int[tam];
		for (int cada : c1) {
			boolean b = true;
			for (int x : c2) {
				if (cada == x) {
					b = b & false;
				}
			}
			if (b) {
				novo[i] = cada;
				i += 1;
			}
		}
		return novo;
	}
	
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// diferença entre c1 e c2
		// c1 - c2
				
		
		int[] a = {4, 3, 5, 10};
		int[] b = {8, 3, 5, 9}; 
		
		System.out.print("c1: ");
		System.out.println(Arrays.toString(a));
		System.out.print("c2: ");
		System.out.println(Arrays.toString(b));
		
		System.out.println("c1 - c2: ");
		System.out.println(Arrays.toString(diferenca(a, b)));
		System.out.println("c2 - c1: ");
		System.out.println(Arrays.toString(diferenca(b, a)));
		
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
c1: [4, 3, 5, 10]
c2: [8, 3, 5, 9]
c1 - c2: 
[4, 10]
c2 - c1: 
[8, 9]
--------------------------
tempo execução em ms: 0


*/
