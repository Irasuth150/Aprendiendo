package com.decodigo.Herencia;

public class Empleado extends Persona {
	
	int idEmpleado;
	double sueldo;
	static int contadorEmpleado;
	
	public Empleado(String nombre, double sueldo) {
		super(nombre);
		this.idEmpleado = ++contadorEmpleado;
		this.sueldo = sueldo;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	
	//public void setIdEmpleado(int idEmpleado) {
	//	this.idEmpleado = idEmpleado;
	//}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public static int getContadorEmpleado() {
		return contadorEmpleado;
	}
	
	public String toString() {
		return super.toString() + " Empleado {" + "idEmpleado= " + idEmpleado + ", sueldo= " + sueldo + '}';
	}
}
