package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**
 * classe factory de cercle
 * 
 * @author antoinelabeeuw
 *
 */
public class CercleFactory {
	/**
	 * methode qui pend en entree un rayon et retourne une instance de Cercle
	 * 
	 * @param rayon : le rayon du cercle a creer
	 * @return : l'instance de cercle cree
	 */
	public static Cercle createCercle(double rayon) {
		Cercle c1 = new Cercle(rayon);
		return c1;
	}
}
