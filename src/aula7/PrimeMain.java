package aula7;

import java.util.Scanner;

public class PrimeMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Prime prime = new Prime();
		
		int cases =  scanner.nextInt();
		
		for(int i = 0; i<cases; i++) {
			System.out.println(prime.msgPrime(scanner.nextInt()));
		}
		
		scanner.close();
	}
}
