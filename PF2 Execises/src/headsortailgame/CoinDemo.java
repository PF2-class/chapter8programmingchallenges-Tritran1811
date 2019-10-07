package headsortailgame;

import java.util.Scanner;

public class CoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Players first = new Players("Wealth");
		Players second = new Players("Spaceship");
		boolean test = false, test2 = false;
		do {
			System.out.println("Player 1 guess. Heads or tails?");
			test = first.play(input.nextLine());
			System.out.println("Player 2 guess. Heads or tails?");
			test2 = second.play(input.nextLine());
			System.out.println(first + "\n" + second);
			if (test)
				System.out.println("The winner is " + first.getPlayersName());
			if (test2)
				System.out.println("The winner is " + second.getPlayersName());
		} while (!(test || test2));

		input.close();

	}

}
