package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1000) + 1;

        System.out.println("Número aleatorio=" + numeroAleatorio);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adivina el número (entre 1 y 1000): ");

        String numero = scanner.nextLine();
        int numeroIntroducido = Integer.parseInt(numero);

        while (numeroIntroducido != numeroAleatorio) {
        	if (numeroAleatorio < numeroIntroducido)
        		System.out.print("Es menor que ese. Vuelve a intentarlo: ");
        	else
        		System.out.print("Es mayor que ese. Vuelve a intentarlo: ");
        	numero = scanner.nextLine();
        	numeroIntroducido = Integer.parseInt(numero);
        }
        System.out.println("Enhorabuena. Has acertado.");
	}

}
