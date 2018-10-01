package jeuRole;

public class EtreVivant {
	protected int nbPV;
	protected String nom;
	private Bataille bataille;
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void subirAttaque(int force) {
		this.nbPV =- force;
		
		System.out.print(nom + "subit une violente attaque ");
		
		if (this.nbPV > 0) {
			System.out.print("mais il parvient à se relever");
		} else {
			System.out.print("trop violente pour survivre");
		}
	}
	
	public int getNbPV() {
		return nbPV;
	}
	
	public void rejointBataille(Bataille bataille) {
		this.bataille = bataille;
	}
	
	
	
}
