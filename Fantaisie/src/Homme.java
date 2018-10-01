
public class Homme extends Personnage {
	Homme(){
		super.nbPV = 100;
	}
	Homme(String nom) {
		super.nom = nom; 
		super.nbPV = 100;
	}
	
	public void parler(String texte) {
		System.out.println(nom + " : " + texte);
	}
}
