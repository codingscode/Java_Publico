package programa;

import java.util.Scanner;

public class Tut001 {
	
		
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// adivinhar número
		
		Scanner sc = new Scanner(System.in);
		int tentativas = 1;
		
		// de 1 a 20
		int aleatorio = 1 + (int)(Math.random()*20);
		
		System.out.println("adivinhe um número inteiro de 1 a 20");
		System.out.print("digite um número inteiro: ");
		int palpite = sc.nextInt();
		
		while (palpite != aleatorio) {
			if (aleatorio < palpite) {
				System.out.println("o número secreto é menor!\ntente outro: ");
				palpite = sc.nextInt();
				tentativas += 1;
			}
			else {
				System.out.println("o número secreto é maior!\ntente outro: ");
				palpite = sc.nextInt();
				tentativas += 1;
			}
		}
        		
		System.out.print("o número secreto é : ");
		System.out.println(palpite);
		System.out.print("número de tentativas : ");
		System.out.println(tentativas);
		
		sc.close();
		
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
adivinhe um número inteiro de 1 a 20
digite um número inteiro: 10
o número secreto é menor!
tente outro: 
5
o número secreto é menor!
tente outro: 
3
o número secreto é : 3
número de tentativas : 3
--------------------------
tempo execução em ms: 8076












*/
