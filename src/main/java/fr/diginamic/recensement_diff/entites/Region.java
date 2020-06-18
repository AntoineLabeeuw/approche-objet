package fr.diginamic.recensement_diff.entites;

/**
 * Classe qui permet de stocker des Regions
 * 
 * @author antoinelabeeuw
 *
 */
public class Region {
	/** code de la region */
	private String codeRegion;
	/** nom de la region */
	private String nom;
	/** population totale */
	private int popTotale;

	/**
	 * Getter
	 * 
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/**
	 * Setter
	 * 
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
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
	 * @return the popTotale
	 */
	public int getPopTotale() {
		return popTotale;
	}

	/**
	 * Setter
	 * 
	 * @param popTotale the popTotale to set
	 */
	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}

	/**
	 * Constructeur
	 * 
	 * @param codeRegion : le code de la region
	 * @param nom        : le nom de la region
	 * @param popTotale  : la population totale de la region
	 */
	public Region(String codeRegion, String nom, int popTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nom = nom;
		this.popTotale = popTotale;
	}

	@Override
	public String toString() {
		return "Region " + nom + " (" + codeRegion + "), Population : " + popTotale;
	}

}
