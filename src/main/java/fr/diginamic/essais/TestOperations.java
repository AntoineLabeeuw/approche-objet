package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * classe de test de la classe Operations
 * 
 * @author antoinelabeeuw
 *
 */
public class TestOperations {
	// utilisation de Math.round(total * 100D) / 100D)
	// pour eliminer les erreus d'approximation de java
	// sinon, 1;3 - 1.5 = -1.9999999999999
	public static void main(String[] args) {
		double nb1 = 1.3D;
		double nb2 = 1.5D;
		// +
		char op = '+';
		double total = Operations.calcul(nb1, nb2, op);
		System.out.println("a + b = " + Math.round(total * 100D) / 100D);
		System.out.println("--------------------------------");
		// -
		op = '-';
		total = Operations.calcul(nb1, nb2, op);
		System.out.println("a - b = " + Math.round(total * 100D) / 100D);
		System.out.println("--------------------------------");
		// /
		op = '/';
		total = Operations.calcul(nb1, nb2, op);
		System.out.println("a / b = " + Math.round(total * 100D) / 100D);
		System.out.println("--------------------------------");
		// *
		op = '*';
		total = Operations.calcul(nb1, nb2, op);
		System.out.println("a * b = " + Math.round(total * 100D) / 100D);
		System.out.println("--------------------------------");

	}

}
