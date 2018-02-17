package programame;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int j = 0;
		int cont1 = 0;

		String[] fechas;

		System.out.println("Introduce el numero de fechas que quieras (0 para salir del programa)");
		int numFechas = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce a continuacion las fechas separadas por espacios:");
		String fechasJuntas = sc.nextLine();

		StringTokenizer sr = new StringTokenizer(fechasJuntas);

		do {

			fechas = new String[numFechas];

			for (int i = 0; i < numFechas; i++) {

				fechas[i] = sr.nextToken();

			}

			for (int k = 0; k < numFechas; k++) {
				for (j = 0; j < numFechas; j++) {

					if (fechas[k].equals(fechas[j])) {
						cont1++;
					}
				}

			}
			
			cont1 = cont1 - numFechas;
			
			if (cont1 > 0) {
				System.out.println("Si hay fechas iguales.");
			} else {
				System.out.println("No hay fechas iguales.");
			}

			System.out.println("Introduce el numero de fechas que quieras (0 para salir del programa)");
			numFechas = Integer.parseInt(sc.nextLine());

			if (numFechas > 0) {
				fechasJuntas = sc.nextLine();
				sr = new StringTokenizer(fechasJuntas);
			}

		} while (numFechas > 0);

		sc.close();

	}

}
