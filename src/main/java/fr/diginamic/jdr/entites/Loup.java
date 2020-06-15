package fr.diginamic.jdr.entites;

import java.util.Random;

public class Loup extends PersoMonstre {

	public Loup(){
		Random r = new Random();
		this.nom = "Loup";
		this.force = 3 + r.nextInt(6);
		this.pointsDeVie = 5 + r.nextInt(6);
	}
}
