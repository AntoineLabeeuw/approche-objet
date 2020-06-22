package listes;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase permettant de creer des listes
 * 
 * @author antoinelabeeuw
 *
 */
public class CreationListe {

	public static void main(String[] args) {
		List liste = new ArrayList();

		for (int i = 0; i < 100; i++) {
			liste.add(i + 1);
		}
		// affichage de la taille de la liste
		System.out.println("----- Taille de la liste -----");
		System.out.println(liste.size());
	}
}
