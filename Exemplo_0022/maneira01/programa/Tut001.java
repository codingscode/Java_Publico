package programa;

public class Tut001 {
	
	
	static int inverso(int numero) {
		int k = numero;
		int i = 0;
		
		while (k > 0) {
			i = i*10 + (k % 10);
			k /= 10;
		}
		return i;
	}
		
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// inverso de um numero;
        int n1 = 743;
        int n2 = 1642;
        int n3 = 85;
		
        
        System.out.print("o inverso de ");
        System.out.print(n1);
        System.out.print(": ");
        System.out.println(inverso(n1));
                
        System.out.print("o inverso de ");
        System.out.print(n2);
        System.out.print(": ");
        System.out.println(inverso(n2));
        
        System.out.print("o inverso de ");
        System.out.print(n3);
        System.out.print(": ");
        System.out.println(inverso(n3));
        
		
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
o inverso de 743: 347
o inverso de 1642: 2461
o inverso de 85: 58
--------------------------
tempo execução em ms: 0











*/
