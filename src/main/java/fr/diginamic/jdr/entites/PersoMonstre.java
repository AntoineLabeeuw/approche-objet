package fr.diginamic.jdr.entites;

import java.util.Random;

/**
 * classe conceptualisant le personnage, mais aussi les monstres.
 * 
 * @author antoinelabeeuw
 *
 */
public class PersoMonstre {
	/** nom */
	protected String nom;
	/** force */
	protected int force;
	/** points de vie */
	protected int pointsDeVie;

	/**
	 * methode de calcul de l'attaque pour le caractere et les monstres
	 * 
	 * @return la force de l'attaque
	 */
	public int getAttaque() {
		// nextInt(10) fait de 0 a 9, on ajoute +1 pour faire de 1 a 10
		Random r = new Random();
		return (force + 1 + r.nextInt(10));
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**
	 * Setter
	 * 
	 * @param force : the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * Getter
	 * 
	 * @return : points de vie
	 */
	public int getPointsDeVie() {
		return pointsDeVie;
	}

	/**
	 * Setter
	 * 
	 * @param pointsDeVie : les points de vie a modifier
	 */
	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

}
