package Aula5;

import java.util.Scanner;

public class BhaskaraMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Bhaskara bascara = new Bhaskara(
				scanner.nextDouble(),
				scanner.nextDouble(),
				scanner.nextDouble());
		
		System.out.println("X1 = " + bascara.CalculaRaizPostitiva());
		System.out.println("X2 = " + bascara.CalculaRaizNegativa());

		
		scanner.close();
		
	}

}
