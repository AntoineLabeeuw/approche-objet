package fr.diginamic.banque;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

public class TestOperations {

	public static void main(String[] args) {
		Operation tabOp[] = new Operation[4];
		tabOp[0] = new Credit("21/12/2021", 21.42);
		tabOp[1] = new Debit("2/3/2020", 34.04);
		tabOp[2] = new Credit("29/04/2019", 42.42);
		tabOp[3] = new Debit("1/05/2018", 7.007);

		double montantGlobal = 0.00;
		for (int i = 0; i < tabOp.length; i++) {
			System.out.print(tabOp[i].getType() + " | ");
			System.out.println(tabOp[i]);
			if (tabOp[i].getType().equals("Crédit")) {
				montantGlobal += tabOp[i].getMontant();
			} else {
				montantGlobal -= tabOp[i].getMontant();
			}
		}
		// decimales fausses, on devrait passer par des BigDecimal pour faire du calcul
		System.out.println("Montant global des opérations : " + montantGlobal);
	}
}
