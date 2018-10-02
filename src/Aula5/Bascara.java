package Aula5;

public class Bascara {
	
	private int a;
	private int b;
	private int c;
	
	public Bascara(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private double CalculaDelta() {		
		return (Math.pow(b, 2) - 4 * a * c);
	}
	
	public double CalculaRaizPostitiva(){
		
		return (-b + Math.sqrt(CalculaDelta())) / (2*a);
	}
	
	public double CalculaRaizNegativa(){
		
		return (-b - Math.sqrt(CalculaDelta())) / (2*a);
	}


}
