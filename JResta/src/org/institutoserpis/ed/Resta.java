package org.institutoserpis.ed;

import java.math.BigDecimal;
import java.util.Scanner;

public class Resta {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		String primerNumero = scanner.nextLine();
		BigDecimal primero = new BigDecimal (primerNumero);
		System.out.print("Introduce otro número: ");
		String segundoNumero = scanner.nextLine();
		BigDecimal segundo = new BigDecimal (segundoNumero);
		BigDecimal resta = primero.subtract(segundo);
		System.out.println("La resta es " + resta);
	}
}
