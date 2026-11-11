package programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tut001 {
	
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// 
        
		List<Animal> animais = new ArrayList<>();
		
		animais.add(new Animal("hipopotamo"));
		animais.add(new Animal("tatu"));
		animais.add(new Animal("raposa"));
		animais.add(new Animal("borboleta"));
		animais.add(new Animal("aguia"));
		animais.add(new Animal("formiga"));
		
		System.out.println(animais);
		
		Collections.sort(animais);
		
		System.out.println(animais);
		
		
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
tempo execução em ns: 1241247







 
 
*/
