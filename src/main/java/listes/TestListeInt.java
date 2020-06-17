package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		System.out.println("----- Affichage de tous les éléments de la liste -----");
		System.out.println(liste);
		System.out.println("Taille de la liste : " + liste.size());
		System.out.println("Maximum de la liste : "+ Collections.max(liste));
		System.out.println("Minimum de la liste : "+ Collections.min(liste));
		for (Integer i : liste) {
			if(i < 0) {
				liste.set(liste.indexOf(i), -i);
			}
		}
		System.out.println("-----Liste modifiée -----");
		System.out.println(liste);
	}

}
