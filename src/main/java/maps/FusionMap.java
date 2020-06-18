package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FusionMap {

	public static void main(String[] args) {
		// Création map1
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		// fusion map3
		Map<Integer, String> map3 = new HashMap<Integer, String>();
		/*Iterator<Integer> iterCle = map1.keySet().iterator();
		while (iterCle.hasNext()) {
			int cle = iterCle.next();
			map3.put(cle, map1.get(cle));
		}
		iterCle = map2.keySet().iterator();
		while (iterCle.hasNext()) {
			int cle = iterCle.next();
			map3.put(cle, map2.get(cle));
		}
		*/
		// methode la plus simple
		map3.putAll(map1);
		map3.putAll(map2);
		System.out.println(map3);
	}

}
