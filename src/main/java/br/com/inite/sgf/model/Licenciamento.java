package br.com.inite.sgf.model;

import java.util.Date;

public class Licenciamento extends Despesa {

	private String situacaoLicenca;
	private Date vencimentoLicenca;
	private int anoLicenca;

	public String getSituacaoLicenca() {
		return this.situacaoLicenca;
	}

	public void setSituacaoLicenca(String situacaoLicenca) {
		this.situacaoLicenca = situacaoLicenca;
	}

	public Date getVencimentoLicenca() {
		return this.vencimentoLicenca;
	}

	public void setVencimentoLicenca(Date vencimentoLicenca) {
		this.vencimentoLicenca = vencimentoLicenca;
	}

	public int getAnoLicenca() {
		return this.anoLicenca;
	}

	public void setAnoLicenca(int anoLicenca) {
		this.anoLicenca = anoLicenca;
	}

}