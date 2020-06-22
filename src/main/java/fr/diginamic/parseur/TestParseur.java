package fr.diginamic.parseur;

/**
 * classe de test de l'objet expression
 * 
 * @author antoinelabeeuw
 *
 */
public class TestParseur {

	public static void main(String[] args) {
		// initialisation
		String chaine1 = "x+5";
		String chaine2 = "5-x";
		String chaine3 = "x/5";
		String chaine4 = "5*x";
		String chaine5 = "x*x";
		String chaine6 = "4+4";
		// parsing des expressions
		Expression exp1 = Expression.parseur(chaine1);
		Expression exp2 = Expression.parseur(chaine2);
		Expression exp3 = Expression.parseur(chaine3);
		Expression exp4 = Expression.parseur(chaine4);
		Expression exp5 = Expression.parseur(chaine5);
		Expression exp6 = Expression.parseur(chaine6);
		// calcul et affichage
		System.out.println(exp1);
		System.out.println("resultat = " + exp1.Evaluer("x", 5));
		System.out.println(exp2);
		System.out.println("resultat = " + exp2.Evaluer("x", 5));
		System.out.println(exp3);
		System.out.println("resultat = " + exp3.Evaluer("x", 5));
		System.out.println(exp4);
		System.out.println("resultat = " + exp4.Evaluer("x", 5));
		System.out.println(exp5);
		System.out.println("resultat = " + exp5.Evaluer("x", 5));
		System.out.println(exp6);
		System.out.println("resultat = " + exp6.Evaluer("x", 5));
	}

}
