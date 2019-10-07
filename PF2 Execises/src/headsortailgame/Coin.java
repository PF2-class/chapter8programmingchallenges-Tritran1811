package headsortailgame;

import java.util.Random;

public class Coin {
	private String sideUp;

	public Coin() {
		flip();
	}

	public void flip() {
		Random rand = new Random();
		int flip = rand.nextInt(2);
		if (flip == 0) {
			sideUp = "Heads";
		} else {
			sideUp = "Tails";
		}
	}

	public String getSideCoin() {
		return sideUp;
	}

}
