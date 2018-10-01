package jeuRole;

public class Homme extends EtreVivant {
	public Homme(){
		super.nbPV = 100;
	}
	public Homme(String nom) {
		super.nom = nom; 
		super.nbPV = 100;
	}
	
	public void parler(String texte) {
		System.out.print(super.nom + " : " + texte);
	}
}
