package programame;

import java.util.Scanner;

public class cadenaPruebas {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		String cadena = "";
		String cadenaAux = "";
		String cadenaBack = "";
		int contador = 0;
		int i = 0;
		boolean continuarBusqueda = true;
		
		System.out.println("Introduce una cadena:");
		cadena = sr.nextLine(); 
		
		cadena = cadena.toLowerCase();
		
		String[] letras = new String[cadena.length()];
		
		for(int j = 0; j < cadena.length(); j++) {	//Guardamos en un arrya las letras de la palabra.		
			letras[j] = cadena.substring(j, j+1);			
		}
		
		cadenaBack = cadena;
		
		while(continuarBusqueda) {
		
			cadenaAux += letras[i];
			
			while (cadena.indexOf(cadenaAux) > -1) {
			      cadena = cadena.substring(cadena.indexOf(
			        cadenaAux)+cadenaAux.length(),cadena.length());
			      contador++; 
			}
			
			cadena = cadenaBack;
			
			if ((contador * cadenaAux.length()) == cadena.length()) {
				continuarBusqueda = false;
			}
			else {
				i++;
			}
			contador = 0;
		
		}		
		
		System.out.println("Numero de letras de la cadena mas corta = " + cadenaAux.length());
			
		sr.close();
	}

}
