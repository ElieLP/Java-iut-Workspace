package morpion;

import java.util.Scanner;

public class Jeu {
	
	private static String[] tableau;

	public static void main(String[] args) {

//		EXO 1
		System.out.println("EXO1 :\nJeu du morpion");
		
//		EXO 2
		System.out.println("EXO2");
		boolean joueurO = false;
		System.out.print("| ");
		if(joueurO) {
			System.out.print("O");
		} else {
			System.out.print("X");
		}
		System.out.println(" |");
		
//		EXO 3
		System.out.println("EXO3");
		String symbolesJoueurs[] = new String [9];
		for(int i = 0; i < symbolesJoueurs.length; i++) {
			symbolesJoueurs[i] = "   |";
		}
		System.out.print("|");
		for(int i = 0; i < symbolesJoueurs.length; i++) {
			System.out.print(symbolesJoueurs[i]);
		}
		System.out.println();
		
//		EXO 4
		System.out.println("EXO4");
		for(int i = 1; i < symbolesJoueurs.length+1; i++) {
			if(i%3 == 1) {
				System.out.println();
				System.out.print("|");
			}
			System.out.print(symbolesJoueurs[i-1]);
		}
		System.out.println("\n");
		
//		EXO 5
		System.out.println("EXO5");
		afficherTableau(symbolesJoueurs);
		System.out.println();
		
//		EXO 6
		System.out.println("EXO6");
		tableau = symbolesJoueurs;
		entrerCoordonnees(true, tableau, 1, 1);
		entrerCoordonnees(false, tableau, 3, 3);
		afficherTableau(tableau);
		
		System.out.print("\nEntrez une coordonnée : ");
		
		
		int test = lireEntier();
		System.out.println(test);
		
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
		int caseTableau = convertirEnCases(ligne, colonne);
		
		String marque = " X |";
		if(joueurO) {
			marque = " O |";
		}

		try {
			tableau[caseTableau] = marque ;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Les coordonnées sont hors bornes");
        }
	}

	private static int convertirEnCases(int ligne, int colonne) {
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

}
