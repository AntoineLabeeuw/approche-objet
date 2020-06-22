package fr.diginamic.jdr.entites;

import java.util.Random;

/**
 * Classe conceptualisant le personnage du joueur
 * 
 * @author antoinelabeeuw
 *
 */
public class Personnage extends PersoMonstre {

	/** score */
	private int score;

	/**
	 * Constructeur
	 * 
	 * @param nom : le nom du personnage
	 */
	public Personnage(String nom) {
		Random r = new Random();
		this.nom = nom;
		this.force = 12 + r.nextInt(7);
		this.pointsDeVie = 20 + r.nextInt(31);
		this.score = 0;
	}

	/**
	 * Getter
	 * 
	 * @return le score du personnage
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Setter
	 * 
	 * @param score : le score a modifier
	 */
	public void setScore(int score) {
		this.score = score;
	}

}
