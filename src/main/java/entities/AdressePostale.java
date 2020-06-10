package entities;
/**
 * Classe qui représente l'adresse postale
 * @author antoinelabeeuw
 *
 */
public class AdressePostale {
	/** numéro de la rue */
	public int numeroRue;
	/** libellé de la rue */
	public String libelleRue;
	/** code postal */
	public int codePostal;
	/** numéro de la rue */
	public String ville;
	
	
	/**
	 * @param numeroRue : numéro de rue
	 * @param libelleRue : libellé de rue
	 * @param codePostal : code postal
	 * @param ville : ville
	 */
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}

