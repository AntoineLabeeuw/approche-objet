package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	private double salaireMensuel;

	/**
	 * Override de la methode abstraite getSalaire() retourne le salaire du salarie
	 *
	 */
	@Override
	public double getSalaire() {
		return (salaireMensuel);
	}
	
	/**
	 * Override de la methode abstraite getStatut : retourne "salarie"
	 */
	@Override
	public String getStatut() {
		return ("salarié");
	}
	/**
	 * Constructeur
	 * 
	 * @param nom            : le nom du salarie
	 * @param prenom         : le prenom du salarie
	 * @param salaireMensuel : le salaire mensuel du salarie
	 */
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	/**
	 * @return le salaire mensuel du salarie
	 */
	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	/**
	 * @param salaireMensuel : le salaire mensuel a modifier
	 */
	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}



}
