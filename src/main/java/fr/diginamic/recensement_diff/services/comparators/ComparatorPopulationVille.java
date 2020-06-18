package fr.diginamic.recensement_diff.services.comparators;

import java.util.Comparator;
/**
 * implement un comparateur pour la classe Ville.<br/>
 * Compare les population totales des villes, de facon descendante.<br/>
 * 
 * @author antoinelabeeuw
 *
 */
import fr.diginamic.recensement_diff.entites.Ville;

public class ComparatorPopulationVille implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		return (o2.getPopTotale() - o1.getPopTotale());
	}

}
