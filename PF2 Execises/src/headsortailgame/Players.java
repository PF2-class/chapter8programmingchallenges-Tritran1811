package headsortailgame;

public class Players {
	private String playersName;
	private int points;
	private Coin coin;

	public Players(String playerName) {
		playersName = playerName;
		this.points = 0;
		this.coin = new Coin();
	}

	public String getPlayersName() {
		return playersName;
	}

	public boolean play(String guess) {
		boolean win = false;
		if (coin.getSideCoin().equalsIgnoreCase(guess))
			points++;
		else
			points--;
		if (points == 5)
			win = true;
		return win;
	}

	public String toString() {
		String finalResult = String
				.format("Player " + playersName + " guess " + coin.getSideCoin() + " and has " + points + " points.");
		return finalResult;
	}

}
