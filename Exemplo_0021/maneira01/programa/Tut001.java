package programa;

public class Tut001 {
	
	
	static int fatorial(int num) {
		int x = num;
		int y = num;
		
		while (x > 1) {
			x -= 1;
			y *= x;
		}
		return y;
	}
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// fatorial de um numero
		int v1 = 4, v2 = 5, v3 = 6;		 
		
		System.out.print("fatorial de 4: ");
		System.out.println(fatorial(v1));
		System.out.print("fatorial de 5: ");
		System.out.println(fatorial(v2));
		System.out.print("fatorial de 6: ");
		System.out.println(fatorial(v3));
		
		
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
fatorial de 4: 24
fatorial de 5: 120
fatorial de 6: 720
--------------------------
tempo execução em ms: 0








*/
