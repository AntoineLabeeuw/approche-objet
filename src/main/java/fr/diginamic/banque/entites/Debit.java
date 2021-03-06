package fr.diginamic.banque.entites;

/**
 * classe conceptualisant une operation de debit.
 * 
 * @author antoinelabeeuw
 *
 */
public class Debit extends Operation {

	/**
	 * @param date    : la date du debit
	 * @param montant : le montant du debit
	 */
	public Debit(String date, double montant) {
		super(date, montant);
	}

	/**
	 * retourne credit, le type de l'operation
	 */
	@Override
	public String getType() {
		return ("Débit");
	}
}
