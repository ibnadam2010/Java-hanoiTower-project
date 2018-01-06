import java.util.Arrays;
import java.util.Scanner;

public class Jouer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbcoup = 0;
		System.out.println("Vous souhaitez jouer avec combien de plateau(compris entre 3 et 7)");
		Scanner pl = new Scanner(System.in);
		int nb = pl.nextInt();
		
		Tour tour1 = new Tour(nb);
		tour1.remplir();
		Tour tour2 = new Tour(nb);
		Tour tour3 = new Tour(nb);
		System.out.println("1:"+tour1.tostring());
		System.out.println("2:"+tour2.tostring());
		System.out.println("3:"+tour3.tostring());
		
		do {

			System.out.println("Tour de depart");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			System.out.println("Tour de destination");
			int j = sc.nextInt();
			if (i == 1 && j == 2) {
				nbcoup++;
				if (tour2.estVide() == true) {
					tour2.empiler(tour1.sommet());
					tour1.depiler();
					System.out.println(tour1.tostring());
					System.out.println(tour2.tostring());
					System.out.println(tour3.tostring());
				} else {
					if (tour2.sommet() < tour1.sommet()) {
						System.out.println("déplacement impossible");
					} else {

						tour2.empiler(tour1.sommet());
						tour1.depiler();
						System.out.println(tour1.tostring());
						System.out.println(tour2.tostring());
						System.out.println(tour3.tostring());
					}

				}

			} else if (i == 1 && j == 1) {

				nbcoup++;
				System.out.println(tour1.tostring());
				System.out.println(tour2.tostring());
				System.out.println(tour3.tostring());

			} else if (i == 1 && j == 3) {

				nbcoup++;

				if (tour3.estVide() == true) {
					tour3.empiler(tour1.sommet());
					tour1.depiler();
					System.out.println(tour1.tostring());
					System.out.println(tour2.tostring());
					System.out.println(tour3.tostring());
				} else {
					if (tour3.sommet() < tour1.sommet()) {
						System.out.println("déplacement impossible");
					} else {

						tour3.empiler(tour1.sommet());
						tour1.depiler();
						System.out.println(tour1.tostring());
						System.out.println(tour2.tostring());
						System.out.println(tour3.tostring());
					}

				}

			} else if (i == 2 && j == 1) {
				nbcoup++;

				if (tour1.estVide() == true) {
					tour1.empiler(tour2.sommet());
					tour2.depiler();
					System.out.println(tour1.tostring());
					System.out.println(tour2.tostring());
					System.out.println(tour3.tostring());
				} else {
					if (tour1.sommet() < tour2.sommet()) {
						System.out.println("déplacement impossible");
					} else {

						tour1.empiler(tour2.sommet());
						tour2.depiler();
						System.out.println(tour1.tostring());
						System.out.println(tour2.tostring());
						System.out.println(tour3.tostring());
					}

				}

			} else if (i == 2 && j == 3) {

				nbcoup++;
				if (tour3.estVide() == true) {
					tour3.empiler(tour2.sommet());
					tour2.depiler();
					System.out.println(tour1.tostring());
					System.out.println(tour2.tostring());
					System.out.println(tour3.tostring());
				} else {
					if (tour3.sommet() < tour2.sommet()) {
						System.out.println("déplacement impossible");
					} else {

						tour3.empiler(tour2.sommet());
						tour2.depiler();
						System.out.println(tour1.tostring());
						System.out.println(tour2.tostring());
						System.out.println(tour3.tostring());
					}

				}

			} else if (i == 2 && j == 2) {

				nbcoup++;
				System.out.println(tour1.tostring());
				System.out.println(tour2.tostring());
				System.out.println(tour3.tostring());

			} else if (i == 3 && j == 1) {

				nbcoup++;
				if (tour1.estVide() == true) {
					tour1.empiler(tour3.sommet());
					tour3.depiler();
					System.out.println(tour1.tostring());
					System.out.println(tour2.tostring());
					System.out.println(tour3.tostring());
				} else {
					if (tour1.sommet() < tour3.sommet()) {
						System.out.println("déplacement impossible");
					} else {

						tour1.empiler(tour3.sommet());
						tour3.depiler();
						System.out.println(tour1.tostring());
						System.out.println(tour2.tostring());
						System.out.println(tour3.tostring());
					}

				}

			} else if (i == 3 && j == 2) {
				nbcoup++;
				if (tour2.estVide() == true) {
					tour2.empiler(tour3.sommet());
					tour3.depiler();
					System.out.println(tour1.tostring());
					System.out.println(tour2.tostring());
					System.out.println(tour3.tostring());
				} else {
					if (tour2.sommet() < tour3.sommet()) {
						System.out.println("déplacement impossible");
					} else {

						tour2.empiler(tour3.sommet());
						tour3.depiler();
						System.out.println(tour1.tostring());
						System.out.println(tour2.tostring());
						System.out.println(tour3.tostring());
					}

				}

			} else if (i == 3 && j == 3) {
				nbcoup++;
				System.out.println(tour1.tostring());
				System.out.println(tour2.tostring());
				System.out.println(tour3.tostring());

			}

		} while (tour3.estPlein() == false || tour2.estPlein()==false);
		System.out.println("");
		System.out.println("Bravo Vous avez gagné!!!");
		System.out.println("");
		System.out.println("Après " + nbcoup + " Coups successifs");
	}
	
}
