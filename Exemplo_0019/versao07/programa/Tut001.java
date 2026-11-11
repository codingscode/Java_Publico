package programa;

import java.util.ArrayList;
import java.util.Comparator;
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
		
		animais.sort(
		   Comparator.comparingInt(animal -> animal.getNome().length())
		);
		
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
tempo execução em ns: 11916228







List<Animal> animais = new ArrayList<>(Arrays.asList(
     new Animal("elefante"),
     new Animal("gato"),
     new Animal("boi"),
     new Animal("cachorro")
));

 
 
*/
