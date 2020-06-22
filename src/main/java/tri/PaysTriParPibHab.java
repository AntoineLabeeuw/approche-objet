package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * classe repondant au concept de pays même classe que Pays, mais doublon pour
 * realiser un autre compareTo() afin de tester les deux methodes.
 * 
 * @author antoinelabeeuw
 *
 */
public class PaysTriParPibHab implements Comparable<PaysTriParPibHab> {
	/** nom */
	private String nom;
	/** nombreHab */
	private long nombreHab;
	/** pibHab */
	private double pibHab;

	/**
	 * Constructeur
	 * 
	 * @param nom       : le nom du pays
	 * @param nombreHab : le nombre d'habitants
	 * @param pibHab    : le pib/habitants
	 */
	public PaysTriParPibHab(String nom, long nombreHab, double pibHab) {
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

	@Override
	public int compareTo(PaysTriParPibHab p2) {
		// tri par le PibHab, en mode ascendant
		if (pibHab > p2.getPibHab()) {
			return (1);
		} else if (pibHab < p2.getPibHab()) {
			return (-1);
		}
		return (0);
		/*
		 * autre methode return this.pibHab - p2.getPibHab() retourne
		 */
	}

	/**
	 * methode de test
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<PaysTriParPibHab> listePays = new ArrayList<>();
		listePays.add(new PaysTriParPibHab("USA", 332_639_000, 59_495));
		listePays.add(new PaysTriParPibHab("France", 67_064_000, 43_551));
		listePays.add(new PaysTriParPibHab("Allemagne", 83_149_300, 50_206));
		listePays.add(new PaysTriParPibHab("UK", 66_436_000, 43_620));
		listePays.add(new PaysTriParPibHab("Italie", 60_317_000, 37_970));
		listePays.add(new PaysTriParPibHab("Japon", 126_010_000, 42_659));
		listePays.add(new PaysTriParPibHab("Chine", 1_400_050_000, 16_624));
		listePays.add(new PaysTriParPibHab("Russie", 146_748_590, 28_712));
		listePays.add(new PaysTriParPibHab("Inde", 1_368_163_000, 5_174));

		// liste non triee
		System.out.println(listePays);
		Collections.sort(listePays);
		// liste triee
		System.out.println(listePays);
	}
}
