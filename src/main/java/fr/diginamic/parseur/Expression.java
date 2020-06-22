package fr.diginamic.parseur;

import java.util.regex.Pattern;

/**
 * Classe conceptualisant une expression lie a un calcul simple
 * 
 * @author antoinelabeeuw
 *
 */
public class Expression {
	/** gauche */
	private String gauche;
	/** operateur */
	private String operateur;
	/** droite */
	private String droite;

	/**
	 * Getter
	 * 
	 * @return the gauche
	 */
	public String getGauche() {
		return gauche;
	}

	/**
	 * Setter
	 * 
	 * @param gauche the gauche to set
	 */
	public void setGauche(String gauche) {
		this.gauche = gauche;
	}

	/**
	 * Getter
	 * 
	 * @return the operateur
	 */
	public String getOperateur() {
		return operateur;
	}

	/**
	 * Setter
	 * 
	 * @param operateur the operateur to set
	 */
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}

	/**
	 * Getter
	 * 
	 * @return the droite
	 */
	public String getDroite() {
		return droite;
	}

	/**
	 * Setter
	 * 
	 * @param droite the droite to set
	 */
	public void setDroite(String droite) {
		this.droite = droite;
	}

	/**
	 * Constructeur
	 *
	 * @param chaine : la chaine de caractere. La decoupe en 3 parties et la stocke
	 *               au bon endroit
	 */
	public Expression(String gauche, String operateur, String droite) {
		this.gauche = gauche;
		this.operateur = operateur;
		this.droite = droite;
	}

	@Override
	public String toString() {
		return "Expression = " + gauche + " " + operateur + " " + droite;
	}

	/**
	 * prend en entree une chaine et ressort un objet de type Expression.
	 * 
	 * @param expression : la chaine contenant l'expression
	 * @return : l'expression extraite de la chaine
	 */
	static public Expression parseur(String expression) {
		/*
		 * recuperation de l'operateur puis decoupage grace a celui-ci (avec split()) et
		 * stockage de chaque cote dans gauche et droite
		 */
		String gauche = null;
		String operateur = null;
		String droite = null;
		if (expression.indexOf('+') > -1) {
			operateur = "+";
		} else if (expression.indexOf('-') > -1) {
			operateur = "-";
		} else if (expression.indexOf('/') > -1) {
			operateur = "/";
		} else if (expression.indexOf('*') > -1) {
			operateur = "*";
		} else {
			System.out.println("Operateur non reconnu");
		}
		// separation de la chaine de caractere par l'operateur
		String[] chaineCoupee = expression.split(Pattern.quote(operateur));
		gauche = chaineCoupee[0];
		droite = chaineCoupee[1];
		return new Expression(gauche, operateur, droite);
	}

	/**
	 * methode qui prend en entree la variable a remplacer et son nombre retourne
	 * ensuite le calcul de ces deux nombres dans l'expression
	 * 
	 * @param var : la variable a remplacer
	 * @param val : la valeur de remplacement
	 * @return : le resulat du calcul
	 */
	public double Evaluer(String var, int val) {
		// check quelle variable remplacer : gauche, droite, ou les deux
		double calcul = 0.0;
		double nbGauche = 0.0;
		double nbDroite = 0.0;
		// remplacement de gauche
		if (gauche.equals(var) && !droite.equals(var)) {
			nbGauche = val;
			nbDroite = Double.parseDouble(droite);
			// remplacement de droite
		} else if (droite.equals(var) && !gauche.equals(var)) {
			nbGauche = Double.parseDouble(gauche);
			nbDroite = val;
			// remplacement des deux
		} else if (droite.equals(var) && gauche.equals(var)) {
			nbGauche = val;
			nbDroite = val;
			// les deux etaient deja des valeurs
		} else {
			nbGauche = Double.parseDouble(gauche);
			nbDroite = Double.parseDouble(droite);
		}
		// realisation du calcul
		switch (operateur) {
		case ("+"):
			calcul = nbGauche + nbDroite;
			break;
		case ("-"):
			calcul = nbGauche - nbDroite;
			break;
		case ("/"):
			calcul = nbGauche / nbDroite;
			break;
		case ("*"):
			calcul = nbGauche * nbDroite;
			break;
		}
		return calcul;
	}

}
