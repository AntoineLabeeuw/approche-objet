package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale ap1 = new AdressePostale();
		ap1.numeroRue = 12;
		ap1.libelleRue = "De midi";
		ap1.codePostal = 11400;
		ap1.ville = "Casterlnaudary";
		
		AdressePostale ap2 = new AdressePostale();
		ap1.numeroRue = 13;
		ap1.libelleRue = "De 13 heures";
		ap1.codePostal = 11500;
		ap1.ville = "Quillan";
		
		Personne jean = new Personne();
		jean.nom = "John";
		jean.prenom = "Jean";
		jean.adresse = ap1;
		
		Personne jeannette = new Personne();
		jean.nom = "Johnnette";
		jean.prenom = "Jeannette";
		jean.adresse = ap2;
	}

}
