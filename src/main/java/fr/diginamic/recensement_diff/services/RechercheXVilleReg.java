package fr.diginamic.recensement_diff.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement_diff.entites.Recensement;
import fr.diginamic.recensement_diff.entites.Ville;
import fr.diginamic.recensement_diff.services.comparators.ComparatorPopulationVille;

/**
 * implemente le service "7" Afficher les 10 villes les plus peuplées d’une
 * region<br/>
 * Par defaut, le nombre a afficher est de 10 mais on demande a l'utilisateur le
 * nombre a afficher<br/>
 * 
 * @author antoinelabeeuw
 *
 */
public class RechercheXVilleReg extends MenuServices {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println(
				"Saissez le numero de la région dont vous voulez afficher les villes les plus peuplées (exemple : 11) :");
		String codeReg = scanner.next();
		// creation d'une sous-liste recensement a partir du code de region donne
		// On utilisera ensuite le sort sur cette liste avec le comparator.
		List<Ville> listeVillesReg = new ArrayList<>();
		for (Ville ville : recensement.getListeVille()) {
			if (ville.getCodeRegion().equals(codeReg)) {
				listeVillesReg.add(ville);
			}
		}
		// tri de la sous-liste
		Collections.sort(listeVillesReg, new ComparatorPopulationVille());
		// affichage
		affichageXVilles(listeVillesReg, scanner);

	}

}
