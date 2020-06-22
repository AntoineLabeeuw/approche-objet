package fr.diginamic.jdr.entites;

import java.util.Random;

/**
 * classe conceptualisant le monstre gobelin. Herite de la classe PersoMonstre
 * 
 * @see Persomonstre
 * 
 * @author antoinelabeeuw
 *
 */
public class Gobelin extends PersoMonstre {
	/**
	 * Constructeur du gobelin. Les valeurs d'attaque et de vie sont modifies
	 * 
	 */
	public Gobelin() {
		Random r = new Random();
		this.nom = "Gobelin";
		this.force = 5 + r.nextInt(6);
		this.pointsDeVie = 10 + r.nextInt(6);
	}
}
