package jeuRole;

public class Heros extends Homme {
	public Heros(String nom) {
		super.nom = nom; 
		super.nbPV = 150;
	}
	public void parler(String texte) {
		System.out.print("Le héros ");
		super.parler(texte);
	}
}
