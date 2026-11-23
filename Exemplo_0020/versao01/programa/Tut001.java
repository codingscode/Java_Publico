package programa;

public class Tut001 {
	
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// 20
        String palavra = "borboleta";
        
        char c1 = 'b';
        
        String s1 = "leta";
        
        // borboleta contem 'b' ?
        System.out.println(palavra.contains(String.valueOf(c1)));
        // borboleta contem "leta"
        System.out.println(palavra.contains(s1));
		

		
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
--------------------------
tempo execução em ns: 374503













 
 
*/
