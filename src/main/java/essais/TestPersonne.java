package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TP1
		/*AdressePostale ap1 = new AdressePostale();
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
		*/
		
		// TP2
		/*// 1e constructeur : nom et prenom uniquement
		Personne jean = new Personne("John", "Jean");
		// 2e constructeur : 
		AdressePostale ap1 = new AdressePostale(12, "du marche", 11400, "Casternaudary");
		Personne jeannette = new Personne("Johnette", "Jeannette", ap1);
		jeannette.affichePrenomNom();
		*/
		
		//TP3
		AdressePostale ap1 = new AdressePostale(12, "du marche", 11400, "Castelnaudary");
		Personne jean = new Personne("John", "Jean");
		jean.setAdresse(ap1);
		// test of adresse getter
		AdressePostale ap3 = jean.getAdresse();
		System.out.println(ap3.ville);
		
	}

}
