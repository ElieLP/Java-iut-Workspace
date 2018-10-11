package jeuRole;

public class Heros extends Homme {
	public Heros(String nom) {
		super.nom = nom; 
		super.nbPV = 150;
	}
	public void parler(String texte) {
		System.out.print("Le h�ros ");
		super.parler(texte);
	}
	
	@Override
	public void rejointBataille(Bataille bataille) {
		super.rejointBataille(bataille);
		bataille.ajouter(this);
	}
}
