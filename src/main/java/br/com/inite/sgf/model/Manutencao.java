package br.com.inite.sgf.model;

import java.util.Date;

public abstract class Manutencao extends Despesa {

	private int tipoManutencao;
	private Date dataAgenda;
	private Date dataManutencao;
	private Date dataBaixaManutencao;

	public int getTipoManutencao() {
		return this.tipoManutencao;
	}

	public void setTipoManutencao(int tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
	}

	public Date getDataAgenda() {
		return this.dataAgenda;
	}

	public void setDataAgenda(Date dataAgenda) {
		this.dataAgenda = dataAgenda;
	}

	public Date getDataManutencao() {
		return this.dataManutencao;
	}

	public void setDataManutencao(Date dataManutencao) {
		this.dataManutencao = dataManutencao;
	}

	public Date getDataBaixaManutencao() {
		return this.dataBaixaManutencao;
	}

	public void setDataBaixaManutencao(Date dataBaixaManutencao) {
		this.dataBaixaManutencao = dataBaixaManutencao;
	}

}