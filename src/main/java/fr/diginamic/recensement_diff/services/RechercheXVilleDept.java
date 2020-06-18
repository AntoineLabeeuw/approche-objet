package fr.diginamic.recensement_diff.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement_diff.entites.Recensement;
import fr.diginamic.recensement_diff.entites.Ville;
import fr.diginamic.recensement_diff.services.comparators.ComparatorPopulationVille;

/**
 * implemente le service "6" Afficher les 10 villes les plus peuplées d’un
 * département<br/>
 * Par defaut, le nombre a afficher est de 10 mais on demande a l'utilisateur le
 * nombre a afficher<br/>
 * 
 * @author antoinelabeeuw
 *
 */
public class RechercheXVilleDept extends MenuServices {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println(
				"Saissez le numéro du département dont vous voulez afficher les villes les plus peuplées (exemple : 01):");
		String codeDept = scanner.next();
		// creation d'une sous-liste recensement a partir du code de departement donne
		// On utilisera ensuite le sort sur cette liste avec le comparator.
		List<Ville> listeVillesDept = new ArrayList<>();
		for (Ville ville : recensement.getListeVille()) {
			if (ville.getCodeDept().equals(codeDept)) {
				listeVillesDept.add(ville);
			}
		}
		// tri de la sous-liste
		Collections.sort(listeVillesDept, new ComparatorPopulationVille());
		// affichage de la classe mere MenuServices
		affichageXVilles(listeVillesDept, scanner);
	}
}
