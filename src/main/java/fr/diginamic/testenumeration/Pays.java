package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pays implements Comparable<Pays> {
	private String nom;
	private long nombreHab;
	private double pibHab;
	private Continent continent;

	/**
	 * Constructeur
	 * 
	 * @param nom       : le nom du pays
	 * @param nombreHab : le nombre d'habitants
	 * @param pibHab    : le pib/habitants
	 */
	public Pays(String nom, long nombreHab, double pibHab, Continent continent) {
		super();
		this.nom = nom;
		this.nombreHab = nombreHab;
		this.pibHab = pibHab;
		this.continent = continent;
	}

	/** Getter
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nombreHab
	 */
	public long getNombreHab() {
		return nombreHab;
	}

	/**
	 * Setter
	 * 
	 * @param nombreHab the nombreHab to set
	 */
	public void setNombreHab(long nombreHab) {
		this.nombreHab = nombreHab;
	}

	/**
	 * Getter
	 * 
	 * @return the pibHab
	 */
	public double getPibHab() {
		return pibHab;
	}

	/**
	 * Setter
	 * 
	 * @param pibHab the pibHab to set
	 */
	public void setPibHab(double pibHab) {
		this.pibHab = pibHab;
	}

	@Override
	public String toString() {
		return ("Pays : " + nom + " (Continent : " + continent + "), nombre d'habitants : " + nombreHab + ", PIB total : " + getPibTotal() + "\n");
	}

	/**
	 * @return le PIB total du pays
	 */
	public double getPibTotal() {
		return (pibHab * nombreHab);
	}
	
	@Override
	public int compareTo(Pays p2) {
		// tri par le nom en ordre alphabetique
		return(nom.compareTo(p2.nom));
	}

	public static void main(String[] args) {
		List<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("USA", 332_639_000, 59_495,Continent.AMERIQUE));
		listePays.add(new Pays("France", 67_064_000, 43_551, Continent.EUROPE));
		listePays.add(new Pays("Allemagne", 83_149_300, 50_206, Continent.EUROPE));
		listePays.add(new Pays("UK", 66_436_000, 43_620, Continent.EUROPE));
		listePays.add(new Pays("Italie", 60_317_000, 37_970, Continent.EUROPE));
		listePays.add(new Pays("Japon", 126_010_000, 42_659, Continent.ASIE));
		listePays.add(new Pays("Chine", 1_400_050_000, 16_624, Continent.ASIE));
		listePays.add(new Pays("Russie", 146_748_590, 28_712, Continent.ASIE));
		listePays.add(new Pays("Inde", 1_368_163_000, 5_174, Continent.ASIE));
		
		// liste non triee
		System.out.println(listePays);
		Collections.sort(listePays);
		// liste triee sur le nom
		System.out.println(listePays);
		// listre triee avec le comparator sur le nombre d'habitants
		Collections.sort(listePays, new ComparatorHabitant());
		System.out.println(listePays);
		// listre triee avec le comparator sur le nombre d'habitants
		Collections.sort(listePays, new ComparatorPibHabitant());
		System.out.println(listePays);
	}

	
	
	

}
