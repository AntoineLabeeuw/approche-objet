package fr.diginamic.jdr;

import java.util.Scanner;

import fr.diginamic.jdr.entites.Personnage;

/**
 * classe qui permet de gerer de jeu (lancement, affichage du menu etc.)
 * 
 * @author antoinelabeeuw
 *
 */
public class Jeu {
	/** jeuLance */
	private static boolean jeuLance = true;
	/** joueur */
	private static Personnage joueur = null;

	/**
	 * methode principale, permet de lancer le jeu
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (jeuLance) {
			MethodesInteractives.afficherMenu(scanner);
		}
		scanner.close();
	}

	/**
	 * methode permettant de savoir si le jeu est lance ou non. retourne true si il
	 * l'est
	 * 
	 * @return jeuLance
	 */
	public static boolean isJeuLance() {
		return jeuLance;
	}

	/**
	 * Setter
	 * 
	 * @param jeuLance : le booleen a modifier
	 */
	public static void setJeuLance(boolean jeuLance) {
		Jeu.jeuLance = jeuLance;
	}

	/**
	 * getter
	 * 
	 * @return : le personnage du joueur
	 */
	public static Personnage getJoueur() {
		return joueur;
	}

	/**
	 * Setter
	 * 
	 * @param joueur : le personnage joueur a modifier
	 */
	public static void setJoueur(Personnage joueur) {
		Jeu.joueur = joueur;
	}

	/**
	 * Methode permettant d'fficher le score du personnage. Si aucun personnage
	 * n'est cree, le score est de 0.
	 * 
	 */
	public static void afficherScore() {
		if (Jeu.getJoueur() == null) {
			System.out.println(
					"Vous n'avez pas créé de personnage, vous avec donc par défaut un score de 0.\nVeuillez créer un personnage afin de jouer.");
		} else {
			System.out.println("Votre score est de : " + Jeu.joueur.getScore());
		}
	}

}
