package fr.diginamic.jdr;

import java.util.Scanner;
import java.util.Random;
import fr.diginamic.jdr.entites.Personnage;
import fr.diginamic.jdr.entites.Loup;
import fr.diginamic.jdr.entites.PersoMonstre;
import fr.diginamic.jdr.entites.Gobelin;
import fr.diginamic.jdr.entites.Troll;


public class MethodesInteractives {
	public static void afficherMenu(Scanner scanner) {
		System.out.println("----- Menu -----");
		System.out.println("1. Créer un personnage");
		System.out.println("2. Combattre une créature");
		System.out.println("3. Afficher votre score");
		System.out.println("4. Quitter");
		System.out.println("----------------");
		String entreeClavier = scanner.nextLine();

		switch (entreeClavier) {
		case "1":
			CreationPersonnage(scanner);
			break;
		case "2":
			if (Jeu.getJoueur() == null) {
				System.out.println("Vous n'avez pas créé de personnage. Veuillez en créer un.");
				break;
			}
			if (Jeu.getJoueur().getPointsDeVie() > 0) {
				tourCombat();
			} else {
				System.out.println("Votre personnage est mort, veuillez en créer un autre");
			}
			break;
		case "3":
			Jeu.afficherScore();
			break;
		case "4":
			Jeu.setJeuLance(false);
			break;
		}

	}

	public static void CreationPersonnage(Scanner scanner) {
		System.out.println("Donnez un nom a votre personnage :");
		String entreeClavier = scanner.nextLine();
		Personnage joueur = new Personnage(entreeClavier);
		Jeu.setJoueur(joueur);
		System.out.println("Votre personnage a " + Jeu.getJoueur().getPointsDeVie() + " points de vie et une force de "
				+ Jeu.getJoueur().getForce() + ".");
		if(Jeu.getJoueur().getForce() < 14) {
			System.out.println("...Éspérons que vous ne rencontrerez que des loups...");
		} else {
			System.out.println("Il est fort ! La chance est de votre coté !");
		}
	}

	public static void tourCombat() {
		// creation d'un monstre
		Random r = new Random();
		int nbAleatoire = r.nextInt(3);
		int points = 0;
		PersoMonstre monstre = null;
		if (nbAleatoire == 0) {
			monstre = new Loup();
			points = 1;
		} else if (nbAleatoire == 1) {
			monstre = new Gobelin();
			points = 2;
		} else {
			monstre = new Troll();
			points = 5;
		}
		System.out.println("Un " + monstre.getNom() + " apparait !\nIl a " + monstre.getPointsDeVie()
				+ " points de vie et une force de " + monstre.getForce() + ".");
		while (Jeu.getJoueur().getPointsDeVie() > 0 && monstre.getPointsDeVie() > 0) {
			int attaqueJoueur = Jeu.getJoueur().getAttaque();
			int attaqueMonstre = monstre.getAttaque();
			if (attaqueJoueur > attaqueMonstre) {
				// le joueur attaque
				System.out.println("Vous attaquez en premier.");
				int degats = attaqueJoueur - attaqueMonstre;
				System.out.println("Le monstre subit " + degats + " points de degats.");
				monstre.setPointsDeVie(monstre.getPointsDeVie() - degats);
				System.out.println("Il lui reste " + monstre.getPointsDeVie() + " points de vie.");
			} else if (attaqueJoueur < attaqueMonstre) {
				System.out.println("Le monstre attaque en premier.");
				int degats = attaqueMonstre - attaqueJoueur;
				System.out.println("Vous prenez " + degats + " points de degats.");
				Jeu.getJoueur().setPointsDeVie(Jeu.getJoueur().getPointsDeVie() - degats);
				System.out.println("Il vous reste " + Jeu.getJoueur().getPointsDeVie() + " points de vie.");
			} else {
				System.out.println("Vos coups s'entrechoquent, mais aucun de vous ne fait de coups significatifs.");
			}
			System.out.println();
			if (Jeu.getJoueur().getPointsDeVie() <= 0) {
				System.out.println("Vous êtes mort !\nVous aviez " + Jeu.getJoueur().getScore() + " points.");
			} else if (monstre.getPointsDeVie() <= 0) {
				System.out.println("Le monstre est mort !\nVous gagnez " + points + " points.");
				Jeu.getJoueur().setScore(Jeu.getJoueur().getScore() + points);
			}

		}
	}
}
