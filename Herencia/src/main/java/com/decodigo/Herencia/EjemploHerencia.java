package com.decodigo.Herencia;

import java.util.Date;

public class EjemploHerencia {
	public static void main(String args[]) {

		Empleado empleado1 = new Empleado("Juan", 5000);
		empleado1.setEdad(27);
		empleado1.setGenero('M');
		empleado1.setDireccion("Sta Eugenia #45");
		System.out.println(empleado1);
		
		Empleado empleado2 = new Empleado("Daniela", 3000);
		empleado2.setEdad(24);
		empleado2.setGenero('F');
		empleado2.setDireccion("Puentelarra #26"); 
		System.out.println(empleado2);
		
		Cliente cliente1 = new Cliente(new Date(), true);
		cliente1.setNombre("Homero");
		cliente1.setGenero('M');
		cliente1.setEdad(30);
		cliente1.setDireccion("Moratalaz #151");
		System.out.println(cliente1);
		
		Cliente cliente2 = new Cliente (new Date(), false);
		cliente2.setNombre("Rebeca");
		cliente2.setGenero('F');
		cliente2.setEdad(28);
		cliente2.setDireccion("Torrejon #11");
		System.out.println(cliente2);
	}
}
