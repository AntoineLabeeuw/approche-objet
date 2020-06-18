package fr.diginamic.recensement_diff.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import fr.diginamic.recensement_diff.entites.Recensement;
import fr.diginamic.recensement_diff.entites.Ville;
import fr.diginamic.recensement_diff.services.comparators.ComparatorPopulationRegion;
import fr.diginamic.recensement_diff.entites.Region;

/**
 * classe qui implemente le service "4" : Affiche les regions les plus
 * peuplees<br/>
 * Demande a l'utilisateur de rentrer le nombre de regions qu'il veut
 * afficher.<br/>
 * le nombre par defaut est 10
 * 
 * @author antoinelabeeuw
 *
 */
public class RechercherXPlusGrandesRegions extends MenuServices {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		int nbRegions = 10;
		// aggregation par regions
		Map<String, Integer> aggregRegion = recensement.getListeVille().stream()
				.collect(Collectors.groupingBy(Ville::getCodeRegion, Collectors.summingInt(Ville::getPopTotale)));
		// creation liste de regions
		List<Region> listeRegion = new ArrayList<>();
		aggregRegion.forEach((k, v) -> listeRegion.add(new Region(k, recensement.getNomRegion(k), v)));
		// tri des regions dans l'ordre decroissant de population
		Collections.sort(listeRegion, new ComparatorPopulationRegion());
		// demande a l'utilisateur le nombre de regions a afficher. Si erreur, nombre
		// par defaut est 10
		System.out.println("Saisissez le nombre de régions à afficher (défaut 10) :");
		try {
			String scan = scanner.next();
			nbRegions = Integer.parseInt(scan);
			if (nbRegions > listeRegion.size()) {
				System.out.println("Le nombre choisi est trop grand. La totalité des régions seront affichées.");
				nbRegions = listeRegion.size();
			}
		} catch (Exception e) {
			System.out.println("Impossibilité de récupérer votre entrée. 10 régions seront affichées.");
		}
		// affichage
		for (int i = 0; i < nbRegions; i++) {
			System.out.println(listeRegion.get(i));
		}
	}
}
