package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	private double tauxRemuneration;

	/**
	 * constructeur
	 * 
	 * @param numeroCompte     : le numero du compte
	 * @param soldeCompte      : le solde de ce compte
	 * @param tauxRemuneration : le taux de remuneration du compte
	 */
	public CompteTaux(String numeroCompte, double soldeCompte, double tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.setTauxRemuneration(tauxRemuneration);
	}

	/**
	 * getter
	 * 
	 * @return : le taux de remuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration : le taux de remuneration a modifier
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		String heritedToString = super.toString();
		return (heritedToString + "\nTaux de rémunération : " + tauxRemuneration);
	}
}
