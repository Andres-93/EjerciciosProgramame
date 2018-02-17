package ej2015;

import java.util.Scanner;

public class Polidivisibles {

	public static void main(String[] args) {
		
		boolean continuar = true;
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("Introduzca el numero que desea comprobar: ");
		//OTRO COMENTARIO.
		int num = Integer.parseInt(sc.nextLine());
				
		int numCifras = contarCifras(num);   //contamos las cifras del numero
		
		while(continuar && numCifras > 0) {
			
			if( num % numCifras == 0) {
				numCifras--;
				num = num/10;
			}
			else {
				continuar = false;
			}
				
		}
		if (continuar == true) {
			System.out.println("POLIDIVISIBLE");
		} else {
			System.out.println("NO POLIDIVISIBLE");
		}
		sc.close();
	}

	private static int contarCifras(int numero) {

		int cifras = 0;

		while (numero > 0) {
			numero = numero / 10;
			cifras++;
		}
		return cifras;
	}

}
