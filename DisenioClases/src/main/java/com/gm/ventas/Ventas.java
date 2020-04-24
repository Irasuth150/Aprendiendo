package com.gm.ventas;

public class Ventas {

	public static void main(String args[]) {

		// Crear varios objetos de tipo producto
		Producto producto1 = new Producto("Camisa", 50);
		Producto producto2 = new Producto("Pantalon", 100);
		Producto producto3 = new Producto("Zapatos", 150);
		Producto producto4 = new Producto("Calcetines", 20);

		// Crear un objeto de tipo orden
		Orden orden1 = new Orden();

		Orden orden2 = new Orden();

		// Agregar los productos a la orden
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden2.agregarProducto(producto3);
		orden2.agregarProducto(producto4);

		// Imprimir orden
		orden1.mostrarOrden();
		orden2.mostrarOrden();

	}

}
