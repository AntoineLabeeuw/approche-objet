package fr.diginamic.formes;

/**
 * classe abstraite pour la definition de formes.
 * 
 * @author antoinelabeeuw
 *
 */
public abstract class Forme {
	/**
	 * @return la surface de la forme. methode abstraite sera definie dans les
	 *         classes filles
	 */
	public abstract double calculerSurface();

	/**
	 * @return le perimetre de la forme. methode abstraite sera definie dans les
	 *         classes filles
	 */
	public abstract double calculerPerimetre();
}
