package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
	public static void main(String args[]) {

		Monitor monitorLeno = new Monitor("Lenovo", 15);
		Teclado tecladLeno = new Teclado("Bluetooth", "Lenovo");
		Raton ratonLeno = new Raton("Bluetooth", "Lenovo");
		Computadora compuLenovo = new Computadora("Computadora Lenovo: ", monitorLeno, tecladLeno, ratonLeno);
		
		Monitor monitorHp = new Monitor("HP", 20);
		Teclado tecladHp = new Teclado("Bluetooth", "HP");
		Raton ratonHp = new Raton("Bluetooth", "HP");
		Computadora compuHp = new Computadora("Computadora HP: ", monitorHp, tecladHp, ratonHp);

		Monitor monitorDell = new Monitor("Dell", 25);
		Teclado tecladDell = new Teclado("Bluetooth", "Dell");
		Raton ratonDell = new Raton("Bluetooth", "Dell");
		Computadora compuDell = new Computadora("Computadora Dell: ", monitorDell, tecladDell, ratonDell );
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(compuLenovo);
		orden1.mostrarOrden();
		
		Orden orden2 = new Orden();
		orden2.agregarComputadora(compuHp);
		System.out.println("");
		orden2.mostrarOrden();
		
		Orden orden3 = new Orden();
		orden3.agregarComputadora(compuDell);
		System.out.println("");
		orden3.mostrarOrden();
		
	}}
