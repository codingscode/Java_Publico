package programa;

import java.util.Arrays;

public class Tut001 {
	
	static int frequencia(int[] lst, int n) {
		int cont = 0;
		for(int cada : lst) {
		   if (cada == n) {
			   cont += 1;
		   }
		}
		return cont;
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//frequencia de um numero tal em uma array
        
        int[] lista = {8, 3, 8, 4, 1, 4, 7, 4};
		
		int numero = 4;
		
		System.out.println(Arrays.toString(lista));
		System.out.print("frequencia de ");
		System.out.print(numero);
		System.out.println(": ");
        System.out.println(frequencia(lista, numero));
		

		
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
[8, 3, 8, 4, 1, 4, 7, 4]
frequencia de 4: 
3
--------------------------
tempo execução em ns: 653929





 
 
*/
