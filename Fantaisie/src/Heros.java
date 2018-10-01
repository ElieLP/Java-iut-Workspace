
public class Heros extends Homme {
	Heros(String nom) {
		super.nom = nom; 
		super.nbPV = 150;
	}
	public void parler(String texte) {
		System.out.println("Le héros "+ nom + " : " + texte);
	}
}
