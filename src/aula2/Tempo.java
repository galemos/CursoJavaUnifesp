package aula2;

public class Tempo {
	private int horas, minutos, segundos;
	
	public Tempo(int nextInt) {
		this.segundos = nextInt;		
		obterHoras(obterMinutos(this.segundos));
	}

	private int obterMinutos(int segundos) {
		this.minutos = segundos / 60;
		this.segundos = segundos % 60;
		return this.minutos;
	}
	
	private int obterHoras(int minutos) {
		this.horas = minutos / 60;
		this.minutos = minutos % 60;
		return this.horas;
	}

	public String imprimir() {
		return this.horas + ":" + this.minutos + ":" + this.segundos;
	}
}

