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
	@Override
	public void mourir(EtreVivant etreVivant, Bataille bataille) {
		bataille.eliminer(this);
		System.out.print("C'est ainsi que le courageux " + super.getNom() + " mourut");
	}
	
	@Override
	public void rejointBataille(Bataille bataille) {
		super.rejointBataille(bataille);
		bataille.ajouter(this);
	}
	
	
}
