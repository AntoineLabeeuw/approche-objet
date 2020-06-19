package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 * classe de test pour la classe Calendar
 * 
 * @author antoinelabeeuw
 *
 */
public class TestCalendar {

	public static void main(String[] args) {
		// affichage de la date d'aujourd'hui avec de format jour/mois/annee
		Calendar aujourdHui = Calendar.getInstance();
		aujourdHui.set(Calendar.MONTH, 5);
		aujourdHui.set(Calendar.DAY_OF_MONTH, 18);
		aujourdHui.set(Calendar.YEAR, 2020);
		Date date = aujourdHui.getTime();
		SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Aujourd'hui en jour/mois/année");
		System.out.println(ft.format(date));

		// affichage de la date d'aujourd'hui avec de format jour/mois/annee
		// heure:minutes:secondes
		aujourdHui.set(Calendar.MONTH, 5);
		aujourdHui.set(Calendar.DAY_OF_MONTH, 18);
		aujourdHui.set(Calendar.YEAR, 2020);
		aujourdHui.set(Calendar.HOUR_OF_DAY, 23);
		aujourdHui.set(Calendar.MINUTE, 30);
		aujourdHui.set(Calendar.SECOND, 59);
		Date date2 = aujourdHui.getTime();
		SimpleDateFormat ft2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Aujourd'hui en jour/mois/année à 23h30 et 59 s");
		System.out.println(ft2.format(date2));

		// affichage heure systeme
		Calendar calendrierMaintenant = Calendar.getInstance();
		Date systeme = calendrierMaintenant.getTime();
		System.out.println("date systeme au format jour/mois/annee heres:minutes:secondes");
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formattage.format(systeme));

	}

}
