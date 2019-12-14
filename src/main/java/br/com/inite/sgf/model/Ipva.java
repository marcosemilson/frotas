package br.com.inite.sgf.model;

import java.util.Date;

public class Ipva extends Despesa {

	private int ano;
	private String situacaoIpva;
	private Date vencimentoIpva;

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getSituacaoIpva() {
		return this.situacaoIpva;
	}

	public void setSituacaoIpva(String situacaoIpva) {
		this.situacaoIpva = situacaoIpva;
	}

	public Date getVencimentoIpva() {
		return this.vencimentoIpva;
	}

	public void setVencimentoIpva(Date vencimentoIpva) {
		this.vencimentoIpva = vencimentoIpva;
	}

}