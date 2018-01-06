import java.util.Arrays;

public class Tour {
	int tour[];

	public Tour(int taille) {

		tour = new int[taille];

	}

	public void remplir() {
		int nb = tour.length;
		for (int i = 0; i < tour.length; i++) {

			tour[i] = nb;
			nb = nb - 1;
		}

	}

	public String tostring() {
		return Arrays.toString(tour);
	}

	public boolean estPlein() {
		boolean plein = false;
		if (tour[tour.length - 1] == 1) {
			plein = true;
		}
		return plein;
	}

	public int sommet() {
		int sommet = tour[0];
		for (int i = 0; i < tour.length; i++) {
			if (tour[i] < sommet && tour[i] != 0) {
				sommet = tour[i];

			}
		}
		return sommet;
	}

	public int indiceSommet() {
		int indice = 0;
		int sommet = tour[0];
		for (int i = 0; i < tour.length; i++) {
			if (tour[i] < sommet && tour[i] != 0) {
				indice = i;
			}
		}
		return indice;
	}

	public void depiler() {
		tour[indiceSommet()] = 0;
	}

	public void empiler(int plateau) {
		boolean placer = false;
		for (int i = 0; i < tour.length; i++) {
			if (tour[i] == 0 && placer == false) {
				tour[i] = plateau;
				placer = true;
			}
		}
	}

	public boolean estVide() {
		boolean vide = true;
		int som = 0;
		for (int i = 0; i < tour.length; i++) {
			som = som + tour[i];
		}
		if (som == 0) {
			vide = true;
		} else {
			vide = false;
		}
		return vide;
	}

}
