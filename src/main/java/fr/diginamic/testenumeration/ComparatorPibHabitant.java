package fr.diginamic.testenumeration;

import java.util.Comparator;

/**
 * classe permettant de faire des comparaisons de pays, sur le pib par habitants
 * 
 * @author antoinelabeeuw
 *
 */
public class ComparatorPibHabitant implements Comparator<Pays> {
	/**
	 * comparateur entre deux Pays Tri sur le nombre d'habitants, en mode ascendant
	 * 
	 */
	@Override
	public int compare(Pays o1, Pays o2) {
		if (o1.getPibHab() > o2.getPibHab()) {
			return (1);
		} else if (o1.getPibHab() < o2.getPibHab()) {
			return (-1);
		}
		return (0);
	}
}
