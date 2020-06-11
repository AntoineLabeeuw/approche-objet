package fr.diginamic.banque.entites;

/**
 * Classe conceptualisant une banque
 * @author antoinelabeeuw
 *
 */
public class Compte {
	private String numeroCompte;
	private double soldeCompte;
	
	/** 
	 * Constructeur
	 * @param numeroCompte : numero de compte
	 * @param soldeCompte : solde du compte
	 */
	public Compte(String numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	/** getter
	 * @return le numero du compte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/** setter
	 * @param numeroCompte : le numero du compte a modifier
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/** getter
	 * @return le solde du compte
	 */
	public double getSoldeCompte() {
		return soldeCompte;
	}

	/** setter
	 * @param soldeCompte le solde a modifier
	 */
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	/**
	 * redefinition de la methode toString()
	 * affiche le numero du compte et son solde
	 */
	@Override
	public String toString() {
		// auto generated one
		//return "Compte [numeroCompte=" + numeroCompte + ", soldeCompte=" + soldeCompte + "]";
		return("Numéro de compte : " + numeroCompte + "\nSolde du compte : " + soldeCompte);
	}
}
