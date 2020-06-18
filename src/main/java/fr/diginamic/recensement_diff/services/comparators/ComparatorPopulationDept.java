package fr.diginamic.recensement_diff.services.comparators;

import java.util.Comparator;

import fr.diginamic.recensement_diff.entites.Departement;

/**
 * implement un comparateur pour la classe departement.<br/>
 * Compare les population totales des departements, de facon descendante.<br/>
 * 
 * @author antoinelabeeuw
 *
 */
public class ComparatorPopulationDept implements Comparator<Departement> {

	@Override
	public int compare(Departement o1, Departement o2) {
		return (o2.getPopTotale() - o1.getPopTotale());
	}

}
