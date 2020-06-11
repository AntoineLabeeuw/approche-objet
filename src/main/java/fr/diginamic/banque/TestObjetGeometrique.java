package fr.diginamic.banque;

import fr.diginamic.banque.entites.ObjetGeometrique;
import fr.diginamic.banque.entites.Cercle;
import fr.diginamic.banque.entites.Rectangle;

/**
 * test des classes Cercle et Rectangle, implementation de l'interface
 * ObjetGeometrique
 * 
 * @author antoinelabeeuw
 *
 */
public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] tabObj = new ObjetGeometrique[2];
		tabObj[0] = new Cercle(2);
		tabObj[1] = new Rectangle(3, 4);
		for (int i = 0; i < tabObj.length; i++) {
			System.out.println(tabObj[i]);
		}

	}

}
