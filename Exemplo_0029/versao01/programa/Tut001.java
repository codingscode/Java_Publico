
package programa;

import java.text.ParseException;


public class Tut001 {


	
	public static void main(String[] args) throws ParseException {
		long startTime = System.nanoTime();
        // 29
		// converter tipo char valor '5' para tipo valor int imprimindo como 5 int
        char valchar = '5';
        
        int valint = valchar - '0';
		
		System.out.println(valchar);
		System.out.println(valint);
		
        
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
5
5
--------------------------
tempo execução em ns: 384598






 
 
*/
