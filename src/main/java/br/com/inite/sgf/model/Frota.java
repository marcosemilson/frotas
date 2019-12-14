package br.com.inite.sgf.model;

import java.util.*;

public class Frota {

	Collection<Frete> fretes;
	Veiculo veiculo;
	private Frota Frota;
	private String Situacao;
	private Date DataBaixa;
	private Motorista motorista;
	private int ID;
	public Collection<Frete> getFretes() {
		return fretes;
	}
	public void setFretes(Collection<Frete> fretes) {
		this.fretes = fretes;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Frota getFrota() {
		return Frota;
	}
	public void setFrota(Frota frota) {
		Frota = frota;
	}
	public String getSituacao() {
		return Situacao;
	}
	public void setSituacao(String situacao) {
		Situacao = situacao;
	}
	public Date getDataBaixa() {
		return DataBaixa;
	}
	public void setDataBaixa(Date dataBaixa) {
		DataBaixa = dataBaixa;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	

}