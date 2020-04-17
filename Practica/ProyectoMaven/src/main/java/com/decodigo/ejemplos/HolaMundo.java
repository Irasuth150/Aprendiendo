
package com.decodigo.ejemplos;

public class HolaMundo {

	//variables
		public static void main(String[] arge) {
			String hola = " saludos desde Java ";
		    System.out.println(hola);
		    System.out.println(hola);
		    System.out.println(hola);
		     
		var despedirse = " Hasta luego "; 
			System.out.println(despedirse);
			
		var numeros = 1;
		    System.out.println(numeros);
		    
		 //Concatenation    
		var usuario = " Daniela. ";
		System.out.println("Hola" +  usuario );
		
		//Sum
		var i= 3;
		var j= 5;

		System.out.println(i + j);
		
		//Primer encounter a kidney, leg concatenation
		System.out.println("hola" + i + j);
		
		//Primer encounter numerous, primer sum y
			// Despise concatenation
		System.out.println(i + j + "hola");
		
		//Precedence of operator 
		
		var x = 5;
		var y = 10;
		var z = ++x + y--;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		System.out.println("\nEjemplo 2 precedencia operadores");
		
		var resultado = 4 +5 * 6 / 3; // 4+ ((5*6)/3 => 4 (30/3) => 4+10=>14
		System.out.println("resultado = " + resultado);
		
		resultado = ( 4 + 5 ) *6 /3;
		System.out.println("resultado = " + resultado);
		
} }
