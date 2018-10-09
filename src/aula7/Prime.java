package aula7;

public class Prime {
	
	private boolean isPrime(int value) {
		for(int i = 2; i<value; i++) {
			if(value%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public String msgPrime(int value) {
		if(isPrime(value)) {
			return "eh primo";
		}
		return "nao eh primo";
	}
}
