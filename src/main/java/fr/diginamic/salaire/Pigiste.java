package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	// double pour pouvoir ajouter les demi-journees
	private double nbJours;
	private double montantJournalier;

	/**
	 * Override de la methode abstraite getSalaire() retourne le salaire du pigiste
	 *
	 */
	@Override
	public double getSalaire() {
		return (nbJours * montantJournalier);
	}
	
	/**
	 * Override de la methode abstraite getStatut : retourne "pigiste"
	 */
	@Override
	public String getStatut() {
		return ("pigiste");
	}

	/**
	 * Constructeur
	 * 
	 * @param nom               : le nom de famille du pigiste
	 * @param prenom            : le prenom du pigiste
	 * @param nbJours           : le nombre de jours travailles, prend en compte les
	 *                          demi-journees
	 * @param montantJournalier : la remuneration a la journee
	 */
	public Pigiste(String nom, String prenom, double nbJours, double montantJournalier) {
		super(nom, prenom);
		this.nbJours = nbJours;
		this.montantJournalier = montantJournalier;
	}

	/**
	 * @return : le nombre de jours travailles
	 */
	public double getNbJours() {
		return nbJours;
	}

	/**
	 * @param nbJours : le nombre de jours a modifier
	 */
	public void setNbJours(double nbJours) {
		this.nbJours = nbJours;
	}

	/**
	 * @return : le montant d'une journee entiere de travail
	 */
	public double getMontantJournalier() {
		return montantJournalier;
	}

	/**
	 * @param montantJournalier : le montant a modifier
	 */
	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}

}
