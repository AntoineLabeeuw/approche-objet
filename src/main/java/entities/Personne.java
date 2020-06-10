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
	
	public void affichePrenomNom() {
		System.out.println(prenom + " " + nom.toUpperCase());
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAdresse(AdressePostale adr) {
		this.adresse = adr;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public AdressePostale getAdresse() {
		return adresse;
	}
}
