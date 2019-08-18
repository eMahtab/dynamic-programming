package net.mahtabalam.dp2.tabulation;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	public static long calls = 0;
	public static Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		// Fibonacci Series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ..
		long start = System.currentTimeMillis();
		int nthFibonacci = nthFibonacci(26);
		long end = System.currentTimeMillis();
		System.out.println("Fibonacci Number  " + nthFibonacci);
		System.out.println("Time taken "+ (end-start) + " Milliseconds");
	}

	public static int nthFibonacci(int n) {
		   cache.put(0, 0);
		   cache.put(1, 1);
		   for(int i = 2; i <= n; i++) {
					int n1Fibonacci = cache.get(i - 1);
					int n2Fibonacci = cache.get(i - 2);
					cache.put(i, n1Fibonacci + n2Fibonacci);
			}
			return cache.get(n);	
		}
}


