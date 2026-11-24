
package programa;

public class Tut001 {


	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//
        
        char valor = 'c';
                
        // codigo unicode de 'c'
        System.out.println((int) valor);
        
        // codigo unicode de 'C'
        System.out.println((int) (String.valueOf(valor)).toUpperCase().charAt(0) );
        
        
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
99
67
--------------------------
tempo execução em ns: 870520









 
 
*/
