package fr.diginamic.fichier;

import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**
 * classe de test pour la lecture de fichiers
 * 
 * @author antoinelabeeuw
 *
 */
public class LectureFichier {

	public static void main(String[] args) {
		try {
			File fichier = new File("/Users/antoinelabeeuw/Desktop/Formation DTA/Java/POO/J5-7/recensement 2016.csv");
			List<String> lignes = FileUtils.readLines(fichier, "UTF-8");
			for (String ligne : lignes) {
				System.out.println(ligne);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
