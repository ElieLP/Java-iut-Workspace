package tennis;

public class TennisGame {
	private String namePlayer1;
	private String namePlayer2;
	private int scorePlayer1;
	private int scorePlayer2;
	public static final String tabScores[] = { "Love", "Fifteen", "Thirty", "Forty" };

	public TennisGame() {
		this.namePlayer1 = "player1";
		this.namePlayer2 = "player2";
		this.scorePlayer1 = 0;
		this.scorePlayer2 = 0;
	}
	
	public TennisGame(String player1, String player2) {
		this.namePlayer1 = player1;
		this.namePlayer2 = player2;
		this.scorePlayer1 = 0;
		this.scorePlayer2 = 0;
	}

	public String getScore() {
		if (this.player1Won()) {
			return "Win for player1";
		}
		if (this.player2Won()) {
			return "Win for player2";
		}
		if (this.gameThatLastsALongTime()) {
			return this.deuceOrAdvantage();
		}
		if (tabScores[this.scorePlayer1] == tabScores[this.scorePlayer2]) {
			return tabScores[this.scorePlayer1] + "-All";
		} else {
			return tabScores[this.scorePlayer1] + "-" + tabScores[this.scorePlayer2];
		}
		
	}

	private String deuceOrAdvantage() {
		if (this.scorePlayer1 == this.scorePlayer2) {
			return "Deuce";
		}
		if (this.scorePlayer1 > this.scorePlayer2) {
			return ("Advantage player1");
		}
		return ("Advantage player2");
	}

	private boolean gameThatLastsALongTime() {
		return (this.scorePlayer1 >= 3 && this.scorePlayer2 >= 3);
	}

	private boolean player1Won() {
		return playerWon(this.scorePlayer1, this.scorePlayer2);
	}

	private boolean player2Won() {
		return playerWon(this.scorePlayer2, this.scorePlayer1);
	}

	private boolean playerWon(int score1, int score2) {
		return (score1 >= 4 && score1 - score2 >= 2);
	}

	public void wonPoint(String player) {
		if (player == namePlayer1) {
			this.scorePlayer1 += 1;
		} else if (player == namePlayer2){
			this.scorePlayer2 += 1;
		} else {
			System.out.println("wonPoint("+ player +") player "+ player +" doesn't exist");
		}
		
	}
}
