package programa;

import java.util.Arrays;
import java.util.Comparator;

public class Tut001 {
	
	

	static Comparator<String> peloComprimento = (s1, s2) -> {
        if (s1 == null) return s2 == null ? 0 : -1;
        if (s2 == null) return 1;
        return Integer.compare(s1.length(), s2.length());
    };
	
	
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
        
		
		Arrays.sort(animais, peloComprimento);
		
        
        
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
