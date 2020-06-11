package fr.diginamic.banque.entites;

/**
 * Classe conceptualisant une banque
 * @author antoinelabeeuw
 *
 */
public class Compte {
	private int numeroCompte;
	private double soldeCompte;
	
	/** 
	 * Constructeur
	 * @param numeroCompte : numero de compte
	 * @param soldeCompte : solde du compte
	 */
	public Compte(int numeroCompte, double soldeCompte) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	/** getter
	 * @return le numero du compte
	 */
	public int getNumeroCompte() {
		return numeroCompte;
	}

	/** setter
	 * @param numeroCompte : le numero du compte a modifier
	 */
	public void setNumeroCompte(int numeroCompte) {
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
	
}
