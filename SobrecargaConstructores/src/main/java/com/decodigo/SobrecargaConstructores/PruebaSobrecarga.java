package com.decodigo.SobrecargaConstructores;

public class PruebaSobrecarga {

	public static void main(String args[]) {

		Persona persona1 = new Persona("Daniela", 20);
		System.out.println("Persona1 = " + persona1);

		Persona persona2 = new Persona("Homero", 30);
		System.out.println("Persona2 = " + persona2);
		
		Empleado empleado1 = new Empleado("Juan", 40, 4000);
		System.out.println("Empleado1 = " + empleado1);
		
		Empleado empleado2 = new Empleado("Karla", 50, 5000);
		System.out.println("Empleado2 = " + empleado2);
	}
}
