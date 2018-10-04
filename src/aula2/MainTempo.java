package aula2;

import java.util.Scanner;

public class MainTempo{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tempo tempo = new Tempo(scanner.nextInt());
		System.out.println(tempo.imprimir());
		scanner.close();
	}
}

