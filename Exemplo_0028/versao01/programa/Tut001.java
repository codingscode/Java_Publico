
package programa;

public class Tut001 {

    static boolean e_bissexto(int ano) {
    	if (ano % 100 == 0) {
    		if ((ano/100)%4 == 0) {
    			return true;
    		}
    	}
    	else if (ano % 4 == 0 ) {
        	return true;
        }
    	return false;
    }
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
        // 
		// mostrar se um ano é bissexto
        
        int valor1 = 2000;
        int valor2 = 2028;
		int valor3 = 1900;
		int valor4 = 1996;
		int valor5 = 2003;
		
		System.out.println(e_bissexto(valor1));
		System.out.println(e_bissexto(valor2));
		System.out.println(e_bissexto(valor3));
		System.out.println(e_bissexto(valor4));
		System.out.println(e_bissexto(valor5));
		
        
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
true
true
false
true
false
--------------------------
tempo execução em ns: 456694






 
 
*/
