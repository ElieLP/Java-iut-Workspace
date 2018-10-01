package moteurJeu;
public class Element {
	
	private char lettre;
	private int chiffre;
	private boolean elementTouche = false;
	
	public static void main(String[] args) {
		Element element = new Element('B', 3);
		System.out.println("L'�l�ment a-t-il pour coordonn�e (A,3) ?" +
		    element.verifierCoordonnee('A', 3));
		System.out.println("L'�l�ment a-t-il pour coordonn�e (B,3) ?" +
			    element.verifierCoordonnee('B', 3));
		System.out.println("L'�l�ment est-il touch� ?" +
			    element.elementTouche);
		System.out.println("Attaque de l'�l�ment");
		element.touche();
		System.out.println("L'�l�ment est-il touch� ?" +
			    element.elementTouche);
    }
	
	public Element(char lettre, int chiffre) {
		this.lettre = lettre;
		this.chiffre = chiffre;
	}

	public boolean isElementTouche() {
		return elementTouche;
	}

	public void touche() {
		this.elementTouche = true;
	}
	
	public boolean verifierCoordonnee(char lettre, int chiffre) {
		return this.lettre==lettre && chiffre == this.chiffre;
	}
	
}
