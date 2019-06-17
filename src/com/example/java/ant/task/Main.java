package com.example.java.ant.task;

public class Main {
	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		int number1 = 23;
		boolean prime = pm.testPrime(number1);
		System.out.println("Testing number1:::"+number1+":::is prime:::"+prime);
	}
}
