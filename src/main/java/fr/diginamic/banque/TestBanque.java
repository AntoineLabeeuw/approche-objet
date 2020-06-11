package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte c1 = new Compte(12345,0000);
		System.out.println(c1);
		// Si on veut print les infos de l'instance
		System.out.println(c1.getNumeroCompte());
		System.out.println(c1.getSoldeCompte());

	}

}
