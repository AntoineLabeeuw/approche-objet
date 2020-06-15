package fr.diginamic.salaire;

/**
 * Classe definissant abtraitement un intervenant defini par un nom et un prenom
 * la methode getSalaire() est definie dans les classes filles
 * 
 * @author antoinelabeeuw
 *
 */
public abstract class Intervenant {
	private String nom;
	private String prenom;

	/**
	 * @return le salaire de l'intervenant selon son statut
	 */
	public abstract double getSalaire();

	/**
	 * @return le statut de l'intervenant
	 */
	public abstract String getStatut();

	public void afficheDonnees() {
		System.out.println("La personne s'appelle : " + getNom() + " " + getPrenom() + ", elle est " + getStatut()
				+ " et est payée mensuellement " + getSalaire() + "€");
	}

	/**
	 * Constructeur
	 * 
	 * @param nom    : le nom de famille du salarie
	 * @param prenom : le prenom du salarie
	 */
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @return : le nom de famille de l'intervenant
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom : le nom de famille a modifier
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return le prenom de l'intervenant
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom : le prenom a modifier
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
