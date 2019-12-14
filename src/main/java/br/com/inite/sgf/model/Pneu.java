package br.com.inite.sgf.model;

public class Pneu {

	TrocaDePneu trocaDePneu;
	private int ID;
	private String descricao;
	private String posicao;
	private String situacao;
	private long kmRodado;
	public TrocaDePneu getTrocaDePneu() {
		return trocaDePneu;
	}
	public void setTrocaDePneu(TrocaDePneu trocaDePneu) {
		this.trocaDePneu = trocaDePneu;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public long getKmRodado() {
		return kmRodado;
	}
	public void setKmRodado(long kmRodado) {
		this.kmRodado = kmRodado;
	}
	

}