package maps;

import tri.Pays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapPays {

	public static void main(String[] args) {
		Map<String, Pays> mapPays = new HashMap<String, Pays>();
		mapPays.put("USA", new Pays("USA", 332_639_000, 59_495));
		mapPays.put("France", new Pays("France", 67_064_000, 43_551));
		mapPays.put("Allemagne", new Pays("Allemagne", 83_149_300, 50_206));
		mapPays.put("UK", new Pays("UK", 66_436_000, 43_620));
		mapPays.put("Italie", new Pays("Italie", 60_317_000, 37_970));
		mapPays.put("Japon", new Pays("Japon", 126_010_000, 42_659));
		mapPays.put("Chine", new Pays("Chine", 1_400_050_000, 16_624));
		mapPays.put("Russie", new Pays("Russie", 146_748_590, 28_712));
		mapPays.put("Inde", new Pays("Inde", 1_368_163_000, 5_174));
		
		Iterator<String> iterCle = mapPays.keySet().iterator();
		Pays paysPlusPetitHab = mapPays.get(iterCle.next());
		while (iterCle.hasNext()) {
			String cle = iterCle.next();
			if(paysPlusPetitHab.getNombreHab() > mapPays.get(cle).getNombreHab()) {
				paysPlusPetitHab = mapPays.get(cle);
			}
		}
		System.out.println("----- Pays avec le plus petit nombre d'habitants -----");
		System.out.println(paysPlusPetitHab);
		mapPays.remove(paysPlusPetitHab.getNom());
		System.out.println("----- map sans l'Italie -----");
		// plus joli print
		iterCle = mapPays.keySet().iterator();
		while (iterCle.hasNext()) {
			String cle = iterCle.next();
			System.out.println(mapPays.get(cle));
		}
		
	}

}
