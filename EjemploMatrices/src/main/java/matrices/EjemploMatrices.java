package matrices;

public class EjemploMatrices {
	public static void main(String args[]) {
		//1. Declara una matríz de int
		int edades[] [];
		//2. Instanciar la matríz de int
		edades= new int [3] [2];
		//3. Instanciar los valores de la matríz
		edades [0][0] =30;	
		edades [0][1] =25;
		edades [1][0] =20;
		edades [1][1] =15;
		edades [2][0] =10;
		edades [2][1] =5;
		
		//4.Imprimir 
		System.out.println("Matríz enteros indice 0 0: " + edades[0][0]);
		System.out.println("Matríz enteros indice 2 0: " + edades[2][0]);
		System.out.println("Matríz enteros indice 2 1: " + edades[2][1]);
		
		
		//Personas
		Persona personas[][] = new Persona [2][2];
		
		personas[0][0] = new Persona ("Juan");
		personas[0][1] = new Persona ("Daniela");
		//personas[1][0] = new Persona ("Homero");
		personas[1][1] = new Persona ("Karla");
		
		System.out.println("Matríz persona indice 0 0: " + personas[0][0]);
		System.out.println("Matríz persona indice 0 1: " + personas[0][1]);
		System.out.println("Matríz persona indice 1 0: " + personas[1][0]);
		System.out.println("Matríz persona indice 1 1: " + personas[1][1]);
	
		for(int renglon = 0; renglon < personas.length; renglon++) {
			for(int columna = 0; columna < personas[renglon].length; columna++) {
			
				
				System.out.println("Matríz personas indice: " + renglon + " - " + columna + " : " + personas[renglon][columna]);
			}
		}
	
	}

}
