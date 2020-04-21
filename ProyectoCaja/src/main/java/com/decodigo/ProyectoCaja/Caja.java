package com.decodigo.ProyectoCaja;

public class Caja {
		
   int ancho;
   int alto;
   int profundo;
   
   public Caja () {
   }
   public Caja(int ancho, int alto, int profundo) {
	   this.ancho = ancho;
	   this.alto = alto;
	   this.profundo = profundo;
   }
   public int CalcularVolumen() {
	   return this.ancho * this.alto * this.profundo;
   }
   public int CalcularVolumen(int ancho, int alto, int profundo) {
	   return ancho * alto * profundo;
    }
   public int SumarVolumen() {
	   return ancho + alto + profundo;
   }
   public int SumarVolumen(int ancho, int alto, int profundo) {
	   return ancho + alto + profundo;
}
}


