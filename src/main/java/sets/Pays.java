package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pays {
	private String nom;
	private long nombreHab;
	private double pibHab;

	/**
	 * Constructeur
	 * 
	 * @param nom       : le nom du pays
	 * @param nombreHab : le nombre d'habitants
	 * @param pibHab    : le pib/habitants
	 */
	public Pays(String nom, long nombreHab, double pibHab) {
		super();
		this.nom = nom;
		this.nombreHab = nombreHab;
		this.pibHab = pibHab;
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
		return ("Pays : " + nom + ", nombre d'habitants : " + nombreHab + ", PIB total : " + getPibTotal() + "\n");
	}

	/**
	 * @return le PIB total du pays
	 */
	public double getPibTotal() {
		return (pibHab * nombreHab);
	}

	public static void main(String[] args) {
		Set<Pays> listePays = new HashSet<>();
		listePays.add(new Pays("USA", 332_639_000, 59_495));
		listePays.add(new Pays("France", 67_064_000, 43_551));
		listePays.add(new Pays("Allemagne", 83_149_300, 50_206));
		listePays.add(new Pays("UK", 66_436_000, 43_620));
		listePays.add(new Pays("Italie", 60_317_000, 37_970));
		listePays.add(new Pays("Japon", 126_010_000, 42_659));
		listePays.add(new Pays("Chine", 1_400_050_000, 16_624));
		listePays.add(new Pays("Russie", 146_748_590, 28_712));
		listePays.add(new Pays("Inde", 1_368_163_000, 5_174));
		// System.out.println(listePays);

		// rechercher le pays avec le plus grand PIB/habitant

		Pays paysGrandPibHab = listePays.iterator().next();
		for (Pays pays : listePays) {
			if (pays.getPibHab() > paysGrandPibHab.getPibHab()) {
				paysGrandPibHab = pays;
			}
		}
		System.out.println(paysGrandPibHab);

		// recherche le pays avec le PIB total le plus haut
		Pays paysPlusGrandPib = listePays.iterator().next();
		for (Pays pays : listePays) {
			if (pays.getPibTotal() > paysPlusGrandPib.getPibTotal()) {
				paysPlusGrandPib = pays;
			}
		}
		System.out.println(paysPlusGrandPib);

		// mettre en majuscule le pays avec le pib total le plus faible
		Pays paysPlusPetitPib = listePays.iterator().next();
		for (Pays pays : listePays) {
			if (pays.getPibTotal() < paysPlusPetitPib.getPibTotal()) {
				paysPlusPetitPib = pays;
			}
		}
		paysPlusPetitPib.setNom(paysPlusPetitPib.getNom().toUpperCase());
		System.out.println(paysPlusPetitPib);
		listePays.remove(paysPlusPetitPib);

		// affichage final, italie est supprimee
		System.out.println(listePays);

	}

}
