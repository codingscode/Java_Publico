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
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int[] lista1 = {4, 1, 5, 8, 3};
		int[] lista2 = {3, 9, 7, 1, 10};
		
		int[] sub = {1,8};
		
		System.out.print("lista1: ");
		System.out.println(Arrays.toString(lista1));
		System.out.print("lista2: ");
		System.out.println(Arrays.toString(lista2));
		System.out.print("sub: ");
		System.out.println(Arrays.toString(sub));
		
		System.out.print("sub está em lista1 ? ");
		System.out.println(existe(lista1, sub));
		System.out.print("sub está em lista2 ? ");
		System.out.println(existe(lista2, sub));
				
		
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
lista2: [3, 9, 7, 1, 10]
sub: [1, 8]
sub está em lista1 ? true
sub está em lista2 ? false
--------------------------
tempo execução em ms: 0









*/
