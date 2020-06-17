package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Ville {
	private String nom;
	private int population;

	/**
	 * Constructeur
	 * 
	 * @param nom        : le nom de la ville
	 * @param population : sa population
	 */
	public Ville(String nom, int population) {
		super();
		this.nom = nom;
		this.population = population;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * Setter
	 * 
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

	public static void main(String[] args) {
		List<Ville> listeVille = new ArrayList<>();
		listeVille.add(new Ville("Nice", 343000));
		listeVille.add(new Ville("Carcassonne", 47800));
		listeVille.add(new Ville("Narbonne", 53400));
		listeVille.add(new Ville("Lyon", 484000));
		listeVille.add(new Ville("Foix", 9700));
		listeVille.add(new Ville("Pau", 77200));
		listeVille.add(new Ville("Marseille", 850700));
		listeVille.add(new Ville("Tarbes", 40600));
		
		// Rechercher la ville la plus peuplee
		int max = Integer.MIN_VALUE;
		String nomVille = "";
		for (Ville ville : listeVille) {
			if (ville.getPopulation() > max) {
				max = ville.getPopulation();
				nomVille = ville.getNom();
			}
		}
		System.out.println("Ville avec le plus grand nombre d'habitants : " + nomVille + " (" + max + ")");
		// Supprimer la ville la moins peuplee
		Ville v = listeVille.get(0);
		for (Ville ville : listeVille) {
			if (ville.getPopulation() < v.getPopulation()) {
				v = ville;
			}
		}
		listeVille.remove(v);
		// Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		for (Ville ville : listeVille) {
			if (ville.getPopulation() > 100_000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		// afficher la liste modifiee
		System.out.println("----- Liste modifiée -----");
		for (Ville ville : listeVille) {
			System.out.print(ville.getNom() + " " + ville.getPopulation());
			System.out.println();
		}
	}
}
