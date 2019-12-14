package br.com.inite.sgf.model;

import java.util.Date;

public class Seguro extends Despesa {

	private String parcela;
	private String situacaoParcela;
	private Date pagamentoParcela;
	private Date vencimentoParcela;

	public String getParcela() {
		return this.parcela;
	}

	public void setParcela(String parcela) {
		this.parcela = parcela;
	}

	public String getSituacaoParcela() {
		return this.situacaoParcela;
	}

	public void setSituacaoParcela(String situacaoParcela) {
		this.situacaoParcela = situacaoParcela;
	}

	public Date getPagamentoParcela() {
		return this.pagamentoParcela;
	}

	public void setPagamentoParcela(Date pagamentoParcela) {
		this.pagamentoParcela = pagamentoParcela;
	}

	public Date getVencimentoParcela() {
		return this.vencimentoParcela;
	}

	public void setVencimentoParcela(Date vencimentoParcela) {
		this.vencimentoParcela = vencimentoParcela;
	}

}