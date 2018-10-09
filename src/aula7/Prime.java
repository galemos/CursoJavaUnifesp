package aula7;

public class Prime {
	
	private boolean isPrime(long value) {
		for(int i = 2; i<(value/2); i++) {
			if(value%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public String msgPrime(long value) {
		if(isPrime(value)) {
			return "eh primo";
		}
		return "nao eh primo";
	}
}
