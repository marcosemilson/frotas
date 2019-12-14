package br.com.inite.sgf.model;

import java.util.Date;

public class TrocaDeOleo extends Manutencao {

	private String marca;
	private int tipoTroca;
	private int kmTroca;
	private Date dataTroca;
	private int kmProximaTroca;
	private Date dataProximaTroca;
	private String fornecedor;
	private boolean trocaFiltroAr;
	private boolean trocaFiltroCombustivel;
	private boolean trocaFiltroleo;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTipoTroca() {
		return this.tipoTroca;
	}

	public void setTipoTroca(int tipoTroca) {
		this.tipoTroca = tipoTroca;
	}

	public int getKmTroca() {
		return this.kmTroca;
	}

	public void setKmTroca(int kmTroca) {
		this.kmTroca = kmTroca;
	}

	public Date getDataTroca() {
		return this.dataTroca;
	}

	public void setDataTroca(Date dataTroca) {
		this.dataTroca = dataTroca;
	}

	public int getKmProximaTroca() {
		return this.kmProximaTroca;
	}

	public void setKmProximaTroca(int kmProximaTroca) {
		this.kmProximaTroca = kmProximaTroca;
	}

	public Date getDataProximaTroca() {
		return this.dataProximaTroca;
	}

	public void setDataProximaTroca(Date dataProximaTroca) {
		this.dataProximaTroca = dataProximaTroca;
	}

	public String getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public boolean isTrocaFiltroAr() {
		return this.trocaFiltroAr;
	}

	public void setTrocaFiltroAr(boolean trocaFiltroAr) {
		this.trocaFiltroAr = trocaFiltroAr;
	}

	public boolean isTrocaFiltroCombustivel() {
		return this.trocaFiltroCombustivel;
	}

	public void setTrocaFiltroCombustivel(boolean trocaFiltroCombustivel) {
		this.trocaFiltroCombustivel = trocaFiltroCombustivel;
	}

	public boolean isTrocaFiltroleo() {
		return this.trocaFiltroleo;
	}

	public void setTrocaFiltroleo(boolean trocaFiltroleo) {
		this.trocaFiltroleo = trocaFiltroleo;
	}

}