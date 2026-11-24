
package programa;

public class Tut001 {


	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//
        int numero = 374;
        
        String[] casas = {"unidade", "dezena", "centena", "unidade de milhar"};
        int i = 0;
        
        while(numero != 0) {
        	System.out.print(casas[i]);
        	System.out.print(": ");
        	System.out.println(numero % 10);
        	numero /= 10;
        	i += 1;
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
unidade: 4
dezena: 7
centena: 3
--------------------------
tempo execução em ns: 605385









 
 
*/
