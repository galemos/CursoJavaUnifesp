package Aula5;

public class ConversorTemperatura {
	
	public double ConverteCelsiusFahrenheit(double f) {
		return (f - 32) * (5 / 9);
	}
	
	public double ConverteFahrenheitCelsius(double c) {
		return (9 * c + 160) / 5;
	}

}
