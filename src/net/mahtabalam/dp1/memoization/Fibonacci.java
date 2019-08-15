package net.mahtabalam.dp1.memoization;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	public static long calls = 0;
	public static Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int nthFibonacci = nthFibonacci(35);
		long end = System.currentTimeMillis();
		System.out.println("Fibonacci Number  " + nthFibonacci);
		System.out.println("Total Calls "+calls);
		System.out.println("Time taken "+ (end-start) + " Milliseconds");
	}

	public static int nthFibonacci(int n) {
		calls++;
		if (cache.containsKey(n)) {
			return cache.get(n);
		} else {
			if (n == 0 || n == 1) {
				return n;
			} else {
				int n1Fibonacci = nthFibonacci(n - 1);
				int n2Fibonacci = nthFibonacci(n - 2);
				cache.put(n - 1, n1Fibonacci);
				cache.put(n - 2, n2Fibonacci);
				int nthFibonacci = n1Fibonacci + n2Fibonacci;
				cache.put(n, n1Fibonacci + n2Fibonacci);
				return nthFibonacci;
			}
		}

	}

}
