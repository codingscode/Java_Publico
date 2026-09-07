package programa;

public class Tut001 {
	
	static int maior_numero(int[] l) {
		int maior = l[0];
		
		for (int cada : l) {
		   if (maior < cada) {
			   maior = cada;
		   }
		}
		return maior;
	}
	
	static int menor_numero(int[] l) {
		int menor = l[0];
		
		for (int cada : l) {
		   if (menor > cada) {
			   menor = cada;
		   }
		}
		return menor;
	}
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int[] lista = {7, 3, 5, 10, 6};
		
		System.out.print("maior número: ");
		System.out.println(maior_numero(lista));
		System.out.print("maior número: ");
		System.out.println(menor_numero(lista));
		
		
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
maior número: 10
maior número: 3
--------------------------
tempo execução em ms: 0










*/
