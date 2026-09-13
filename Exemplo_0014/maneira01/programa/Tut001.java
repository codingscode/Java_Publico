package programa;

import java.util.Arrays;

public class Tut001 {
	
	static int[] juntar(int[] a1, int[] a2) {
		int s = 0;
		int t = a1.length + a2.length;
		
		for (int cada : a1) {
			for (int x : a2) {
				if (cada == x) s += 1;
			}
		}
		
		t -= s;
		int[] uni = new int[t];
		
		int i = 0;
		for (int cada : a1) {
			uni[i] = cada;
			i += 1;
		}
				
		for (int x : a2) {
			boolean b = true;
			for (int k : a1) {
				if (x != k) {
					b = b & true;
				}
				else {
					b = b & false;
                }
			}
			if (b) {
				uni[i] = x;
				i += 1;
			}
			else {
				continue;
			}
		}
		
		return uni;
	}
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		//uniao de dois arrays
		
		int[] a = {4, 3, 5, 10};
		int[] b = {8, 3, 5, 9}; 
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.out.println("união:");
		System.out.println(Arrays.toString(juntar(a, b)));
				
		
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
[4, 3, 5, 10]
[8, 3, 5, 9]
união:
[4, 3, 5, 10, 8, 9]
--------------------------
tempo execução em ms: 0





*/
