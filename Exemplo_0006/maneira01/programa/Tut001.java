package programa;

import java.util.Arrays;

public class Tut001 {
	
	static boolean existe(int[] l, int[] s) {
		int c = 0;
		
		for (int cada : s) {
			for (int x : l) {
				if (cada == x) {
					c += 1;
				}
			}
		}
		if (c < s.length) {
			return false;
		}
		return true;
	}
	
	static boolean existe_subs(int[] l, int[][] subs) {
		for (int[] cada : subs) {
			if (existe(l, cada) == false) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int[] lista1 = {4, 1, 5, 8, 3};
		
		
		int[][] subs1 = {
			{1, 8},
			{4, 3},
			{5, 3},
			{4, 5}
		};
		
		int[][] subs2 = {
			{1, 3},
			{7, 2},
			{8, 3},
			{1, 5}
		};
		
		
		System.out.print("lista1: ");
		System.out.println(Arrays.toString(lista1));
		
		System.out.print("todos os subconjuntos subs1 estão em lista1 ? : ");
		System.out.println(existe_subs(lista1, subs1));
		
		System.out.print("todos os subconjuntos subs2 estão em lista1 ? : ");
		System.out.println(existe_subs(lista1, subs2));
		
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
lista1: [4, 1, 5, 8, 3]
todos os subconjuntos subs1 estão em lista1 ? : true
todos os subconjuntos subs2 estão em lista1 ? : false
--------------------------
tempo execução em ms: 0


*/
