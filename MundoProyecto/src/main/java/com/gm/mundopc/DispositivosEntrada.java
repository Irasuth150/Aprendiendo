package com.gm.mundopc;

public class DispositivosEntrada {
	public String marca;
	public String tipoEntrada;

	public DispositivosEntrada(String marca, String tipoEntrada) {
		this.marca = marca;
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	@Override
	public String toString() {
		return " DispositivosEntrada [ marca=" + marca + ", tipoEntrada=" + tipoEntrada + "]";
	}

}
