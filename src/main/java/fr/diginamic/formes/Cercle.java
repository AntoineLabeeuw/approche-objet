package fr.diginamic.formes;

/**
 * Implementation d'une classe cercle a partir de la classe abstraite Forme. 2
 * methodes : calculerPerimetre et calculerSurface
 * 
 * @author antoinelabeeuw
 *
 */
public class Cercle extends Forme {
	/** rayon */
	private double rayon;
	/** PI */
	static final double PI = Math.PI;

	/**
	 * constructeur
	 * 
	 * @param rayon : le rayon du cercle
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * definition de la methode calculerSurface Calcule la surface du cercle a
	 * l'aide de son rayon et de PI
	 */
	@Override
	public double calculerSurface() {
		return ((rayon * rayon) * PI);
	}

	/**
	 * Definition de la methode calculerPerimetre Calcule le perimetre du cercle a
	 * l'aide se son rayon et de PI
	 */
	@Override
	public double calculerPerimetre() {
		return (rayon * PI);
	}

	/**
	 * @return : le rayon du cercle
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon le rayon du cercle a modifier
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle de rayon : " + rayon + ", perimetre : " + calculerPerimetre() + " et de surface : "
				+ calculerSurface();
	}

}
