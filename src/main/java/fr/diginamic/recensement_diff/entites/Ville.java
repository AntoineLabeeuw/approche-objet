package fr.diginamic.recensement_diff.entites;

/**
 * classe Ville qui permet de stocker des villes
 * 
 * @author antoinelabeeuw
 *
 */
public class Ville {

	/** code de la region */
	private String codeRegion;
	/** nom de la region */
	private String nomRegion;
	/** code du departement */
	private String codeDept;
	/** code de la commune */
	private String codeCommune;
	/** nom de la commune */
	private String nomCommune;
	/** population totale de la commune */
	private int popTotale;

	/**
	 * Constructeur
	 * 
	 * @param codeRegion  : le code de la region
	 * @param nomRegion   : le nom de la region
	 * @param codeDept    : le code du departement
	 * @param codeCommune : le code de la commune
	 * @param nomCommune  : le nom de la commune
	 * @param popTotale   : la population totale de la commune
	 */
	public Ville(String codeRegion, String nomRegion, String codeDept, String codeCommune, String nomCommune,
			int popTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popTotale = popTotale;
	}

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
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * Setter
	 * 
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/**
	 * Getter
	 * 
	 * @return the codeDept
	 */
	public String getCodeDept() {
		return codeDept;
	}

	/**
	 * Setter
	 * 
	 * @param codeDept the codeDept to set
	 */
	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}

	/**
	 * Getter
	 * 
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/**
	 * Setter
	 * 
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/**
	 * Getter
	 * 
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**
	 * Setter
	 * 
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
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

	@Override
	public String toString() {
		return "Ville : " + nomCommune + " ( " + nomRegion + ", departement " + codeDept + "), Population totale : "
				+ popTotale;
	}

}
