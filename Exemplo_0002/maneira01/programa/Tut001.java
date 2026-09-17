package programa;

import java.util.Arrays;

public class Tut001 {
	
	static int nmaior(int[] amostra, int o) {
		Arrays.sort(amostra);
		int[] reverso = new int[amostra.length];
		
		for (int i=0; i<reverso.length; i++) {
			reverso[i] = amostra[reverso.length-1-i];
		}
		
		if (o > reverso.length) {
			System.out.println("nao é possível");
			return 0;
		}
		return reverso[o-1];
	}
	
		
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// mostrar o 1º, 2º e 3º de uma lista
		
		int[] numeros = {3, 6, 2, 1, 5};
				
		System.out.println(Arrays.toString(numeros));
		System.out.print("1º maior: ");
		System.out.println(nmaior(numeros, 1));
		System.out.print("2º maior: ");
		System.out.println(nmaior(numeros, 2));
		System.out.print("3º maior: ");
		System.out.println(nmaior(numeros, 3));
		
		
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
[3, 6, 2, 1, 5]
1º maior: 6
2º maior: 5
3º maior: 3
--------------------------
tempo execução em ms: 1




*/
