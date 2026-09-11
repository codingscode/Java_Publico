package programa;

import java.util.Arrays;

public class Tut001 {
	
	
	static int[] divisores(int num) {
		int c = 1; // quantidade de divisores
		int i = 1;
		
		while (i<=num/2) {
			if (num % i == 0) {
				c += 1;
			}
			i += 1;
		}
		int[] div = new int[c];
		
		div[0] = num;
		c = 1;
				
		for (int d=num/2; d > 0; d--) {
			if (num % d == 0) {
				div[c] = d;
				c += 1;
			}
		}
		return div;
	}
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// divisores de um número
		
		
		int n1 = 10;
		int n2 = 7;
		int n3 = 12;
		int n4 = 21;
		
		System.out.print("divisores de ");
		System.out.print(n1);
		System.out.print(" : ");
		System.out.println(Arrays.toString(divisores(n1)));
		
		System.out.print("divisores de ");
		System.out.print(n2);
		System.out.print(" : ");
		System.out.println(Arrays.toString(divisores(n2)));
		
		System.out.print("divisores de ");
		System.out.print(n3);
		System.out.print(" : ");
		System.out.println(Arrays.toString(divisores(n3)));
		
		System.out.print("divisores de ");
		System.out.print(n4);
		System.out.print(" : ");
		System.out.println(Arrays.toString(divisores(n4)));
		
		
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
divisores de 10 : [10, 5, 2, 1]
divisores de 7 : [7, 1]
divisores de 12 : [12, 6, 4, 3, 2, 1]
divisores de 21 : [21, 7, 3, 1]
--------------------------
tempo execução em ms: 0




*/
