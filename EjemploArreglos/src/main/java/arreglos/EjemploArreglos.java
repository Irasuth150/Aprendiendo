package arreglos;

public class EjemploArreglos {
	
	public static void main(String args[]) {

		// 1.Declaramos una var. de tipo arreglo de int
		int edades[];

		// 2.Instanciamos el arreglo de tipo int
		edades = new int[3];

		// 3.Inicializar los valores de los elementos del arreglo
		edades[0] = 30;
		edades[1] = 20;
		edades[2] = 10;

		// Imprimir los valores del arreglo
		System.out.println("Arreglos de enteros indice 0: " + edades[0]);
		System.out.println("Arreglos de enteros indice 1: " + edades[1]);
		System.out.println("Arreglos de enteros indice 2: " + edades[2]);

		// Declara e Instancia un arreglo de tipo object
		Persona personas[] = new Persona[4];

		personas[0] = new Persona("Juan");
		personas[1] = new Persona("Daniela");
		personas[3] = new Persona("Sara");

		System.out.println("Arreglo personas indice 0: " + personas[0]);
		System.out.println("Arreglo personas indice 1: " + personas[1]);
		System.out.println("Arreglo personas indice 2: " + personas[2]);
		System.out.println("Arreglo personas indice 3: " + personas[3]);

		// Arreglo utilizando notacion simplificada
		String nombres[] = { "Daniela", "Juan", "Homero", "Sara" };
		
		// Imprimir los arreglos de un arreglo
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Arreglo String indice: " + i + ": " + nombres[i]);
		}
	}
}