package com.decodigo.SobrecargaMetodos;

public class SobrecargaMetodos{
	public static void main(String args[]) {
		
		System.out.println("Resultado 1: " + Operaciones.sumar(3, 4));
		
		System.out.println("Resultado 2: " + Operaciones.sumar(2.2, 4));
	
		System.out.println("Resultado 3: " + Operaciones.sumar(3, 2.2));
		
		System.out.println("Resultado : " + Operaciones.sumar(3F, 'A'));
	}
	

}
