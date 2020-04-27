package com.gm.mundopc;

public class Teclado extends DispositivosEntrada {
	public int idTeclado;
	public static int contadorTeclado;

	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		idTeclado = contadorTeclado++;
	}
	@Override
	public String toString() {
		return " {idTeclado= " + idTeclado +  super.toString();
	}
}
