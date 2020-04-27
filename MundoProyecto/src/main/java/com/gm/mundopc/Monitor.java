package com.gm.mundopc;

public class Monitor {
	public final int idMonitor;
	public String marca;
	public double tamaño;
	public static int contadorMonitores;

	public Monitor() {
		idMonitor = contadorMonitores++;
	}

	public Monitor(String marca, double tamaño) {
		this();
		this.marca = marca;
		this.tamaño = tamaño;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "{ idMonitor= " + idMonitor + ", marca= "  + marca + ", tamaño= " + tamaño + ", contadorMonitores= "
				+ contadorMonitores + "]";
	}

}
