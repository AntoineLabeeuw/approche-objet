package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * Classe de test pour le calcul de moyenne
 * 
 * @author antoinelabeeuw
 *
 */
public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne tabValeurs = new CalculMoyenne();
		tabValeurs.ajout(2.5);
		// verification du bon ajout
		System.out.println(tabValeurs);
		tabValeurs.ajout(5.0);
		// verification du bon ajout
		System.out.println(tabValeurs);
		// test de la moyenne
		System.out.println(tabValeurs.calcul());

		tabValeurs.ajout(7.5);
		// verification du bon ajout
		System.out.println(tabValeurs);
		// test de la moyenne
		System.out.println(tabValeurs.calcul());

	}

}
