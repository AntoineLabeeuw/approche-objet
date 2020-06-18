package fr.diginamic.recensement_diff.services.comparators;

import java.util.Comparator;

import fr.diginamic.recensement_diff.entites.Region;

/**
 * implement un comparateur pour la classe Region.<br/>
 * Compare les population totales des Regions, de facon descendante.<br/>
 * 
 * @author antoinelabeeuw
 *
 */
public class ComparatorPopulationRegion implements Comparator<Region> {

	@Override
	public int compare(Region o1, Region o2) {
		return (o2.getPopTotale() - o1.getPopTotale());
	}

}
