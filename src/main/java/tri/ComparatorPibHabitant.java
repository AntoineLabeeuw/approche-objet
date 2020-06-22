package tri;

import java.util.Comparator;

/**
 * classe permetant de comparer deux pays selon leur pib par habitant
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
