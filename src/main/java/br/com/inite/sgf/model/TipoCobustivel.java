package br.com.inite.sgf.model;

public enum TipoCobustivel {
	;

	private int ID;
	private String descricao;

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}