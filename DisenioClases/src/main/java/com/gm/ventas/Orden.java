package com.gm.ventas;

import java.util.Date; 

public class Orden {
	private int idOrden;
	private Date fechaOrden;
	private Producto productos[];// Declaramos variable arreglo
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;//Constante para el maximo de productos

	public Orden() {
		this.idOrden = ++contadorOrdenes;
		// Inicializar el arreglo
		productos = new Producto[MAX_PRODUCTOS];
	}
	
	public Date getFechaOrden() {
		return this.fechaOrden;
	}
	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}

	public void agregarProducto(Producto producto) {
		if (this.contadorProductos < MAX_PRODUCTOS) {
			productos[this.contadorProductos++] = producto;
		} else {
			System.out.println("Se ha superado el maximo de productos: " + MAX_PRODUCTOS);
		}
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.contadorProductos; i++) {
			Producto producto = this.productos[i];
			total += producto.getPrecio();
		}
		return total;
	}

	public void mostrarOrden() {
		System.out.println("Orden #: " + this.idOrden);
		System.out.println("Fecha Orden: " );
		System.out.println("Total de la Orden:  $" + this.calcularTotal());
		System.out.println("Productos de la Orden: ");

		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println(productos[i]);
		}	
	}
	
}