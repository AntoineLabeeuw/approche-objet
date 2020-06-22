package fr.diginamic.testenumeration;

/**
 * enumerations des 5 continents
 * 
 * @author antoinelabeeuw
 *
 */
public enum Continent {
	ASIE("Asie"), OCEANIE("Oceanie"), AFRIQUE("Afrique"), EUROPE("Europe"), AMERIQUE("Amerique");

	/** libelle */
	private String libelle;

	/**
	 * Constructeur
	 * 
	 * @param libelle
	 */
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
