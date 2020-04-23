package com.decodigo.SobrecargaConstructores;

public class Persona {
	int idPersona;
	String nombre;
	int edad;
	public static int contadorPersonas;

	private Persona() {
		this.idPersona = ++contadorPersonas;
	}

	// Constructor completo - sobrecargado
	public Persona(String nombre, int edad) {
		this(); // Inicializa el valor del atributo idPersona
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ",Nombre=" + nombre + ", Edad=" + edad + "]";
	}
}
