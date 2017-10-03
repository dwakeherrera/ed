package org.institutoserpis.ed;

import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dime tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Hola " + nombre);
	}
}
