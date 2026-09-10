package programa;

import java.util.Arrays;

public class Tut001 {
	
	static int[] n_pares(int[] lista) {
		int cont = 0;
		for (int cada : lista){
			if(cada % 2 == 0) {
				cont += 1;
			}
		}
		int[] pares = new int[cont];
		cont = 0;
		for (int cada : lista){
			if(cada % 2 == 0) {
				pares[cont] = cada;
				cont += 1;
			}
		}
		return pares;
	}
	
	static int[] n_impares(int[] lista) {
		int cont = 0;
		for (int cada : lista){
			if(cada % 2 == 1) {
				cont += 1;
			}
		}
		int[] impares = new int[cont];
		cont = 0;
		for (int cada : lista){
			if(cada % 2 == 1) {
				impares[cont] = cada;
				cont += 1;
			}
		}
		return impares;
	}
	
	static boolean e_primo(int num) {
		int c = 1;
		int i = num/2;
		
		while (i>0) {
			if(num % i == 0) {
				c += 1;
			}
			i -= 1;
		}
		if (c == 2) return true;
		
		return false;
	}
	
	static int[] n_primos(int[] lista) {
		int cont = 0;
		for (int cada : lista){
			if(e_primo(cada)) {
				cont += 1;
			}
		}
		int[] primos = new int[cont];
		cont = 0;
		for (int cada : lista){
			if(e_primo(cada)) {
				primos[cont] = cada;
				cont += 1;
			}
		}
		return primos;
	}
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// 
		
		int[] numeros = {10, 3, 7, 4, 8, 9, 15, 13, 18};
		
		int[] so_pares = n_pares(numeros);
		
		int[] so_impares = n_impares(numeros);
		
		int[] so_primos = n_primos(numeros);
		
		System.out.print("números: ");
		System.out.println(Arrays.toString(numeros));
		
		System.out.print("números pares: ");
		System.out.println(Arrays.toString(so_pares));
		System.out.print("quantidade: ");
		System.out.println(so_pares.length);
		
		System.out.print("números impares: ");
		System.out.println(Arrays.toString(so_impares));
		System.out.print("quantidade: ");
		System.out.println(so_impares.length);
		
		System.out.print("números primos: ");
		System.out.println(Arrays.toString(so_primos));
		System.out.print("quantidade: ");
		System.out.println(so_primos.length);
		
		
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
números: [10, 3, 7, 4, 8, 9, 15, 13, 18]
números pares: [10, 4, 8, 18]
quantidade: 4
números impares: [3, 7, 9, 15, 13]
quantidade: 5
números primos: [3, 7, 13]
quantidade: 3
--------------------------
tempo execução em ms: 0









*/
