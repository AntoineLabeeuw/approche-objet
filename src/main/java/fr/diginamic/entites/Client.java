package fr.diginamic.entites;

/**
 * Classe conceptualisant un client defini par un nom et un prenom
 * 
 * @author antoinelabeeuw
 *
 */
public class Client {
	/** nom */
	private String nom;
	/** prenom */
	private String prenom;

	/**
	 * Constructeur
	 * 
	 * @param nom    : le nom a ajouter
	 * @param prenom : le prenom a ajouter
	 */
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @return le nom du client
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom le prenom du client a modifier
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return le nom du client
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom du client a modifier
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Client : " + nom + " " + prenom;
	}

}
