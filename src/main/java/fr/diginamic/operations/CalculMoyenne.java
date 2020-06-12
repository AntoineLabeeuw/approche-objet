package fr.diginamic.operations;

import java.util.Arrays;

/**
 * Classe qui calcule la moyenne d'un tableau
 * 
 * @author antoinelabeeuw
 *
 */
public class CalculMoyenne {
	private double[] tabNote;

	/**
	 * consturcteur : cree un tableau de double vide de taille 1.
	 */
	public CalculMoyenne() {
		this.tabNote = new double[0];
	}

	/** methode qui permet d'ajouter une nouvelle valeur au tableau.
	 * Si le tableau est plein, la methode permet de rajouter une case automatiquement
	 * a celui-ci.
	 * @param newValeur : la nouvelle valeur a ajouter
	 */
	public void ajout(double newValeur) {
		// creation d'un tableau de taille tabNote + 1
		double[] newTableau = new double[tabNote.length + 1];
		// stockage de toutes les valeurs de tabNote dans le nouveau tableau
		for (int i = 0; i < tabNote.length; i++) {
			newTableau[i] = tabNote[i];
		}
		// ajout de la nouvelle valeur a la fin du tableau
		newTableau[newTableau.length - 1] = newValeur;
		// le tableau prend la place de l'anctien
		this.tabNote = newTableau;
	}

	/** methode qui permet de calculer la moyenne des tableaux.
	 * @return la moyenne du tableau
	 */
	public double calcul() {
		double moyenne = 0D;
		// somme de toutes les valeurs
		for (int i = 0; i < tabNote.length; i++) {
			moyenne += tabNote[i];
		}
		// division par le nombre de valeurs
		moyenne = moyenne / tabNote.length;
		return (moyenne);
	}

	@Override
	public String toString() {
		return "tableau des valeurs : tabNote=" + Arrays.toString(tabNote);
	}
}
