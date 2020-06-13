package fr.diginamic.formes;
/** classe qui permet d'afficher la surface et le perimetre des classes Forme.
 * @author antoinelabeeuw
 *
 */
public class AffichageForme {

	/** methode qui permet d'afficher le perimetre et la surface
	 * de toutes les formes definies a partir de la super-classe Forme.
	 * methode static pour ne pas a avoir a faire d'instances, 
	 * qui serait inutile.
	 * @param forme
	 */
	public static void afficher(Forme forme) {
		System.out.println("Perimetre = " + forme.calculerPerimetre());
		System.out.println("Surface = " + forme.calculerSurface());
	}
}
