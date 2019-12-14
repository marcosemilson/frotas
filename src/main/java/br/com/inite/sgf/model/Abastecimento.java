package br.com.inite.sgf.model;

import java.util.Date;

public class Abastecimento extends Despesa {

	Veiculo veiculo;
	private int cupom;
	private Date dataAbastecimento;
	private int km;
	private double vlrLitro;
	private int qtde;
	private int tipoCombustivel;
	private Integer veiculoID;

	public int getCupom() {
		return this.cupom;
	}

	public void setCupom(int cupom) {
		this.cupom = cupom;
	}

	public Date getDataAbastecimento() {
		return this.dataAbastecimento;
	}

	public void setDataAbastecimento(Date dataAbastecimento) {
		this.dataAbastecimento = dataAbastecimento;
	}

	public int getKm() {
		return this.km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public double getVlrLitro() {
		return this.vlrLitro;
	}

	public void setVlrLitro(double vlrLitro) {
		this.vlrLitro = vlrLitro;
	}

	public int getQtde() {
		return this.qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public int getTipoCombustivel() {
		return this.tipoCombustivel;
	}

	public void setTipoCombustivel(int tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public Integer getVeiculoID() {
		return veiculoID;
	}

	/**
	 * @param veiculoID the veiculoID to set
	 */
	public void setVeiculoID(Integer veiculoID) {
		this.veiculoID = veiculoID;
	}

	public void Abasteciemto() {
		// TODO - implement Abastecimento.Abasteciemto
		throw new UnsupportedOperationException();
	}

	public void CalculaAbastecimento() {
		// TODO - implement Abastecimento.CalculaAbastecimento
		throw new UnsupportedOperationException();
	}

	/**
	 * @return the veiculoID
	 */

}