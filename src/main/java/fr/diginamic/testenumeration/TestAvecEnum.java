package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fr.diginamic.recensement_diff.entites.Ville;

public class TestAvecEnum {

	public static void main(String[] args) {
		List<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("USA", 332_639_000, 59_495,Continent.AMERIQUE));
		listePays.add(new Pays("France", 67_064_000, 43_551, Continent.EUROPE));
		listePays.add(new Pays("Allemagne", 83_149_300, 50_206, Continent.EUROPE));
		listePays.add(new Pays("UK", 66_436_000, 43_620, Continent.EUROPE));
		listePays.add(new Pays("Italie", 60_317_000, 37_970, Continent.EUROPE));
		listePays.add(new Pays("Japon", 126_010_000, 42_659, Continent.ASIE));
		listePays.add(new Pays("Chine", 1_400_050_000, 16_624, Continent.ASIE));
		listePays.add(new Pays("Russie", 146_748_590, 28_712, Continent.ASIE));
		listePays.add(new Pays("Inde", 1_368_163_000, 5_174, Continent.ASIE));
		
		for(Pays p : listePays) {
			System.out.println(p);
		}
		/*for(Continent cont : Continent.values()) {
			int nb = 0;
			for(Pays p : listePays) {
				if(cont.equals(p.getContinent()))
					nb++;
			}
			System.out.println(cont + "\t\t" + nb);
		}*/
		Map<Continent, Integer> compteur = new HashMap<>();
		// initialisation
		for(Continent c : Continent.values()) {
			compteur.put(c, 0);
		}
		for( Pays p : listePays) {
			compteur.put(p.getContinent(), compteur.get(p.getContinent())+1);
		}
		System.out.println(compteur);
	}

}
