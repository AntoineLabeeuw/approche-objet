package fr.diginamic.entites;

/**
 * conceptualise un compte qui utilise la classe client
 * 
 * @author antoinelabeeuw
 *
 */
public class Compte {
	/** client */
	private Client client;
	/** numero du compte */
	private String numeroCompte;
	/** solde */
	private double solde;

	/**
	 * Constructeur
	 * 
	 * @param client       : le client (classe client)
	 * @param numeroCompte : le numero du compte
	 * @param solde        : le solde du compte
	 */
	public Compte(Client client, String numeroCompte, double solde) {
		this.client = client;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	/**
	 * @return : le client (nom et prenom)
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client : le client a modifier
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return : le solde du client
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde : le solde a modifier
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return le numero de compte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @param numeroCompte le numero de compte a modifier
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	@Override
	public String toString() {
		return "Compte du " + client + ", numeroCompte= " + numeroCompte + ", solde= " + solde + "]";
	}

}
