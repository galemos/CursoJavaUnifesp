package Aula5;

import java.util.Scanner;

public class ConversorTemperaturaMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
		
		System.out.println(conversorTemperatura.ConverteCelsiusFahrenheit(scanner.nextDouble()));
		System.out.println(conversorTemperatura.ConverteFahrenheitCelsius(scanner.nextDouble()));
		
		scanner.close();
	}

}
