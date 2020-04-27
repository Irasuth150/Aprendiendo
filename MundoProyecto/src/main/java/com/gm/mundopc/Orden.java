package com.gm.mundopc;

public class Orden {
	public final int idOrden;
	public final Computadora computadoras[];
	public static int contadorOrdenes;
	public int contadorComputadoras;
	public static final int maxComputadoras = 10;

	public Orden() {
		this.idOrden = ++contadorOrdenes;
		computadoras = new Computadora[maxComputadoras];
	}
	public void agregarComputadora(Computadora computadora) {
		if (contadorComputadoras < maxComputadoras) {
			computadoras[contadorComputadoras++] = computadora;
		} else {
			System.out.println("Ha superado el maximo de productos: " + maxComputadoras);
		}
	}

	public void mostrarOrden() {
		System.out.println("Orden #: " + idOrden);
		System.out.println("Computadoras de orden #: " + idOrden);
		for (int i = 0; i < contadorComputadoras; i++) {
			System.out.println(computadoras[i]);
		}
	}
}