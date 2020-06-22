package fr.diginamic.testenumeration;

import java.util.Comparator;

/**
 * classe permettant de faire des comparaisons de pays, sur le nombre
 * d'habitants
 * 
 * @author antoinelabeeuw
 *
 */
public class ComparatorHabitant implements Comparator<Pays> {

	/**
	 * comparateur entre deux Pays Tri sur le nombre d'habitants, en mode ascendant
	 * 
	 */
	@Override
	public int compare(Pays o1, Pays o2) {
		if (o1.getNombreHab() > o2.getNombreHab()) {
			return (1);
		} else if (o1.getNombreHab() < o2.getNombreHab()) {
			return (-1);
		}
		return (0);
	}

}
