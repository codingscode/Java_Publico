package programa;

public class Tut001 {
	
	static int ndigitos(int num) {
		int c = 0;
		int k = num;
		
		while (k > 0) {
			k /= 10;
			c += 1;
		}
		return c;
	}
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// contador de dígitos de número
		
		int a = 3490;
		int b = 13;
		int c = 8;
		
		System.out.print(a);
		System.out.print(", ");
		System.out.print(ndigitos(a));
		System.out.println(" digitos.");
		
		System.out.print(b);
		System.out.print(", ");
		System.out.print(ndigitos(b));
		System.out.println(" digitos.");
		
		System.out.print(c);
		System.out.print(", ");
		System.out.print(ndigitos(c));
		System.out.println(" digitos.");
				
		System.out.println();
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.print("tempo execução em ms: ");
		System.out.println(duration);
	}
	

}

/*
3490, 4 digitos.
13, 2 digitos.
8, 1 digitos.

--------------------------
tempo execução em ms: 0




*/
