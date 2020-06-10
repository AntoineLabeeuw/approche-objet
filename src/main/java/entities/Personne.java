package entities;
/**
 * Classe qui représente le concept d'une personne
 * @author antoinelabeeuw
 *
 */
public class Personne {
	/** nom */
	public String nom;
	/** prénom */
	public String prenom;
	/** adresse de la personne : classe AdressePostale */
	public AdressePostale adresse;
	
	/**
	 * @param nom : nom
	 * @param prenom : prenom
	 */
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @param nom : nom
	 * @param prenom : prenom
	 * @param adresse : adresse
	 */
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	/**
	 * affiche le prenom et le nom en majuscule
	 */
	public void affichePrenomNom() {
		System.out.println(prenom + " " + nom.toUpperCase());
	}
	
	/**
	 * @param nom : change le nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @param prenom : nouveau prenom qui remplacera celui existant
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * @param adr : nouvelle adresse
	 */
	public void setAdresse(AdressePostale adr) {
		this.adresse = adr;
	}
	
	/**
	 * @return le nom de l'instance
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @return le prenom de l'instance
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * @return l'adresse de l'instance
	 */
	public AdressePostale getAdresse() {
		return adresse;
	}
}
