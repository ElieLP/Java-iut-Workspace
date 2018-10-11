package livre;

public class Ecran implements Livre{

	@Override
	public void ecrire(String texte) {
		System.out.println(texte);
	}
	
}
