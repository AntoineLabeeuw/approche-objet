package fr.diginamic.recensement_diff.services;

import java.util.Scanner;

import fr.diginamic.recensement_diff.entites.Recensement;
import fr.diginamic.recensement_diff.entites.Ville;

/**
 * implemente le service qui affiche la population totale pour une region donnee
 * 
 * @author antoinelabeeuw
 *
 */
public class RecherchePopRegion extends MenuServices {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Saisissez le code de la region que vous souhaitez rechercher :");
		String codeRegion = scanner.next();
		int popTotale = 0;
		for (Ville ville : recensement.getListeVille()) {
			if (ville.getCodeDept().equals(codeRegion)) {
				popTotale += ville.getPopTotale();
			}
		}
		System.out.println("Population du departement " + codeRegion + " : " + popTotale);
	}

}
