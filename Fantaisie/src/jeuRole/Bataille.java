package jeuRole;

import java.util.Vector;

public class Bataille{
	private Camps campHomme = new Camps();
	private Camps campDragon = new Camps();

	public void ajouter(Homme homme) {
		campHomme.ajouterEtreVivant(homme);
		if (campHomme.nbCompagnon() > 1) {
			homme.parler("Bonjour, je m'appelle " + homme.getNom()
					+ " et je viens me joindre au combat.");
		} else
			livre.ecrire("\n"
					+ homme.getNom()
					+ " est le premier à se joindre à la dernière bataille entre les Hommes et les dragons");
	}

	public void ajouter(Dragon dragon) {
		campDragon.ajouterEtreVivant(dragon);
		if (campDragon.nbCompagnon() > 1) {
			livre.ecrire("\nUn nouveau dragon " + dragon.getNom()
					+ " s'approchait du champ de bataille");
		} else
			livre.ecrire("\nLe dragon " + dragon.getNom()
					+ " fut le premier à arriver sur le champ de bataille.");
	}

	public void eliminer(Dragon dragon) {
		campDragon.supprimerCompagnon(dragon);
		if (campDragon.nbCompagnon() == 0 && campHomme.nbCompagnon() > 0)
			livre.ecrire("\nLes Hommes ont conquis la lande, leurs villages n'auront plus jamais à trembler devant les dragons");
	}

	public void eliminer(Homme humain) {
		campHomme.supprimerCompagnon(humain);
		if (campHomme.nbCompagnon() == 0 && campDragon.nbCompagnon() > 0)
			livre.ecrire("\nLes dragons ont conquit la lande, les Hommes n'ont pas pu survivre dans ce monde hostile");
	}
	
	//TODO Ajout Graphique
	public Dragon getDragon(int indice) {
		return (Dragon) campDragon.getCompagnon(indice);
	}
	
	public Homme getHomme(int indice) {
		return (Homme) campHomme.getCompagnon(indice);
	}
	
	public Vector<String> nomsCampHomme(){
		return campHomme.nomsCompagnons();
	}
	
	public Vector<String> nomsCampDragon(){
		return campDragon.nomsCompagnons();
	}
	
	public boolean isDansBataille(EtreVivant etre){
		return (this.campDragon.isDansCamps(etre)||this.campHomme.isDansCamps(etre));
	}
}
