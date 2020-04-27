package com.gm.mundopc;

public class Computadora {
	
	public int idComputadora;
	public String nombre;
	public Monitor monitor;
	public Teclado teclado;
	public Raton raton;
	public static int contadorComputadoras;

	private Computadora() {
		idComputadora = contadorComputadoras++;
	}

	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.raton = raton;
		this.teclado = teclado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	@Override
	public String toString() {
		return "[idComputadora = " + idComputadora +  " nombre= " + nombre + ", monitor= " + monitor
				+ ", teclado= " + teclado + ", raton= " + raton + "]";
	}

}
