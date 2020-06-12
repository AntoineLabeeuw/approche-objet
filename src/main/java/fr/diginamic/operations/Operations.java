package fr.diginamic.operations;

/**
 * classe qui implemente une methode static pour 4 types d'operations
 * 
 * @author antoinelabeeuw
 *
 */
public class Operations {
	/**
	 * @param a         : double
	 * @param b         : double
	 * @param operateur : +, -, / ou *
	 * @return : le resultat de l'operation entre a et b. L'operation a faire est
	 *         definie par l'operateur.
	 */
	public static double calcul(double a, double b, char operateur) {
		double total = 0;
		if (operateur == '+') {
			total = a + b;
		} else if (operateur == '-') {
			total = a - b;
		} else if (operateur == '/') {
			total = a / b;
		} else {
			// operateur == '*'
			total = a * b;
		}
		return (total);
	}
}
