package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

/**
 * classe de test sur les listes de String
 * 
 * @author antoinelabeeuw
 *
 */
public class TestListeString {

	public static void main(String[] args) {
		List<String> liste = new ArrayList<>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");

		String ville = liste.get(0);
		for (String str : liste) {
			if (str.length() > ville.length()) {
				ville = str;
			}
		}
		System.out.println("Ville avec le plus grand nombre de lettres : " + ville);
		// meilleure façon avec la boucle indexée
		/*
		 * for(String str : liste) { liste.set(liste.indexOf(str), str.toUpperCase()); }
		 */
		for (int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}
		System.out.println("----- villes en majuscules -----");
		System.out.println(liste);

		// suppression de la liste si commence par "N".
		// suppression --> utilisation d'un iterator

		Iterator<String> iter = liste.iterator();
		while (iter.hasNext()) {
			String nomVille = iter.next();
			if (nomVille.startsWith("N")) {
				iter.remove();
			}
		}
		System.out.println("----- Nouvel ArrayList -----");
		System.out.println(liste);
	}
}
