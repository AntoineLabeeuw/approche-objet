package fr.diginamic.entites;

/**
 * implemente la classe compte utilise la classe client
 * 
 * @author antoinelabeeuw
 *
 */
public class Compte {
	private Client client;
	private String numeroCompte;
	private double solde;

	/**
	 * @param client : le client, genere par la classe Client
	 * @param solde  : double
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
