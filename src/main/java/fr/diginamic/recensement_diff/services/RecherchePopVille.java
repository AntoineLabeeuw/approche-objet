package fr.diginamic.recensement_diff.services;

import java.util.Scanner;

import fr.diginamic.recensement_diff.entites.Recensement;

/**
 * Implemente le service qui affiche la population pour une ville donnee
 * 
 * @author antoinelabeeuw
 *
 */
public class RecherchePopVille extends MenuServices {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Saisissez le nom de la ville que vous souhaitez chercher :");
		String nomVille = scanner.next();
		recensement.afficherPopVille(nomVille);
	}
}
