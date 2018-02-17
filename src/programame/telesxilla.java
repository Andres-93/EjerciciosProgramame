package programame;

import java.util.Scanner;
import java.util.StringTokenizer;

public class telesxilla {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pesoMax = 0;
		int numPersonas = 0;
		int contViajes = 0;
		int l = 0;
	
	

		System.out.println("Introduzca el peso maximo de la silla( 2 plazas), y el numero de usuarios que van a utilizarla(separados por unn espacio en blanco:");
		String datosSilla = sc.nextLine();

		StringTokenizer sr = new StringTokenizer(datosSilla);
		//Guardamos los datos introducidos en su variable correspondiente.
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				pesoMax = Integer.parseInt(sr.nextToken());
			} else {
				numPersonas =  Integer.parseInt(sr.nextToken());
			}
		}
		
		System.out.println("Introduce a continuacion en una linea el peso de las persona, separadas por un espacio:");
		
		String pesos = sc.nextLine();
		
		sr = new StringTokenizer(pesos);
		
		int[] pesosPers = new int[numPersonas];
		//guardamos en un array de enteros los pesos de las personas.
		for(int k = 0; k < numPersonas; k++) {
			pesosPers[k] = Integer.parseInt(sr.nextToken());
		}
		
		
				
		//pesoMax - pesosPers[l] > 0
		while(l < numPersonas) {
			
			if(l == numPersonas-1){
				contViajes++;
				l++;
			}
			
			else if (pesosPers[l] + pesosPers[l+1] <= pesoMax) {
				contViajes++;
				l = l + 2;
			}
			else {
				contViajes++;
				l = l + 1;
			}
			
			
		}
		
		System.out.println("Se necesitaran "+ contViajes + " viajes.");
		
		
		//Lo hara el numero de pesos que metas, hay que buscar un modo de que solo deje meter numPersonas como maximo.
		/*for(int j = 0; j < numPersonas; j++) {		
			
			pesoRest = pesoMax - pesosPers[j];

			while() {
				if(pesosPers[j+l] <= pesoRest) {
					
					pesoRest = pesoRest -pesosPers[j+l];
					l++;
					
				}
			}
			
			
		}
		*/
		 
		sc.close();

	}

}
