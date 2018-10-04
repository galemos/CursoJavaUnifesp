package aula6;

import java.util.Scanner;

public class IntervaloMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor:");
		Intervalo intervalo = new Intervalo(scanner.nextDouble());
		System.out.println(intervalo.getIntervalo());
		scanner.close();
	}
}


