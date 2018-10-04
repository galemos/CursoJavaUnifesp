package aula6;

public class Intervalo {
	
	private String intervalo;

	public Intervalo(double valor) {
		this.intervalo = VarificaIntervalo(valor);
	}

	
	public String getIntervalo() {
		return intervalo;
	}

	private String VarificaIntervalo(double valor) {
		return Intervalo0e25(valor);
	}
	
	private String Intervalo0e25(double valor) {
		if (valor >= 0  && valor <= 25)
			return "Intervalo [0,25]";
		else
			return Intervalo25e50(valor);
	}
	private String Intervalo25e50(double valor) {
		if (valor > 25 && valor <= 50)
			return "Intervalo (25,50]";
		else
			return Intervalo50e100(valor);
	}
	private String Intervalo50e100(double valor) {
		if (valor > 50 && valor <= 100)
			return "Intervalo (75,100]";
		else
			return IntervaloForaLimite(valor);
	}
	private String IntervaloForaLimite(double valor) {
		return "Fora de intervalo";
	}

}
