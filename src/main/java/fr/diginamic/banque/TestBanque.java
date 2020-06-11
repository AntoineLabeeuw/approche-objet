package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * classe de test pour le TP5
 * 
 * @author antoinelabeeuw
 *
 */
public class TestBanque {

	public static void main(String[] args) {
		// affiche fr.diginamic.banque.entites.Compte@626b2d4a
		Compte c1 = new Compte("12345", 00.00);
		System.out.println(c1);
		/*
		 * Si on veut print les infos de l'instance sans redéfinir la méthode toString()
		 * System.out.println(c1.getNumeroCompte());
		 * System.out.println(c1.getSoldeCompte());
		 */

		System.out.println("\nTP7\n");
		Compte[] tabCompte = new Compte[2];
		tabCompte[0] = new Compte("123", 12.24);
		tabCompte[1] = new CompteTaux("456", 24.48, 1.8);

		// loop on table
		// premier tour : toString() défini à la classe compte
		// 2e tour : toString() défini à la classe CompteTaux
		for (int i = 0; i < tabCompte.length; i++) {
			System.out.println(tabCompte[i]);
			System.out.println();
		}
	}

}
