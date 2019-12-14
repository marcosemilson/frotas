package br.com.inite.sgf.model;

import java.util.Date;

public class TrocaDePneu extends Manutencao {

	Pneu pneu;
	private Date dataTroca;
	private int Pneu;
	private Integer kmTroca;
	private Integer proximaTroca;
	public Pneu getPneu() {
		return pneu;
	}
	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}
	public Date getDataTroca() {
		return dataTroca;
	}
	public void setDataTroca(Date dataTroca) {
		this.dataTroca = dataTroca;
	}

	public void setPneu(int pneu) {
		Pneu = pneu;
	}
	public Integer getKmTroca() {
		return kmTroca;
	}
	public void setKmTroca(Integer kmTroca) {
		this.kmTroca = kmTroca;
	}
	public Integer getProximaTroca() {
		return proximaTroca;
	}
	public void setProximaTroca(Integer proximaTroca) {
		this.proximaTroca = proximaTroca;
	}
	
	

}