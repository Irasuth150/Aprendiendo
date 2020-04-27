package com.gm.mundopc;

public class Raton extends DispositivosEntrada {
	public int idRaton;
	public static int contadorRatones;

	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		idRaton = contadorRatones++;
	}

	@Override
	public String toString() {
		return  "{ idRaton= " + idRaton +  super.toString();
	}

}