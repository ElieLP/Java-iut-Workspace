package moteurJeu;

public class Bateau {
	protected String nom;
	protected int tailleBateau;
	protected char etatBateau = 'S';
	protected Element[] bateau;

	public static void main(String[] args) {
		Bateau torpilleur = new Bateau("torpilleur", 2);
		torpilleur.placerBateau('A', 1, 'H');
		System.out.println("Le torpilleur a-t-il un element en 'A',2 ? " + torpilleur.appartientBateau('A', 2));
		System.out.println("Le torpilleur a-t-il un element en 'B',2 ? " + torpilleur.appartientBateau('B', 2));
		System.out.println("L'état du torpilleur est : " + torpilleur.getEtatBateau());
	}

	public Bateau(String nom, int tailleBateau) {
		this.nom = nom;
		this.tailleBateau = tailleBateau;
		this.bateau = new Element[tailleBateau];
	}

	public boolean placerBateau(char lettre, int chiffre, char sens) {
		if (sens == 'H') {
			for (int i = 0; i < this.tailleBateau; i++) {
				bateau[i] = new Element(lettre, chiffre + i);
			}
		} else {
			for (int i = 0; i < this.tailleBateau; i++) {
				bateau[i] = new Element((char) (lettre + i), chiffre);
			}
		}

		return true;
	}

	public boolean appartientBateau(char lettre, int chiffre) {
		boolean appartientBateau = false;
		boolean appartient;
		for (int i = 0; i < tailleBateau; i++) {
			appartient = bateau[i].verifierCoordonnee(lettre, chiffre);
			if (appartient) {
				appartientBateau = appartient;
			}

		}
		return appartientBateau;
	}

	public int getTailleBateau() {
		return tailleBateau;
	}

	public char getEtatBateau() {
		return etatBateau;
	}
}
