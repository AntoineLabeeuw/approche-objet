package utils;

/**
 * classe qui permet de convertir un String en nombre
 * 
 * @author antoinelabeeuw
 *
 */
public class ConversionNombre {

	/**
	 * mehtode de test
	 * 
	 * @param args : none used
	 */
	public static void main(String[] args) {
		String chaineCaract = "1234";
		int chaineInt = Integer.parseInt(chaineCaract);
		System.out.println(chaineInt);

		int a = 10;
		int b = 0;
		int max = Integer.compare(a, b);
		if (max < 0) {
			System.out.println("Le maximum est b");
		} else if (max > 0) {
			System.out.println("Le maximum est a");
		} else {
			System.out.println("Les deux sont identiques");
		}
		// the one we should use
		System.out.println(Integer.max(a, b));

	}
}
