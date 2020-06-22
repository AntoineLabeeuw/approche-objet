package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * classe de test sur les creations et les manipulations de maps
 * 
 * @author antoinelabeeuw
 *
 */
public class CreationEtManipulationMap {

	public static void main(String[] args) {
		Map<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		// ajout
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		// affichage des cle et des valeurs grace a une boucle
		Iterator<Integer> iterCle = mapVilles.keySet().iterator();
		while (iterCle.hasNext()) {
			int cle = iterCle.next();
			System.out.println(cle + " : " + mapVilles.get(cle));
		}
		System.out.println("Taille de la map : " + mapVilles.size());
	}

}
