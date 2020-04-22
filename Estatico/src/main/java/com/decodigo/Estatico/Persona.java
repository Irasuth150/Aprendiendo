package com.decodigo.Estatico;

public class Persona {
	
	public int idPersona;
	public String nombre;
	public static int contadorPersona;
	
	public Persona(String nombre) {
		this.idPersona = ++contadorPersona;
		this.nombre = nombre;
	}
	public int getIdPersona() {
		return this.idPersona;
	}
//	public int setIdPersona(int idPersona) {
//		return this.idPersona = idPersona;
//	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static int getContadorPersona() {
		return contadorPersona;
	}
	@Override
	public String toString() {
	return "idPersona: " + idPersona + ", nombre: " + nombre + ", contadorPersonas: " +  contadorPersona; 
	}
}
