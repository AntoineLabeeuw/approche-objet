package Interfaces;

public class Rectangle implements ObjetGeometrique {
	private double longueur;
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
	 * @param longueur : la longueur du rectangle
	 * @param largeur  : la largeur du rectangle
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	/**
	 * @return la longueur du rectangle
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur : la longueur a modifier
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return la largeur du rectangle
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
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
