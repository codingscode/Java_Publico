package programa;

public class Tut001 {
		
	static int mdc(int a, int b) {
	    a = Math.abs(a);
	    b = Math.abs(b);

	    while (b != 0) {
	        int resto = a % b;
	        a = b;
	        b = resto;
	    }

	    return a;
	}

	static int mmc(int a, int b) {
	    if (a == 0 || b == 0) {
	        return 0;
	    }

	    return Math.abs((a / mdc(a, b)) * b);
	}
		
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		//mdc(maior divisor comum) e mmc(minimo multiplo comum) entre dois números
		
		// mdc = 6, mmc = 120
		int n1 = 24; //2³ e 3
		int n2 = 30; // 2, 3, 5
				
		System.out.print(n1);
		System.out.print(" e ");
		System.out.println(n2);
		System.out.print("mdc: ");
		System.out.println(mdc(n1, n2));
		System.out.print("mmc: ");
		System.out.println(mmc(n1, n2));
		
		
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
24 e 30
mdc: 6
mmc: 120
--------------------------
tempo execução em ms: 0









*/
