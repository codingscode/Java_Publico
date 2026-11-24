
package programa;

public class Tut001 {


	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//
        int n1 = 3;
        int n2 = 7;
        
        
        System.out.print("n1: ");
        System.out.print(n1);
        System.out.print(" n2: ");
        System.out.println(n2);
		
        int temp = n1;
        n1 = n2;
        n2 = temp;
        
        System.out.print("n1: ");
        System.out.print(n1);
        System.out.print(" n2: ");
        System.out.println(n2);
		
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
n1: 3 n2: 7
n1: 7 n2: 3
--------------------------
tempo execução em ns: 549180





 
 
*/
