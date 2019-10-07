package firsttoonegame;

public class Players {
	private double points = 50;
	private String playersName;
	private Die dice;

	public Players(String playerName, Die dice) {
		this.playersName = playerName;
		this.dice = new Die(dice);
	}

	public String getPlayersName() {
		return playersName;
	}

	public boolean calculatePoints() {
		boolean result = false;
		dice.roll();
		if (points - dice.getValue() == 1) {
			points -= dice.getValue();
			result = true;
		} else if (points - dice.getValue() < 1) {
			points += dice.getSides();
		} else
			points -= dice.getValue();
		return result;
	}

	public String toString() {
		String finalResult = String
				.format("Player " + playersName + " rolled " + dice.getValue() + " and has " + points + " points.");
		return finalResult;
	}

}
