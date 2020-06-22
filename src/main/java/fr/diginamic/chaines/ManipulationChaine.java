package fr.diginamic.chaines;

import fr.diginamic.entites.Compte;
import fr.diginamic.entites.Client;

/**
 * classe executable de test pour les manipulations de chaines
 * 
 * @author antoinelabeeuw
 *
 */
public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";
		// affichage du premier caractere
		System.out.println("Premier caractère: " + chaine.charAt(0));
		// affichage de la taille de la chaine
		System.out.println("Taille de la chaine: " + chaine.length());
		// affichage de l'index du premier ";"
		System.out.println("Premier ';' trouvé: " + chaine.indexOf(';'));
		// extraction du nom de famille
		System.out.println("Nom de famille: " + chaine.substring(0, chaine.indexOf(';')));
		// affichage en majuscules
		System.out.println("Nom de famille: " + chaine.substring(0, chaine.indexOf(';')).toUpperCase());
		// affichage en minuscules
		System.out.println("Nom de famille: " + chaine.substring(0, chaine.indexOf(';')).toLowerCase());
		// decoupage avec split()
		String tab[] = chaine.split(";");
		System.out.println("Tableau des informations: ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " | ");
		}
		System.out.println();
		// suppression de l'espace et transformation en double pour le salaire
		double solde = Double.parseDouble(tab[3].replace(" ", ""));
		System.out.println(solde);

		// creation de l'instance d'un client
		Client c1 = new Client(tab[0], tab[1]);
		System.out.println(c1);
		// creation de l'instance d'un compte
		Compte cpt1 = new Compte(c1, tab[2], solde);
		System.out.println(cpt1);

	}

}
