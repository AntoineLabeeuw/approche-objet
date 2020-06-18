package fr.diginamic.recensement_diff.services;

import java.util.Scanner;

import fr.diginamic.recensement_diff.entites.Recensement;
import fr.diginamic.recensement_diff.entites.Ville;

/**
 * implemente le service qui affiche la population totale pour un departement
 * donne
 * 
 * @author antoinelabeeuw
 *
 */
public class RecherchePopDept extends MenuServices {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Saisissez le code du departement que vous souhaitez rechercher (exemple : 01) :");
		String codeDept = scanner.next();
		int popTotale = 0;
		for (Ville ville : recensement.getListeVille()) {
			if (ville.getCodeDept().equals(codeDept)) {
				popTotale += ville.getPopTotale();
			}
		}
		System.out.println("Population du departement " + codeDept + " : " + popTotale);
	}
}
