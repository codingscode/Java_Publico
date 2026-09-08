package programa;

import java.util.Arrays;

public class Tut001 {
	
	static float media(int[] lista) {
		float soma = 0;
		
		for (int cada : lista) {
			soma += cada;
		}
		return soma/lista.length;
	}
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int[] numeros = {4, 7, 2, 5};
		
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.print("média: ");
		System.out.println(media(numeros));
				
		
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
[4, 7, 2, 5]
média: 4.5
--------------------------
tempo execução em ms: 0




*/
