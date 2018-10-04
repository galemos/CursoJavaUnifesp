package Aula5;

public class Bhaskara {
	
	private double a;
	private double b;
	private double c;
	
	public Bhaskara(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private double CalculaDelta(){	
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double CalculaRaizPostitiva(){
		return (-b + Math.sqrt(CalculaDelta())) / 2 * a;
	}
	
	public double CalculaRaizNegativa(){
		return (-b - Math.sqrt(CalculaDelta())) / 2 * a;
	}


}
