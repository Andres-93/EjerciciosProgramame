package programame;

import java.util.Scanner;

public class CadenaPkla {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String cadenaAux = "";
		String cadenaAux2 = "";
		int f = 0;
		int cont = 0;
		
		System.out.println("Introduce la cadena: ");
		String cadena = sc.nextLine();
		
		cadena = cadena.toLowerCase(); //lo transformamos todo en minusculas.
				
		String[] letras = new String[cadena.length()];
				
		for(int i = 0; i < cadena.length(); i++) {	//Guardamos en un arrya las letras de la palabra.		
			letras[i] = cadena.substring(i, i+1);			
		}

		if(cadena.length() % 2 == 0) {//Solo funciona cuando las cadenas solo se repiten 2 veces.
				
			do {
				cadenaAux += letras[f];
				
				cadenaAux2 = cadena.substring(f+1);
					
				if(cadenaAux.equals(cadenaAux2)) {
					
					cont = cadenaAux.length();
					f = cadena.length();
				}
				else {										
					f++;
				}
			
			}while(f < cadena.length());
			
			
		}
		
		else { //EN PRUEBAS.
			
			for(int k = 1; k < cadena.length(); k++) { //Este for solo comprueba si el caso es del estilo ZZZZZZ o aaaaa. J empieza en uno para no comprobarse cobnsigo mismo.
				
				if (cont == (cadena.length() - 1)) {
					cont = 1;
					break;
				}
				
				if(letras[0].equals(letras[k])) {
					cont++;
				}		
			}
			
		
		
		}
				
		System.out.println("Cadena mas pequeña encontrada: " + cadenaAux.length());
		
		
		//OPCION 2, NO FUNCIONA.
		/*
		int i = 0;
		int f = 1;
		String cadenaAux = "";
		int cont = 0;
		
		
		do {
			cadenaAux = cadena.substring(i, f);
			
			System.out.println(cadena.indexOf(cadenaAux, f));
			
			if(cadena.indexOf(cadenaAux, f) != -1) { //si encuentra la cadena devolvera algo diferente de -1.
				
				i++;
				f++;
				cont++;
						
			}
			else {			
				f++;
			}
		}while(cont < cadena.length());
		
		System.out.println(" --->" + cont);
		*/
		
		sc.close();
	}

}
