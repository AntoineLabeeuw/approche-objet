package fr.diginamic.formes;

/**
 * implemente la classe carre a partir de la classe rectangle un carre a tous
 * les cotes de la meme taille
 * 
 * @author antoinelabeeuw
 *
 */
public class Carre extends Rectangle {

	/**
	 * Constructeur d'un carre <br/>
	 * Utilise le constructeur de rctangle, mais en mettant la même valeur dans
	 * largeur et longueur.
	 * 
	 * @param cote : le cote du carre
	 */
	public Carre(double cote) {
		super(cote, cote);
	}
}
