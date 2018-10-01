package livre;
import Dragon;
import Heros;
import Homme;

public class Histoire {
	public static void main(String[] args) {
		Homme elie = new Homme("Elie");
		Heros constantin = new Heros("Constantin");
		Dragon dragonet = new Dragon("dragonet");
		
		elie.parler("Salut");
		constantin.parler("Coucou");				
	}
}
