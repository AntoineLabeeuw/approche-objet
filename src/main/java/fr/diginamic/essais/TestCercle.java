package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/**
 * classe de test pour le cercle
 * 
 * @author antoinelabeeuw
 *
 */
public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(2.0);
		Cercle c2 = new Cercle(1.5);
		// Methodes peuvent être ressorties avec
		// l'override de la methode toString()
		System.out.println(c1);
		System.out.println(c2);

		// test de la classe CercleFactory
		System.out.println("-------------------");
		Cercle c3 = CercleFactory.createCercle(4);
		System.out.println(c3);

	}

}
