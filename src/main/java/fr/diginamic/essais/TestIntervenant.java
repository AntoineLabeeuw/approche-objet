package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

/** Classe de test pour la classe Intervenant et ses classes fille.
 * @author antoinelabeeuw
 *
 */
public class TestIntervenant {

	public static void main(String[] args) {
		Salarie s1 = new Salarie("Durand", "Jean", 2100);
		Pigiste p2 = new Pigiste("laVoix", "Jesus", 5.5, 350.0);
		System.out.println("----- Salarié -----");
		System.out.println(s1.getSalaire());
		System.out.println("----- Pigiste -----");
		System.out.println(p2.getSalaire());
		
		System.out.println();
		// avec la methode afficherDonnees
		System.out.println("----- Salarié -----");
		s1.afficheDonnees();
		System.out.println("----- Pigiste -----");
		p2.afficheDonnees();
		
	}

}
