package Interfaces;

/**
 * Classe conceptualisant un rectangle
 * 
 * @author antoinelabeeuw
 *
 */
public class Rectangle implements ObjetGeometrique {
	/** longueur */
	private double longueur;
	/** largeur */
	private double largeur;

	/**
	 * methode qui renvoie le perimetre du cercle
	 */
	public double perimetre() {
		return ((longueur + largeur) * 2);
	}

	/**
	 * methode qui renvoie la surface du cercle
	 */
	public double surface() {
		return (longueur * largeur);
	}

	/**
	 * constructeur
	 * 
	 * @param longueur : la longueur du rectangle
	 * @param largeur  : la largeur du rectangle
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	/**
	 * getter
	 * 
	 * @return la longueur du rectangle
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * setter
	 * 
	 * @param longueur : la longueur a modifier
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * getter
	 * 
	 * @return la largeur du rectangle
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * setter
	 * 
	 * @param largeur : la largeur a modifier
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "Rectangle de longueur : " + longueur + ", de largeur : " + largeur + ", de perimetre : " + perimetre()
				+ ", et de surface : " + surface();
	}

}
