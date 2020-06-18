package fr.diginamic.recensement_diff.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement_diff.entites.Recensement;
import fr.diginamic.recensement_diff.entites.Ville;

/**
 * classe abstraite qui sert de base aux differents services du menu
 * 
 * @author antoinelabeeuw
 *
 */
public abstract class MenuServices {
	/**
	 * Methode abstraite de traitement. Est definie dans les classes filles avec
	 * differentes methodes selon le choix du menu
	 * 
	 * @param recensement : la liste de villes
	 * @param scanner     : le scanner, interaction avec l'utilisateur
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner);

	/**
	 * Methode permettant d'afficher un certain nombre de villes defini par
	 * l'utilisateur
	 * 
	 * @param liste   : la liste des villes
	 * @param scanner : le scanner, interaction avec l'utilisateur
	 */
	public void affichageXVilles(List<Ville> liste, Scanner scanner) {
		// initialisation du nombre de villes a afficher a 10
		// le TP est cense demande les 10 premieres villes uniquement
		int nbVilles = 10;
		System.out.println("Saisissez le nombre de villes à afficher (défaut 10) :");
		// recuperation de ce qu'ecrit l'utilisateur, si erreur, on reste a 10
		try {
			String scan = scanner.next();
			nbVilles = Integer.parseInt(scan);
			if (nbVilles > liste.size()) {
				System.out.println("Le nombre choisi est trop grand. Seule les 10 premières villes seront affichées.");
				nbVilles = liste.size();
			}
		} catch (Exception e) {
			System.out.println("Impossibilité de récupérer votre entrée. 10 villes seront affichées.");
		}
		// Boucle pour aficher le nombre demande
		for (int i = 0; i < nbVilles; i++) {
			System.out.println(liste.get(i));
		}
	}
}
