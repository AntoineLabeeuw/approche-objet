package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class TestSetString {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<>();
		setString.add("USA");
		setString.add("France");
		setString.add("Allemagne");
		setString.add("UK");
		setString.add("Italie");
		setString.add("Japon");
		setString.add("Chine");
		setString.add("Russie");
		setString.add("Inde");
		System.out.println(setString);
		// afficher pays avec le plus grand nombre de lettres
		String paysPlusGrand = "";
		for(String pays : setString) {
			if(pays.length() > paysPlusGrand.length()) {
				paysPlusGrand = pays;
			}
		}
		System.out.println(paysPlusGrand);
		setString.remove(paysPlusGrand);
		System.out.println(setString);
	}

}
