package fr.diginamic.jdr.entites;

import java.util.Random;

public class Troll extends PersoMonstre {

	public Troll() {
		Random r = new Random();
		this.nom = "Troll";
		this.force = 10 + r.nextInt(6);
		this.pointsDeVie = 20 + r.nextInt(11);
	}

}
