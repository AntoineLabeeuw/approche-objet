package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

/** classe de test pour le TP5
 * @author antoinelabeeuw
 *
 */
public class TestBanque {

	public static void main(String[] args) {
		// affiche fr.diginamic.banque.entites.Compte@626b2d4a
		Compte c1 = new Compte(12345,00.00);
		System.out.println(c1);
		// Si on veut print les infos de l'instance
		System.out.println(c1.getNumeroCompte());
		System.out.println(c1.getSoldeCompte());

	}

}
