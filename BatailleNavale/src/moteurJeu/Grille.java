package moteurJeu;
public class Grille {
	
	private Bateau[] flotte = new Bateau[5];

	private int nbBateau = 0;
	
	private int nbLigne = 10, nbColonne = 10;
	
	
	public static void main(String[] args) {
		Grille grille = new Grille();
		Bateau torpilleur = new Bateau("torpilleur", 3);
		grille.placerBateau(torpilleur, 'H', 'A', 1);
		System.out.println("Le torpilleur a-t-il un element en 'A',2 ? "
				+ torpilleur.appartientBateau('A', 2));
		System.out.println("Le torpilleur a-t-il un element en 'B',2 ? "
				+ torpilleur.appartientBateau('B', 2));
		System.out.println("L'état du torpilleur est : "
				+ torpilleur.getEtatBateau());
	}
	
	public boolean verifierSortieGrille(Bateau bateauAPlacer, char sens, int ligne, int colonne) {
		int tailleBateau = bateauAPlacer.getTailleBateau();
		if (sens == 'H') {
			return (ligne <= nbLigne+tailleBateau || colonne <= nbColonne || ligne > tailleBateau || colonne > 0);	
		} else {
			return (ligne <= nbLigne || colonne <= nbColonne+tailleBateau || ligne > 0 || colonne > tailleBateau);	
		}

	}
	
	public boolean verifierSupperpositionBateau(int ligne, int colonne) {
		return false;
	}
	
	public boolean placerBateau(Bateau bateau, char sens, char lettre, int chiffre) {
		bateau.placerBateau(lettre, chiffre, sens);
		flotte[nbBateau] = bateau;
		nbBateau++;
		return true;
	}

	
}
