package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

/**
 * classe de test de la classe maison et de ses classes fille.
 * 
 * @author antoinelabeeuw
 *
 */
public class TestMaison {

	public static void main(String[] args) {
		Maison maison = new Maison();

		maison.ajouterPiece(new Cuisine(20.5, 0));
		maison.ajouterPiece(new Chambre(15, 1));
		maison.ajouterPiece(new Chambre(12, 1));
		maison.ajouterPiece(new Chambre(12.4, 0));
		maison.ajouterPiece(new Chambre(11.4, 0));
		maison.ajouterPiece(new Salon(40, 0));
		maison.ajouterPiece(new WC(4, 0));
		maison.ajouterPiece(new WC(4, 1));
		maison.ajouterPiece(new SalleDeBain(13, 1));
		maison.ajouterPiece(new SalleDeBain(13, 0));

		System.out.println("----- Superficie totale -----");
		System.out.println(maison.getSuperficieTotale());
		System.out.println("----- Superficie RDC -----");
		System.out.println(maison.getSuperficieEtage(0));
		System.out.println("----- Superficie 1e etage -----");
		System.out.println(maison.getSuperficieEtage(1));
		System.out.println("----- Superficie des chambres -----");
		System.out.println(maison.getSuperficieTypePiece("Chambre"));
		System.out.println("----- Nombre de salle de bains -----");
		System.out.println(maison.getNombrePiece("SalleDeBain"));
	}

}
