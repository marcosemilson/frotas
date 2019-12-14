package br.com.inite.sgf.model;

import java.util.Date;

public abstract class Despesa {

	private int ID;
	private Date dataDespesa;
	private Date dataPagamentoDespesa;
	private double valorlDespesa;
	private String situacaoDespesa;
	private int data;
	private int total;
	private int dataPagamento;

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public Date getDataDespesa() {
		return this.dataDespesa;
	}

	public void setDataDespesa(Date dataDespesa) {
		this.dataDespesa = dataDespesa;
	}

	public Date getDataPagamentoDespesa() {
		return this.dataPagamentoDespesa;
	}

	public void setDataPagamentoDespesa(Date dataPagamentoDespesa) {
		this.dataPagamentoDespesa = dataPagamentoDespesa;
	}

	public double getValorlDespesa() {
		return this.valorlDespesa;
	}

	public void setValorlDespesa(double valorlDespesa) {
		this.valorlDespesa = valorlDespesa;
	}

	public String getSituacaoDespesa() {
		return this.situacaoDespesa;
	}

	public void setSituacaoDespesa(String situacaoDespesa) {
		this.situacaoDespesa = situacaoDespesa;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getDataPagamento() {
		return this.dataPagamento;
	}

	public void setDataPagamento(int dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}