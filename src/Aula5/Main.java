package Aula5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Bascara bascara = new Bascara(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		
		System.out.println(bascara.CalculaRaizPostitiva());
		System.out.println(bascara.CalculaRaizNegativa());
		
	}

}
