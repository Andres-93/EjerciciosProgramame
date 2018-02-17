package programame;

import java.util.Scanner;
import java.util.StringTokenizer;

public class bolsa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sumaClave = 0;
		int numero = 0;
		int cont = 0;
		int aux = 0;
		int j = 0;
		String numeroCarac = "";
		
		System.out.println("Introduce el numero de la suma clave y  el numero elegido(separados por un espacio)");
		String datos = sc.nextLine();
		
		StringTokenizer sr = new StringTokenizer(datos);
		sumaClave = Integer.parseInt(sr.nextToken());  //el primer dato sera la suma clave
		numeroCarac = sr.nextToken(); //el segundo la serie de numeros
		
		numeroCarac = numeroCarac.replaceAll("0",""); //Al ser string podemos eliminar los 0 con el replaceall
				
		numero = Integer.parseInt(numeroCarac);	// transformamos el numero ya sin ceros de string a int.
		
		int[] num = new int[numeroCarac.length()];   //creamos un array de enteros del tamaño de la cantidad de numeros que tiene el numero.
		
		
		for(int i = numeroCarac.length(); i > 0 ; i--) {  //Un for en el que vamos llenando el array
			
			num[i-1] = numero % 10;	//Para hacerlo mas sencillo, empezamos de atras hacia adelante metiendo los numeros uno a uno en el array.
			numero = numero / 10;
		}
		aux = sumaClave;
		
		
		do {
			if (num[j] <= aux) {
				
				aux = aux - num[j];
				j++;
			}
			else {
				aux = sumaClave - num[j];
				cont++;
				j++;
			}
		}while(j < numeroCarac.length());
		
		System.out.println("La suma se obtiene " + (cont+1) + " veces.");	//se pone cont + 1 ya que nunca contara la ultima suma.
		
		sc.close();

	}

}
