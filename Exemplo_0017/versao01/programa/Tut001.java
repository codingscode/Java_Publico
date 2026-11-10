package programa;

import java.util.Arrays;

public class Tut001 {

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// ordenação de String
        
		String palavra = "Girafa";
				
		char[] sequencia = palavra.toCharArray();
		
		System.out.println(sequencia);
		
		// ordenação crescente
		Arrays.sort(sequencia);
		        
		System.out.println(sequencia);
		
		// ordenação decrescente
		char[] decres = new char[sequencia.length];
		
		int l = sequencia.length -1;
		int i = 0;
		
        while(l>=0) {
        	decres[i] = sequencia[l];
			i += 1;
			l -= 1;
        }
		
		System.out.println(decres);
					

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
Girafa
Gaafir
rifaaG
--------------------------
tempo execução em ns: 1070510






 
 
*/
