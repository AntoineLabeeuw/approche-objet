package fr.diginamic.jdr.entites;

import java.util.Random;

public class Gobelin extends PersoMonstre {
	public Gobelin() {
		Random r = new Random();
		this.nom = "Gobelin";
		this.force = 5 + r.nextInt(6);
		this.pointsDeVie = 10 + r.nextInt(6);
	}
}
