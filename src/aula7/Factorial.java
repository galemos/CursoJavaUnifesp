package aula7;

public class Factorial {
	
	public int calcFactorial(int value) {
		if(value == 1)
			return 1;
		else
			return value * (calcFactorial(value-1));
	}

}
