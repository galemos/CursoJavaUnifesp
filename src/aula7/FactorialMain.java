package aula7;

import java.util.Scanner;

public class FactorialMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Factorial factorial =  new Factorial();
		
		System.out.println(factorial.calcFactorial(scanner.nextInt()));
		
		scanner.close();
	}

}
