package fr.diginamic.jdr.entites;

import java.util.Random;

/**
 * classe conceptualisant le monstre loup. Herite de la classe PersoMonstre
 * 
 * @see Persomonstre
 * @author antoinelabeeuw
 *
 */
public class Loup extends PersoMonstre {

	/**
	 * Constructeur : les parametre de vie et d'attaque sont modifies
	 * 
	 */
	public Loup() {
		Random r = new Random();
		this.nom = "Loup";
		this.force = 3 + r.nextInt(6);
		this.pointsDeVie = 5 + r.nextInt(6);
	}
}
