package com.example.java.ant.task;

public class PrimeNumber {

	public boolean testPrime(int number){
		
		int quotient = number/2;		
		
		boolean prime = true;		
		for(int i=2; i<=quotient; i++){
			if(number%i == 0){
				prime = false;
				break;
			}
		}		
		return prime;
	}
}
