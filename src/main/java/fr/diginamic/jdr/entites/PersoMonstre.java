package fr.diginamic.jdr.entites;

import java.util.Random;

public class PersoMonstre {
	protected String nom;
	protected int force;
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

	

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

}
