package moteurJeu;
public class Element {
	
	private char lettre;
	private int chiffre;
	private boolean elementTouche = false;
	
	public static void main(String[] args) {
		Element element = new Element('B', 3);
		System.out.println("L'élément a-t-il pour coordonnée (A,3) ?" +
		    element.verifierCoordonnee('A', 3));
		System.out.println("L'élément a-t-il pour coordonnée (B,3) ?" +
			    element.verifierCoordonnee('B', 3));
		System.out.println("L'élément est-il touché ?" +
			    element.elementTouche);
		System.out.println("Attaque de l'élément");
		element.touche();
		System.out.println("L'élément est-il touché ?" +
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
