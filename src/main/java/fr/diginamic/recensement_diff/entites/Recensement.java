package fr.diginamic.recensement_diff.entites;

import java.util.List;

/**
 * Classe qui permet de stocker un ensemble de villes
 * 
 * @author antoinelabeeuw
 *
 */
public class Recensement {
	/** La liste de toutes les villes */
	private List<Ville> listeVille;

	/**
	 * Constructeur
	 * 
	 * @param listeVille
	 */
	public Recensement(List<Ville> listeVille) {
		super();
		this.listeVille = listeVille;
	}

	/**
	 * Getter
	 * 
	 * @return the listeVille
	 */
	public List<Ville> getListeVille() {
		return listeVille;
	}

	/**
	 * Setter
	 * 
	 * @param listeVille the listeVille to set
	 */
	public void setListeVille(List<Ville> listeVille) {
		this.listeVille = listeVille;
	}

	/**
	 * Methode qui permet d'afficher la population de la ville
	 * 
	 * @param nomVille : le nom de la ville
	 */
	public void afficherPopVille(String nomVille) {
		for (Ville ville : this.listeVille) {
			if (nomVille.equalsIgnoreCase(ville.getNomCommune())) {
				System.out
						.println("population pour la ville : " + ville.getNomCommune() + " : " + ville.getPopTotale());
			}
		}
	}

	/**
	 * methode qui permet de retourner le nom de la region lorsqu'on donne son code
	 * en parametre
	 * 
	 * @param codeRegion : le code de la region
	 * @return : le nom de la region correspondante
	 */
	public String getNomRegion(String codeRegion) {
		for (Ville v : listeVille) {
			if (v.getCodeRegion().equals(codeRegion)) {
				return (v.getNomRegion());
			}
		}
		return ("Ville non trouvée. Assurez vous de ne pas avoir fait de fautes, ou que cette ville se trouve dans le dataset");
	}
}
