package tennis;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {
	
	private TennisGame game;

	@Before
	public void setUp() throws Exception {
		this.game = new TennisGame();
	}

	@After
	public void tearDown() throws Exception {
		this.game = null;
	}

	@Test
	public void testNouveauJeu() {
		assertEquals("love - love", this.game.currentScore());
	}
	
	@Test
	public void testJoueur1Marque1Point() {
		this.game.player1Scores();
		assertEquals("fifteen - love", this.game.currentScore());
	}
	
	@Test
	public void testJoueur2Marque1Point() {
		this.game.player2Scores();
		assertEquals("love - fifteen", this.game.currentScore());
	}

	@Test
	public void testJoueur1Marque2Point() {
		this.game.player1Scores();
		this.game.player1Scores();
		assertEquals("thirty - love", this.game.currentScore());
	}

	@Test
	public void testJoueur2Marque2Point() {
		this.game.player2Scores();
		this.game.player2Scores();
		assertEquals("love - thirty", this.game.currentScore());
	}
	
	@Test
	public void testJoueur1Et2Marque1Point() {
		this.game.player1Scores();
		this.game.player2Scores();
		assertEquals("fifteen - fifteen", this.game.currentScore());
	}
	
	@Test
	public void testJoueur1Et2Marque2Point() {
		setterScore(2,2);
		assertEquals("thirty - thirty", this.game.currentScore());
	}

	private void setterScore(int score1, int score2) {
		for (int i = 0; i < score1; i++) {
			this.game.player1Scores();
		}
		for (int j = 0; j < score2; j++) {
			this.game.player2Scores();
		}
	}


}
