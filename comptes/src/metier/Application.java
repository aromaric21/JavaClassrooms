package metier;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Compte cp1 = new CompteCourant(1, 8000, 5000);
		Compte cp2 = new CompteEpargne(2, 30000, 5.5);
		
		cp1.verser(50000);
		cp1.retirer(3000);
		cp1.virement(400, cp2);
		
		System.out.println("Solde du compte cp1 = " + cp1.consulterSolde());
		System.out.println("Solde du compte cp2 = " + cp2.consulterSolde());
		System.out.println("-----------------------------------------------");
		
		
		List<Operation> listoperations = cp1.getOperations();
		for(Operation o:listoperations) {
			System.out.println(o.getClass().getSimpleName()+"---"+o.getNumero()+"---"+
		                             o.getDateOperation()+"---"+o.getMontant());
		}
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Total des versements du compte cp1 = " + cp1.totalVersement());
		System.out.println("Total des retraits du compte cp2 = " + cp1.totalRetrait());
		
		
	}

}
