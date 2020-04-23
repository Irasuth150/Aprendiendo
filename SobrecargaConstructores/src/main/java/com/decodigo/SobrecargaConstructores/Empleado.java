package com.decodigo.SobrecargaConstructores;

public class Empleado extends Persona {

	private double sueldo;

	public Empleado(String nombre, int edad) {
		super(nombre, edad);
	}

	public Empleado(String nombre, int edad, double sueldo) {
		this(nombre, edad);
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [Sueldo=" + sueldo + "]";
	}

}
