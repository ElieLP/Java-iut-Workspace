package tennis;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {
	
	private TennisGame game;

	@Before
	public void setUp() throws Exception {
		this.game = new TennisGame("player1","player2");
	}

	@After
	public void tearDown() throws Exception {
		this.game = null;
	}

	@Test
	public void testNouveauJeu() {
		assertEquals("Love-All", this.game.getScore());
	}
	
	@Test
	public void testJoueur1Marque1Point() {
		setterScore(1,0);
		assertEquals("Fifteen-Love", this.game.getScore());
	}
	
	@Test
	public void testJoueur2Marque1Point() {
		setterScore(0,1);
		assertEquals("Love-Fifteen", this.game.getScore());
	}

	@Test
	public void testJoueur1Marque2Point() {
		setterScore(2,0);
		assertEquals("Thirty-Love", this.game.getScore());
	}

	@Test
	public void testJoueur2Marque2Point() {
		setterScore(0,2);
		assertEquals("Love-Thirty", this.game.getScore());
	}
	
	@Test
	public void testJoueur1Et2Marque1Point() {
		setterScore(1,1);
		assertEquals("Fifteen-All", this.game.getScore());
	}
	
	@Test
	public void testJoueur1Et2Marque2Point() {
		setterScore(2,2);
		assertEquals("Thirty-All", this.game.getScore());
	}
	
	@Test
	public void testJoueur1Et2Marque3Point() {
		setterScore(3,3);
		assertEquals("Deuce", this.game.getScore());
	}
	
	@Test
	public void testJoueur1Marque1Et2Marque4Point() {
		setterScore(4,4);
		assertEquals("Deuce", this.game.getScore());
	}

	@Test
	public void testJoueur1Marque1Et2Marque3Point() {
		setterScore(1,3);
		assertEquals("Fifteen-Forty", this.game.getScore());
	}

	
	@Test
	public void testJoueur1GagneRapidement() {
		setterScore(4,0);
		assertEquals("Win for player1", this.game.getScore());
	}
	
	@Test
	public void testJoueur2GagneRapidement() {
		setterScore(0,4);
		assertEquals("Win for player2", this.game.getScore());
	}
	
	@Test
	public void testAvantageJoueur1() {
		setterScore(4,3);
		assertEquals("Advantage player1", this.game.getScore());
	}
	
	@Test
	public void testAvantageJoueur2() {
		setterScore(3,4);
		assertEquals("Advantage player2", this.game.getScore());
	}
	
	@Test
	public void testJoueur1GagneDifficilement() {
		setterScore(5,3);
		assertEquals("Win for player1", this.game.getScore());
	}
	
	@Test
	public void testJoueur2GagneDifficilement() {
		setterScore(3,5);
		assertEquals("Win for player2", this.game.getScore());
	}
	
	private void setterScore(int score1, int score2) {
		for (int i = 0; i < score1; i++) {
			game.wonPoint("player1");
		}
		for (int j = 0; j < score2; j++) {
			game.wonPoint("player2");
		}
	}


}
