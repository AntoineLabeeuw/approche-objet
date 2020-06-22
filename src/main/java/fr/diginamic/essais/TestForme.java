package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.AffichageForme;

/**
 * Classe de test pour la super classe Forme et ses classes filles <br/>
 * Classe de test de la classe AffichageForme
 * 
 * @author antoinelabeeuw
 *
 */
public class TestForme {
	public static void main(String[] args) {
		Cercle c1 = new Cercle(2.4);
		Rectangle r2 = new Rectangle(3, 4);
		Carre c3 = new Carre(5.5);
		System.out.println("------- Cercle -------");
		AffichageForme.afficher(c1);
		System.out.println("------- Rectangle -------");
		AffichageForme.afficher(r2);
		System.out.println("------- Carre -------");
		AffichageForme.afficher(c3);

	}

}
