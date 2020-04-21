package com.decodigo.ProyectoCaja;

public class PruebaCaja {

public static void main(String args[]){

	int medidaAncho = 3;
	int medidaAlto = 2;
	int medidaProf = 6;
	
	Caja caja1 = new Caja ();
	int resultado = caja1.CalcularVolumen(medidaAncho, medidaAlto, medidaProf);
	System.out.println("\n Resultado de la caja 1: " + resultado);
	
	Caja caja2 = new Caja (2, 4, 6);
	System.out.println("\n Resultado de la caja 2: " + caja2.CalcularVolumen());
	
	Caja caja3 = new Caja (5, 6, 1);
	System.out.println("\n Resultado de la caja 3: " + caja3.CalcularVolumen());
	
	Caja caja4 = new Caja();
	int resultado1 = caja4.SumarVolumen(medidaAncho, medidaAlto, medidaProf);
	System.out.println("\n Resultado de la suma de la caja 4: " + resultado1);
	
	Caja caja5 = new Caja(8, 5, 4);
	System.out.println("\n Resultado de la caja 5: " + caja5.SumarVolumen());
}
}