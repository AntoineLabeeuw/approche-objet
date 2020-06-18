package fr.diginamic.recensement_diff.services;

import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.recensement_diff.entites.Recensement;
import fr.diginamic.recensement_diff.services.comparators.ComparatorPopulationVille;

/**
 * implemente le service "8" Afficher les 10 villes les plus peuplées de
 * france<br/>
 * Par defaut, le nombre a afficher est de 10 mais on demande a l'utilisateur le
 * nombre a afficher<br/>
 * 
 * @author antoinelabeeuw
 *
 */
public class RechercheXVilleFrance extends MenuServices {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// ici, pas besoin de faire de sous-liste selon de departement ou la region
		// sorting directement
		Collections.sort(recensement.getListeVille(), new ComparatorPopulationVille());
		// affichage
		affichageXVilles(recensement.getListeVille(), scanner);
	}

}
