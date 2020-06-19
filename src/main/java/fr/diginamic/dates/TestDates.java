package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe de test pour la classe Date
 * 
 * @author antoinelabeeuw
 *
 */
public class TestDates {

	public static void main(String[] args) {
		// affichage de la date d'aujourd'hui avec de format jour/mois/annee
		Date aujourdHui = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Aujourd'hui en jour/mois/année");
		System.out.println(ft.format(aujourdHui));

		// affichage de la date d'aujourd'hui avec de format jour/mois/annee
		// heure:minutes:secondes
		Date date2 = new Date(116, 4,19,23,30,59);
		SimpleDateFormat ft2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("19 mai 2016 à 23h30 et 59s");
		System.out.println(ft2.format(aujourdHui));

		// affichage heure systeme
		Date systeme = new Date();
		System.out.println("date systeme au format jour/mois/annee heres:minutes:secondes");
		System.out.println(ft2.format(systeme));
	}

}
