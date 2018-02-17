package programame;

import java.util.Scanner;

public class CadenasVprofe {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Introduce el numero de cadenas: ");
		int n = Integer.parseInt(sr.nextLine());

		String cadena = "";
		boolean cadenaValida = false;
		int contador = 0;
		for(int i = 1; i <= n ; i++) {
			while(!cadenaValida) {
				System.out.println("Introduce una cadena:");
				cadena = sr.nextLine(); 
				if(comprobarLongitud(cadena) && comprobarAlfabeto(cadena)) { 
					cadenaValida = true; 
				}
				else {
					System.out.println("ERROR, cadena introducida no valida.");
				}
			}
			
		System.out.println("Intorduce la cadena a buscar:");
		String sTextoBuscado = sr.nextLine(); 
		
		while (cadena.indexOf(sTextoBuscado) > -1) {
			      cadena = cadena.substring(cadena.indexOf(
			        sTextoBuscado)+sTextoBuscado.length(),cadena.length());
			      contador++; 
			}
		System.out.println("NUMERO DE VECES: " + contador);
		//Comprobar cual es el numero de caracteres del minimo substring que se repite.
		calcularTamSubstring(cadena);
		comprobarLetrasIguales(cadena);
		}
		sr.close();

		}
	
		private static boolean comprobarLetrasIguales(String cadena) {
			boolean result = true;
			for (int i = 1; i < cadena.length() && result; i++) { 
				if(cadena.charAt(0) != cadena.charAt(i)) {
					result = false;
				} 
			} 
			return result;
		}
		private static int calcularTamSubstring(String cadena) {
		int tam = 0;
		int tamSubstring = 1;
		String  subCadena = "";
		int indiceRep = 0;
		if (!comprobarLetrasIguales(cadena.toLowerCase())) {
		while(tamSubstring < cadena.length()) {
		subCadena = cadena.substring(0,tamSubstring);
		indiceRep = cadena.indexOf(subCadena, tamSubstring); 
		}
		}
		return tam;
		}
		/*
		* Comprobar si el tamañao de la cadena se ajusta a las condiciones dadas.
		*/
		private static boolean comprobarLongitud(String cadena) {
		boolean result = false;
		if(cadena.length() >= 1 || cadena.length() <= 200) {
		result = true; 
		}
		return result;
		}
		/* 
		* Comprobar si la cadena solo tiene caracteres del alfabeto ingles
		*/
		private static boolean comprobarAlfabeto(String cadena) {
		boolean result = true;
		for(int i = 0; i < cadena.length() && result; i++) {
		if(!((cadena.charAt(i) >= 65 && cadena.charAt(i) <=90) || (cadena.charAt(i) >= 97  && cadena.charAt(i) <= 122)) ) {
		result = false;
		} 
		} 
		return result;
		}

	}


