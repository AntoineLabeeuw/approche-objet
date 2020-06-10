package essais;

import entities.AdressePostale;

public class TestAdressePostale {

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

	}

}
