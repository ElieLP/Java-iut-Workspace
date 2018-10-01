package moteurJeu;

public class Jeu {
	private int numjoueur;
	
	private Grille grilleJoueur1, grilleJoueur2;
	
	
	public boolean initialiser(int numJoueur, String nomBateau, int tailleBateau, char lettre, int chiffre, char sens) {
		Grille grille;
		if(numjoueur == 1) {
			grille = grilleJoueur1 = new Grille();
		} else {
			grille = grilleJoueur2 = new Grille();
		}
		Bateau bateau = new Bateau(nomBateau, tailleBateau);
		return grille.placerBateau(bateau, sens, lettre, chiffre);
	}
	
	public String[] nomsBateaux() {
		return EnumNomBateau.enumToArray();
	}
	
	public int nbElementBateau(String nomBateau) {
		int nbElement = 0;
		EnumNomBateau nomEnum = EnumNomBateau.stringToEnum(nomBateau);
		switch (nomEnum) {
		case PORTE_AVION:
			nbElement = 5;
			break;
		case CROISEUR:
			nbElement = 4;
			break;
		case CONTRE_TORPILLEUR:
			nbElement = 5;
			break;
		case SOUS_MARIN:
			nbElement = 3;
			break;
		case TORPILLEUR:
			nbElement = 2;
			break;
		default:
			System.out.println("Erreur de reconnaissance du nom du bateau");
			break;
			
		}
		
		return nbElement;
	}
	
}
