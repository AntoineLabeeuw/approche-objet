package fr.diginamic.recensement_diff.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import fr.diginamic.recensement_diff.entites.Departement;
import fr.diginamic.recensement_diff.entites.Recensement;
import fr.diginamic.recensement_diff.entites.Ville;
import fr.diginamic.recensement_diff.services.comparators.ComparatorPopulationDept;

/**
 * classe qui implemente le service "5" : Affiche les departements les plus
 * peuplees.<br/>
 * Demande a l'utilisateur de rentrer le nombre de rdepartements qu'il veut
 * afficher.<br/>
 * le nombre par defaut est 10
 * 
 * @author antoinelabeeuw
 *
 */
public class RechercherXPlusGrandsDept extends MenuServices {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		int nbDept = 10;
		// aggregation des population de departement
		Map<String, Integer> aggregDept = recensement.getListeVille().stream()
				.collect(Collectors.groupingBy(Ville::getCodeDept, Collectors.summingInt(Ville::getPopTotale)));
		// creation d'une liste de departements
		List<Departement> listeDept = new ArrayList<>();
		aggregDept.forEach((k, v) -> listeDept.add(new Departement(k, v)));
		// tri selon la population totale
		Collections.sort(listeDept, new ComparatorPopulationDept());
		// demande du nombre de departements a afficher
		System.out.println("Saisissez le nombre de départements à afficher (défaut 10) :");
		try {
			String scan = scanner.next();
			nbDept = Integer.parseInt(scan);
			if (nbDept > listeDept.size()) {
				System.out.println("Le nombre choisi est trop grand. La totalité des départements seront affichées.");
				nbDept = listeDept.size();
			}
		} catch (Exception e) {
			System.out.println("Impossibilité de récupérer votre entrée. 10 départements seront affichées.");
		}
		// affichage suivant le nombre de departements demandes
		for (int i = 0; i < nbDept; i++) {
			System.out.println(listeDept.get(i));
		}
	}
}
