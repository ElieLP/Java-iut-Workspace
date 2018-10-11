package jeuRole;

public class Dragon extends EtreVivant {
	public Dragon(String nom){
		super.nom = nom;
		super.nbPV = 200;	
	}

	@Override
	public void mourir(EtreVivant etreVivant, Bataille bataille) {
		System.out.print("C'est ainsi que le dragon " + super.getNom() + " mourut");
		bataille.eliminer(this);		
	}
	
	@Override
	public void rejointBataille(Bataille bataille) {
		super.rejointBataille(bataille);
		bataille.ajouter(this);
	}
}
