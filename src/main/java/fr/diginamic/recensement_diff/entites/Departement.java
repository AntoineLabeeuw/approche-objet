package fr.diginamic.recensement_diff.entites;

/**
 * Classe qui permet de stocker des departements
 * 
 * @author antoinelabeeuw
 *
 */
public class Departement {
	/** Le code du departement */
	String codeDept;
	/** La poplation totale du departement */
	int popTotale;

	/**
	 * Constructeur
	 * 
	 * @param codeDept  : le code du departement
	 * @param popTotale : la population totale du departement
	 */
	public Departement(String codeDept, int popTotale) {
		super();
		this.codeDept = codeDept;
		this.popTotale = popTotale;
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
		return "Departement : " + codeDept + ", popTotale : " + popTotale;
	}

}
