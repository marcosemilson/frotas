package br.com.inite.sgf.model;

import java.util.*;

public class Veiculo {

	Frota frota;
	Collection<Abastecimento> abastecimento;
	private int ID;
	private String Placa;
	private String Tipo;
	private String Modelo;
	private int AnoModelo;
	private int AnoFabricacao;
	private String Marca;
	private String Combustivel;
	private String Cor;
	private String Chassi;
	private String Situacao;
	private String Status;
	private String Renavan;
	private String Ipva;
	private String Licenca;
	private String Observacao;

	public Veiculo() {
		// TODO - implement Veiculo.Veiculo
		throw new UnsupportedOperationException();
	}

	public Frota getFrota() {
		return frota;
	}

	public void setFrota(Frota frota) {
		this.frota = frota;
	}

	public Collection<Abastecimento> getAbastecimento() {
		return abastecimento;
	}

	public void setAbastecimento(Collection<Abastecimento> abastecimento) {
		this.abastecimento = abastecimento;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getAnoModelo() {
		return AnoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		AnoModelo = anoModelo;
	}

	public int getAnoFabricacao() {
		return AnoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		AnoFabricacao = anoFabricacao;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getCombustivel() {
		return Combustivel;
	}

	public void setCombustivel(String combustivel) {
		Combustivel = combustivel;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getChassi() {
		return Chassi;
	}

	public void setChassi(String chassi) {
		Chassi = chassi;
	}

	public String getSituacao() {
		return Situacao;
	}

	public void setSituacao(String situacao) {
		Situacao = situacao;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getRenavan() {
		return Renavan;
	}

	public void setRenavan(String renavan) {
		Renavan = renavan;
	}

	public String getIpva() {
		return Ipva;
	}

	public void setIpva(String ipva) {
		Ipva = ipva;
	}

	public String getLicenca() {
		return Licenca;
	}

	public void setLicenca(String licenca) {
		Licenca = licenca;
	}

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

}