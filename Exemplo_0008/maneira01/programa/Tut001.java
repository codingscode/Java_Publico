package programa;

import java.util.Arrays;

public class Tut001 {
	
	
	
	static int[] comum(int[] l1, int[] l2) {
		int cont = 0;
		for (int cada : l1) {
			for (int i : l2) {
				if (i == cada) {
					cont += 1;
				}
			}
		}
		if (cont > 0) {
			int[] lst = new int[cont];
			cont = 0;
			for (int cada : l1) {
				for (int i : l2) {
					if (i == cada) {
						lst[cont++] = cada;
					}
				}
			}
			return lst;
		}
		int[] cm = {};
		return cm;
	}
	
	static int[] comum_todos(int[][] cjs) {
		int cont = 0;
		int[] algo = cjs[0];
		int[] sem = {};
		
		for (int[] cada : cjs) {
			algo = comum(cada, algo);
			cont = algo.length;
		}
		if (cont == 0) {
			return sem;
		}
		return algo;
	}
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// elementos comuns de uma lista de arrays
		
		
		int[][] muitos = {
			{2,3,4,5,6},
			{2,3,4,5,6},
			{1,5,6,7,3}
		};
		
		
		for (int[] sub : muitos) {
			System.out.println(Arrays.toString(sub));
		}
		
		
		//System.out.println(Arrays.toString(comum(a, b)));
		System.out.println("o que há de comum nesses subconjuntos:");
		System.out.println(Arrays.toString(comum_todos(muitos)));
		
		
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
[2, 3, 4, 5, 6]
[2, 3, 4, 5, 6]
[1, 5, 6, 7, 3]
o que há de comum nesses subconjuntos:
[5, 6, 3]
--------------------------
tempo execução em ms: 0







*/
