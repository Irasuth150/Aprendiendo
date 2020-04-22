package com.decodigo.Herencia;

import java.util.Date;

public class Cliente extends Persona{
	
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;
	
	public Cliente (Date fechaRegistro, boolean vip) {
		this.idCliente = ++ contadorCliente;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}
	
	public int getIdCliente() {
		return this.idCliente;
	}
	
	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public boolean getVip() {
		return this.vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	public static int getContadorCliente() {
		return contadorCliente;
	}
	public String toString() {
		return super.toString() +  " Cliente { " + "idCliente= " + idCliente + ", fechaRegistro= " + fechaRegistro + ",  vip = " + vip;
	}

	
}
