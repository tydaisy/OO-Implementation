package towerdefence;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Game class is to illustrate the process of the tower defence game.
 * 
 * @author CS5001 Yao Tong (cs5001.yt27@st-andrews.ac.uk)
 * @version 1
 * @since 19th October, 2017
 */
public class Game {
	static ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	static ArrayList<Tower> towers = new ArrayList<Tower>();

	private static Scanner scan;
	private static String response;
	private static int steps = 30;
	private static int numberOfRat = 3;
	private static int numberOfElephant = 2;

	protected static int counter = 0;
	protected static int corridorLength = 50;

	/**
	 * Implement the instructor of Game class.
	 */
	public Game() {
	}

	/**
	 * The main method is uese to illustrate the steps of the tower defence game.
	 * including buy towers, install towers, add enemies, advance the state of
	 * enemies and display the interface of the game
	 * 
	 * @param args
	 *            are the input arguments for main.
	 */
	public static void main(String[] args) {

		BuyTowers.buyTowers();

		// configure towers
		for (int i = 0; i < BuyTowers.SlingNumber; i++) {
			do {
				System.out.println("Which position of Slingshot" + i
						+ " would you like? (Please input number, the range is from 0 to " + corridorLength);
				scan = new Scanner(System.in);
				response = scan.nextLine();
				towers.add(new Slingshot(Integer.valueOf(response)));
				if (Integer.valueOf(response) > corridorLength) {
					System.out.println("Please input a valid position!");
				}
			} while (Integer.valueOf(response) < 0 || Integer.valueOf(response) > corridorLength);
		}
		for (int i = 0; i < BuyTowers.CataNumber; i++) {
			do {
				System.out.println("Which position of Catapult" + i
						+ " would you like? (Please input number, the range is from 0 to " + corridorLength);
				scan = new Scanner(System.in);
				response = scan.nextLine();
				towers.add(new Catapult(Integer.valueOf(response)));
				if (Integer.valueOf(response) > corridorLength) {
					System.out.println("Please input a valid position!");
				}
			} while (Integer.valueOf(response) < 0 || Integer.valueOf(response) > corridorLength);
		}

		for (int ts = 0; ts < steps; ts++) {

			// add enemies automatically
			if (ts % 3 == 0) {
				for (int j = 0; j < numberOfRat; j++) {
					enemies.add(new Rat());
				}
				for (int j = 0; j < numberOfElephant; j++) {
					enemies.add(new Elephant());
				}
			}
			System.out.println("Time Step: " + ts);
			DisplayGame.display();
			System.out.println();
			for (int j = 0; j < enemies.size(); j++) {
				enemies.get(j).advance();
			}
			advance(ts);
			counter++;
		}
	}

	static void advance(int timeStep) {
		for (int i = 0; i < towers.size(); i++) {
			if (towers.get(i).willFire(timeStep)) {
				if (enemies.size() > 0) {
					enemies.get(0).hit(towers.get(i));
					if (enemies.get(0).getHealth() <= 0) {
						enemies.remove(0);
					}
				}
			}
		}
	}

}
