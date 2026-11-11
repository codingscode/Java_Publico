package programa;

import java.util.Arrays;
import java.util.Comparator;

public class Tut001 {
	
	

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// 
        
		String[] animais = {
		  "hipopotamo",
		  "tatu",
		  "raposa",
		  "borboleta",
		  "aguia",
		  "formiga"
		};
		
		System.out.println(Arrays.toString(animais));
        
		// nao eficiente
		Arrays.sort(animais, Comparator.comparingInt(String::length)); 
		
		//reverso
        //Arrays.sort(animais, Comparator.comparingInt(String::length).reversed());
        
        
		System.out.println(Arrays.toString(animais));
					

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
[hipopotamo, tatu, raposa, borboleta, aguia, formiga]
[tatu, aguia, raposa, formiga, borboleta, hipopotamo]
--------------------------
tempo execução em ns: 576005



















 
 
*/
