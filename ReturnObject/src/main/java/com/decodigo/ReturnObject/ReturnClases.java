package com.decodigo.ReturnObject;

public class ReturnClases {

	public static void main(String args[]) {
		// objeto tipo suma
		Suma s = creaObjetoSuma();
		System.out.println("Resultado de llamar el metodo sumar: " + s.sumar());
	}
	private static Suma creaObjetoSuma(){
		Suma suma = new Suma(4,6);
		return suma;
	}
}
	//clase
	class Suma{
	int a;
	int b;
	
	//constructor de la clase
	public Suma (int a, int b) {
		this.a = a;
		this.b = b;	
	}
	//Metodo para sumar los atributos de la clase
	public int sumar() {
		return this.a + this.b;
	}
	
	
	
	}