package fr.diginamic.jdr;

import java.util.Scanner;

import fr.diginamic.jdr.entites.Personnage;

public class Jeu {
	private static boolean jeuLance = true;
	private static Personnage joueur = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (jeuLance) {
			MethodesInteractives.afficherMenu(scanner);
		}
		scanner.close();
	}

	public static boolean isJeuLance() {
		return jeuLance;
	}

	public static void setJeuLance(boolean jeuLance) {
		Jeu.jeuLance = jeuLance;
	}

	public static Personnage getJoueur() {
		return joueur;
	}

	public static void setJoueur(Personnage joueur) {
		Jeu.joueur = joueur;
	}

	public static void afficherScore() {
		if (Jeu.getJoueur() == null) {
			System.out.println(
					"Vous n'avez pas créé de personnage, vous avec donc par défaut un score de 0.\nVeuillez créer un personnage afin de jouer.");
		} else {
			System.out.println("Votre score est de : " + Jeu.joueur.getScore());
		}
	}

}
