package br.com.inite.sgf.model;

import java.util.Date;

public class Freio extends Manutencao {

	private int tipoTroca;
	private Date dataTroca;
	private long kmTroca;
	private Date dataProximaTroca;
	private long KmProximaTroca;
	
	public int getTipoTroca() {
		return tipoTroca;
	}
	public void setTipoTroca(int tipoTroca) {
		this.tipoTroca = tipoTroca;
	}
	public Date getDataTroca() {
		return dataTroca;
	}
	public void setDataTroca(Date dataTroca) {
		this.dataTroca = dataTroca;
	}
	public long getKmTroca() {
		return kmTroca;
	}
	public void setKmTroca(long kmTroca) {
		this.kmTroca = kmTroca;
	}
	public Date getDataProximaTroca() {
		return dataProximaTroca;
	}
	public void setDataProximaTroca(Date dataProximaTroca) {
		this.dataProximaTroca = dataProximaTroca;
	}
	public long getKmProximaTroca() {
		return KmProximaTroca;
	}
	public void setKmProximaTroca(long kmProximaTroca) {
		KmProximaTroca = kmProximaTroca;
	}

}