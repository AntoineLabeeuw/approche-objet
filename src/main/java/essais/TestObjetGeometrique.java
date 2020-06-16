package essais;

import Interfaces.Cercle;
import Interfaces.ObjetGeometrique;
import Interfaces.Rectangle;

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
