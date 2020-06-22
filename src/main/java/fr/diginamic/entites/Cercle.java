package fr.diginamic.entites;

/**
 * Classe implementant le concept d'un cercle
 * 
 * @author antoinelabeeuw
 *
 */
public class Cercle {
	/** rayon */
	private double rayon;
	static final double PI = Math.PI;

	/**
	 * methode qui renvoie le perimetre du cercle
	 */
	public double perimetre() {
		return (rayon * PI);
	}

	/**
	 * methode qui renvoie la surface du cercle
	 */
	public double surface() {
		return ((rayon * rayon) * PI);
	}

	/**
	 * @param rayon : le rayon du cercle
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	/**
	 * @return le rayon du cercle
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon : le rayon du cercle
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle de rayon : " + rayon + ", perimetre : " + perimetre() + " et de surface : " + surface();
	}

}
