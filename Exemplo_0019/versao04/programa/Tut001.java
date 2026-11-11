package programa;

import java.util.Arrays;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// 
        
		Animal[] animais = {
		  new Animal("hipopotamo"),
		  new Animal("tatu"),
		  new Animal("raposa"),
		  new Animal("borboleta"),
		  new Animal("aguia"),
		  new Animal("formiga")
		};

		Arrays.sort(animais);
		
		for (Animal cada : animais) {
			System.out.println(cada.getNome());
		}
					

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
tatu
aguia
raposa
formiga
borboleta
hipopotamo
--------------------------
tempo execução em ns: 1184183





















 
 
*/
