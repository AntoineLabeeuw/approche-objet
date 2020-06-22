package fr.diginamic.jdr.entites;

import java.util.Random;

/**
 * classe conceptualisant le monstre troll. Herite de la classe PersoMonstre
 * 
 * @see Persomonstre
 * @author antoinelabeeuw
 *
 */
public class Troll extends PersoMonstre {

	/**
	 * Constructeur : les parametre de vie et d'attaque sont modifies
	 * 
	 */
	public Troll() {
		Random r = new Random();
		this.nom = "Troll";
		this.force = 10 + r.nextInt(6);
		this.pointsDeVie = 20 + r.nextInt(11);
	}

}
