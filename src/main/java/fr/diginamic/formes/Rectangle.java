package fr.diginamic.formes;

/**
 * Implementation d'une classe rectangle a partir de la classe abstraite Forme.
 * 2 methodes : calculerPerimetre et calculerSurface
 * 
 * @author antoinelabeeuw
 *
 */
public class Rectangle extends Forme {
	double longueur;
	double largeur;

	/**
	 * Constructeur
	 * 
	 * @param longueur : la longueur du rectangle
	 * @param largeur  : la largeur du rectangle
	 */
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	/**
	 * calcule la surface du rectangle a l'aide de la longueur et de la largeur
	 */
	@Override
	public double calculerSurface() {
		return (longueur * largeur);
	}

	/**
	 * calcule le perimetre du rectangle a l'aide de la longueur et de la largeur
	 */
	@Override
	public double calculerPerimetre() {
		return ((longueur + largeur) * 2);
	}

	/**
	 * @return : la longueur du rectangle
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
	 * @return : la largeur du rectangle
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
		return ("Rectangle de longueur : " + longueur + ", largeur : " + largeur + ", de surface : " + calculerSurface()
				+ " et de perimetre : " + calculerPerimetre());
	}

}
