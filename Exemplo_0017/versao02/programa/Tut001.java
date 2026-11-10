package programa;

import java.util.Arrays;




public class Tut001 {
	
	public static String ordenar(String valor) {
		char[] caracts = valor.toCharArray();
		
		Arrays.sort(caracts);
		
		return new String(caracts);
	}
	
	public static String ordenarDecres(String valor) {
        char[] caracts = valor.toCharArray();
		
		Arrays.sort(caracts);
		
		char[] dec = new char[caracts.length];
		
		for(int i=0;i<caracts.length;i++) {
			dec[i] = caracts[caracts.length-1-i];
		}
		
		return new String(dec);
	}

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// ordenação de String
        
		String palavra = "Girafa";
				
		
        System.out.println(palavra);
        
        System.out.println(ordenar(palavra));
		
        System.out.println(ordenarDecres(palavra));
					

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
tempo execução em ns: 1163696








 
 
*/
