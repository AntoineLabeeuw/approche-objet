package fr.diginamic.banque.entites;

/**
 * classe credit qui herite de Operation
 * 
 * @author antoinelabeeuw
 *
 */
public class Credit extends Operation {

	/**
	 * constructeur herite de Operation
	 * 
	 * @param date    : la date du credit
	 * @param montant : le montant du credit
	 */
	public Credit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String getType() {
		return ("Crédit");
	}
}
