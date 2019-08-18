package net.mahtabalam.recursion;

public class Fibonacci {
	
	public static long calls = 0;
	
	public static void main(String args []) {
		// Fibonacci Series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ..
		long start = System.currentTimeMillis();
		int nthFibonacci = nthFibonacci(26);
		long end = System.currentTimeMillis();
		System.out.println("Fibonacci Number  " + nthFibonacci);
		System.out.println("Total Calls "+calls);
		System.out.println("Time taken "+ (end-start) + " Milliseconds");
	}
	
	public static int nthFibonacci(int n) {
		System.out.println("fib("+n+")");
		calls++;
		if(n == 0 || n == 1) {
			return n;
		} else {
			return nthFibonacci(n-1)+ nthFibonacci(n-2);
		}
	}

}
