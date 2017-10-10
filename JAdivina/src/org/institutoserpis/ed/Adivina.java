package org.institutoserpis.ed;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Adivina {

	public static void main(String[] args) {
        int rand = ThreadLocalRandom.current().nextInt(1,1000);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un número del 1 al 1000: ");
		for (int cont = 1; cont<=1000; cont++) { 
			System.out.println("Intento " + cont);
			System.out.print("Escribe un numero: ");
			String Intento = scanner.nextLine();
			int intento = Integer.parseInt(Intento);
			if (intento < rand) {
				System.out.println("El número es más grande.");
			} else if (intento > rand) {
				System.out.println("El número es más pequeño.");
			} else {
				System.out.println("Has acertado.");
				break;
			}
		}
		System.out.print("El número era el " + rand);
	}
}