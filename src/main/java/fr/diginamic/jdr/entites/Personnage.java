package fr.diginamic.jdr.entites;

import java.util.Random;

public class Personnage extends PersoMonstre {

	private int score;

	public Personnage(String nom) {
		Random r = new Random();
		this.nom = nom;
		this.force = 12 + r.nextInt(7);
		this.pointsDeVie = 20 + r.nextInt(31);
		this.score = 0;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
		
}
