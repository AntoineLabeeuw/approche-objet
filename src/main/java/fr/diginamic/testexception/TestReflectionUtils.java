package fr.diginamic.testexception;

import tri.Pays;

/**
 * classe de test des exceptions
 * 
 * @author antoinelabeeuw
 *
 */
public class TestReflectionUtils {

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		Pays paysFrance = new Pays("USA", 332_639_000, 59_495);
		ReflectionUtils.afficherAttributs(paysFrance);
		// essai avec null
		Pays paysVide = null;
		try {
			ReflectionUtils.afficherAttributs(paysVide);
		} catch (ReflectionException e) {
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException | IllegalAccessException e) {
			System.out.println(e.getMessage());
		}

	}

}
