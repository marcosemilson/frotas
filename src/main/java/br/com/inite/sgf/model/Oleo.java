package br.com.inite.sgf.model;

public class Oleo {

	private int ID;
	private String marcaOleo;
	private int tipoOleo;
	private int usoOleo;
	private String viscosidade;

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getMarcaOleo() {
		return this.marcaOleo;
	}

	public void setMarcaOleo(String marcaOleo) {
		this.marcaOleo = marcaOleo;
	}

	public int getTipoOleo() {
		return this.tipoOleo;
	}

	public void setTipoOleo(int tipoOleo) {
		this.tipoOleo = tipoOleo;
	}

	public int getUsoOleo() {
		return this.usoOleo;
	}

	public void setUsoOleo(int usoOleo) {
		this.usoOleo = usoOleo;
	}

	public String getViscosidade() {
		return this.viscosidade;
	}

	public void setViscosidade(String viscosidade) {
		this.viscosidade = viscosidade;
	}

}