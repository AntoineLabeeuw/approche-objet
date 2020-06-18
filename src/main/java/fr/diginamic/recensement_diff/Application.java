package fr.diginamic.recensement_diff;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import fr.diginamic.recensement_diff.entites.Ville;
import fr.diginamic.recensement_diff.services.RecherchePopDept;
import fr.diginamic.recensement_diff.services.RecherchePopRegion;
import fr.diginamic.recensement_diff.services.RecherchePopVille;
import fr.diginamic.recensement_diff.services.RechercheXVilleDept;
import fr.diginamic.recensement_diff.services.RechercheXVilleFrance;
import fr.diginamic.recensement_diff.services.RechercheXVilleReg;
import fr.diginamic.recensement_diff.services.RechercherXPlusGrandesRegions;
import fr.diginamic.recensement_diff.services.RechercherXPlusGrandsDept;
import fr.diginamic.recensement_diff.entites.Recensement;

/**
 * Classe executable pour l'application de recensement
 * 
 * @author antoinelabeeuw
 *
 */
public class Application {
	/** appliLancee : true si l'appli tourne, false sinon */
	private static boolean appliLancee = true;

	public static void main(String[] args) {
		// lecture du fichier recensement 2016.csv
		List<Ville> listeVilles = new ArrayList<>();
		try {
			File fichier = new File(
					"/Users/antoinelabeeuw/Documents/workspace-spring-tool-suite-4-4.6.2.RELEASE/approche-objet/src/main/java/fr/diginamic/recensement_diff/resources/recensement 2016.csv");
			List<String> lignes = FileUtils.readLines(fichier, "UTF-8");
			// supprestion du header du csv
			lignes.remove(0);
			for (String ligne : lignes) {
				// decoupage de la ligne
				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[9];
				// passage des variables en int et suprpression des espaces
				int popTotale = Integer.parseInt(population.replace(" ", "").trim());
				// ajout de la ville dans ListeVilles
				listeVilles.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, popTotale));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Creation de la variable recensement
		Recensement recensement = new Recensement(listeVilles);
		// menu et ses services
		
		System.out.println();
		while (appliLancee) {
			System.out.println("-----------------------------------------------");
			Scanner scanner = new Scanner(System.in);
			System.out.println("1- Rechercher la population d'une ville donnée");
			System.out.println("2- Rechercher la population d'un département donné");
			System.out.println("3- Rechercher la population d'une Région donnée");
			System.out.println("4- Afficher les X régions les plus peuplées");
			System.out.println("5- Afficher les X départements les plus peuplés");
			System.out.println("6- Afficher les X villes les plus peuplées d'un département donné");
			System.out.println("7- Afficher les X villes les plus peuplées d'une région donnée");
			System.out.println("8- Afficher les X villes les plus peuplées de France");
			System.out.println("9- Sortir");
			System.out.println("-----------------------------------------------");
			String entreeClavier = scanner.nextLine();
			// Choix des services
			switch (entreeClavier) {
			case "1":
				RecherchePopVille rechercheVille = new RecherchePopVille();
				rechercheVille.traiter(recensement, scanner);
				break;
			case "2":
				RecherchePopDept rechercheDept = new RecherchePopDept();
				rechercheDept.traiter(recensement, scanner);
				break;
			case "3":
				RecherchePopRegion rechercheReg = new RecherchePopRegion();
				rechercheReg.traiter(recensement, scanner);
				break;
			case "4":
				RechercherXPlusGrandesRegions rechercheXPlusGrandeReg = new RechercherXPlusGrandesRegions();
				rechercheXPlusGrandeReg.traiter(recensement, scanner);
				break;
			case "5":
				RechercherXPlusGrandsDept rechercheXPlusGrandDept = new RechercherXPlusGrandsDept();
				rechercheXPlusGrandDept.traiter(recensement, scanner);
				break;
			case "6":
				RechercheXVilleDept rechercheXVillesDept = new RechercheXVilleDept();
				rechercheXVillesDept.traiter(recensement, scanner);
				break;
			case "7":
				RechercheXVilleReg rechercheXVillesReg = new RechercheXVilleReg();
				rechercheXVillesReg.traiter(recensement, scanner);
				break;
			case "8":
				RechercheXVilleFrance rechercheXVillesFr = new RechercheXVilleFrance();
				rechercheXVillesFr.traiter(recensement, scanner);
				break;
			case "9":
				System.out.println("Sortie.");
				appliLancee = false;
				break;
			default:
				System.out.println("Entrée invalide. Veuillez recommencer.");
			}
		}
	}
}
