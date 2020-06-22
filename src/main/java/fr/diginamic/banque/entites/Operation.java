package fr.diginamic.banque.entites;

/**
 * Generation de la classe abstraite Operations
 * 
 * @author antoinelabeeuw
 *
 */
public abstract class Operation {
	/** date */
	private String date;
	/** montant */
	private double montant;

	/**
	 * constructeur
	 * 
	 * @param date    : la date de l'operation
	 * @param montant : le montant de l'operation
	 */
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}

	/**
	 * @return : la date de l'operation
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date : la date a modifier
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * methode qui retourne le montant de l'operation effectuee
	 * 
	 * @return : le montant de l'operation
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montant : le montant a modifier
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * methode qui retourne le type de l'operation
	 * 
	 * @return le type de l'operation
	 */
	public abstract String getType();

	@Override
	public String toString() {
		return ("date : " + date + " | montant : " + montant);
	}

}
