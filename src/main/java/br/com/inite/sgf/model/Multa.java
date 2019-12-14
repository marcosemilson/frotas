package br.com.inite.sgf.model;

public class Multa extends Despesa {

	private String Historico;
	private String Ponto;
	private double valor;

	public Multa() {
		// TODO - implement Multa.Multa
		throw new UnsupportedOperationException();
	}

	public String getHistorico() {
		return Historico;
	}

	public void setHistorico(String historico) {
		Historico = historico;
	}

	public String getPonto() {
		return Ponto;
	}

	public void setPonto(String ponto) {
		Ponto = ponto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}