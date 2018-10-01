package morpion;

import java.util.Scanner;

public class TP2Morpion {

	public static void main(String[] args) {
		
		/* EXO 2 */
		
		String tableau[] = new String [9];
		for(int i = 0; i < tableau.length; i++) {
			tableau[i] = "   |";
		}
		System.out.print("\nEntrez une colonne : ");	
		int colonne = lireEntier();
		
		System.out.print("\nEntrez une ligne : ");	
		int ligne = lireEntier();
		
		entrerCoordonnees(true, tableau, colonne, ligne);
		
		afficherTableau(tableau);
		
		System.out.print("\nEntrez une colonne : ");	
		colonne = lireEntier();
		
		System.out.print("\nEntrez une ligne : ");	
		ligne = lireEntier();
		
		entrerCoordonnees(false, tableau, colonne, ligne);
		
		afficherTableau(tableau);
		
		System.out.println();
		
		/* EXO 3 */
		System.out.println("EXO 3 : ");
		System.out.println("Case(1,1) : " + isCaseValide(tableau, 1, 1));
		System.out.println("Case(7,3) : " + isCaseValide(tableau, 7, 3));
		System.out.println("Case(2,2) : " + isCaseValide(tableau, 2, 2));
		
	}
	
	static void afficherTableau(String[] tableau) {
		for(int i = 1; i < tableau.length+1; i++) {
			if(i%3 == 1) {
				System.out.println();
				System.out.print("|");
			}
			System.out.print(tableau[i-1]);
		}
	}
	
	static void entrerCoordonnees(boolean joueurO, String[] tableau, int ligne, int colonne) {
		int caseTableau;
		
		caseTableau = convertirEnCase(ligne, colonne);
		
		String marque;
		if(joueurO) {
			marque = " O |";
		} else {
			marque = " X |";
		}
		
		try {
			tableau[caseTableau] = marque ;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Les coordonnées sont hors bornes");
        }
	}
	
	static int convertirEnCase(int ligne, int colonne){
		int caseTableau;
		if (ligne == 1) {
			caseTableau = colonne-1;
		} else if (ligne == 2) {
			caseTableau = colonne+2;
		} else if (ligne == 3) {
			caseTableau = colonne+5;
		} else {
			caseTableau = -1;
		}
		return caseTableau;
	}
	
	static int lireEntier() {
		int entier;
		Scanner clavier = new Scanner (System.in);
		entier = clavier.nextInt();
		return entier;
	}
	
	static String isCaseValide(String[] tableau, int ligne, int colonne) {
		String resultat;
		int caseTableau = convertirEnCase(ligne, colonne);
		if (ligne < 1 | ligne > 3 | colonne < 1 | colonne > 3) {
			resultat = "hors tableau";
		} else if (tableau[caseTableau] != "   |") {
			resultat = "case déjà utilisée";
		} else {
			resultat = "OK";
		}
		return resultat;
	}
	
	static boolean[] creationTableauVerif(String[] tableau, String chaineJoueur) {
		boolean[] tableauVerif = null;
		for (int i = 0; i < tableau.length; i++) {
			tableauVerif[i] = tableau[i] == chaineJoueur;
		}
		return tableauVerif;
	}
	
	static boolean controlTableauVerif(boolean[] tableauVerif) {
		boolean gagnant = false;
		for (int i = 0; i < 3; i++) {
			if(tableauVerif[i] && tableauVerif[i+1] && tableauVerif[i+2]) {
				gagnant =  true;
			}
		}
		for (int i = 0; i < 3; i++) {
			if(tableauVerif[i] && tableauVerif[i+3] && tableauVerif[i+6]) {
				gagnant =  true;
			}
		}
		if(tableauVerif[0] && tableauVerif[4] && tableauVerif[9]) {
			gagnant =  true;
		}
		if(tableauVerif[2] && tableauVerif[4] && tableauVerif[6]) {
			gagnant =  true;
		}
		return gagnant;
	}
	
	static boolean isPartieFinie(String[] tableau) {
		boolean partieFinieO, partieFinieX = false;
		boolean[] tableauVerifO, tableauVerifX;
		boolean partieFinie;
		
		tableauVerifO = creationTableauVerif(tableau, " O |");
		partieFinieO = controlTableauVerif(tableauVerifO);
		
		tableauVerifX = creationTableauVerif(tableau, " X |");
		partieFinieX = controlTableauVerif(tableauVerifX);
		
		partieFinie = partieFinieO | partieFinieX;
		
		return partieFinie;
	}
	
	static String[] creationGrille() {
		String tableau[] = new String [9];
		for(int i = 0; i < tableau.length; i++) {
			tableau[i] = "   |";
		}
		return tableau;
	}
	
	static String[] jouerUneCase(boolean joueurO, String[] tableau) {
		int colonne, ligne;
		String caseValide;
		do {
			System.out.print("\nEntrez une colonne : ");
			colonne = lireEntier();
			
			System.out.print("\nEntrez une ligne : ");	
			ligne = lireEntier();
			
			caseValide = isCaseValide(tableau, ligne, colonne) ;
			if(caseValide != "OK") {
				System.out.println(caseValide);
			}
		} while (caseValide != "OK");
		
		entrerCoordonnees(joueurO, tableau, colonne, ligne);
		
		return tableau;
	}
	
	static void jouerPartie() {
		String[] tableau = creationGrille();
		do {
			jouerUneCase(true,tableau);
			jouerUneCase(false,tableau);
		} while(!isPartieFinie(tableau));
	}
	
}


