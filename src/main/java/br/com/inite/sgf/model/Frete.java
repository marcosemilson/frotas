package br.com.inite.sgf.model;

import java.util.Date;

public class Frete {

	private String origem;
	private String destino;
	private Date dataSaida;
	private Date dataChegada;
	private long kmInicial;
	private long kmFinal;
	private long manifesto;
	private double valorFrete;
	private double adiantamento;
	private String situacao;
	private Date baixa;
	private Frota frota;
	private int ID;
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Date getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	public long getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(long kmInicial) {
		this.kmInicial = kmInicial;
	}
	public long getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(long kmFinal) {
		this.kmFinal = kmFinal;
	}
	public long getManifesto() {
		return manifesto;
	}
	public void setManifesto(long manifesto) {
		this.manifesto = manifesto;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	public double getAdiantamento() {
		return adiantamento;
	}
	public void setAdiantamento(double adiantamento) {
		this.adiantamento = adiantamento;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Date getBaixa() {
		return baixa;
	}
	public void setBaixa(Date baixa) {
		this.baixa = baixa;
	}
	public Frota getFrota() {
		return frota;
	}
	public void setFrota(Frota frota) {
		this.frota = frota;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	
}
	