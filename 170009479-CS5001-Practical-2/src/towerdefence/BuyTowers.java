package towerdefence;

import java.util.Scanner;

/**
 * The BuyTowers class is to illustrate the process of buy towers.
 * 
 * @author CS5001 Yao Tong (cs5001.yt27@st-andrews.ac.uk)
 * @version 1
 * @since 19th October, 2017
 */
public class BuyTowers {
	private static Scanner scan;
	private static String response;
	private static String response1;
	private static String response2;
	protected static int SlingNumber = 0;
	protected static int CataNumber = 0;

	private static int SlingCost = 50;
	private static int CataCost = 150;
	private static int coin = 1000;
	private static int coinTemp = 1000;

	static void buyTowers() {
		do {
			System.out.println("Would you like to buy towers?");
			System.out.println("A. Yes");
			System.out.println("B. No");
			scan = new Scanner(System.in);
			response = scan.nextLine();

			if (response.equals("A")) {
				do {
					do {
						System.out.println("Which kind of tower do you want?");
						System.out.println("A. Slingshot (" + SlingCost + " coins each slingshot)");
						System.out.println("B. Catapult (" + CataCost + " coins each catapult)");
						scan = new Scanner(System.in);
						response = scan.nextLine();

						if (response.equals("A")) {
							do {
								System.out.println("How many Slingshot do you want?");
								scan = new Scanner(System.in);
								response1 = scan.nextLine();
								coinTemp = coin - SlingCost * Integer.valueOf(response1);
								if (coinTemp < 0) {
									System.out.println("You have no enough coins! Please input a valid answer!");
								} else {
									coin = coinTemp;
								}
							} while (coinTemp < 0);
							System.out.println("Now you have " + coin + " coins.");
							SlingNumber += Integer.valueOf(response1);

						} else if (response.equals("B")) {
							do {
								System.out.println("How many Catapult do you want?");
								scan = new Scanner(System.in);
								response2 = scan.nextLine();
								coinTemp = coin - CataCost * Integer.valueOf(response2);
								if (coinTemp < 0) {
									System.out.println("You have no enough coins! Please input a valid answer!");
								} else {
									coin = coinTemp;
								}
							} while (coinTemp < 0);
							System.out.println("Now you have " + coin + " coins.");
							CataNumber += Integer.valueOf(response2);
							// System.out.println("Now you have " + coin + "
							// coins.");

						} else {
							System.out.println("Please input a valid answer!");
						}
					} while (!(response.equals("A") || response.equals("B")));
					do {
						System.out.println("Would you like to buy other towers?");
						System.out.println("A. Yes");
						System.out.println("B. No");
						scan = new Scanner(System.in);
						response = scan.nextLine();
						if (!(response.equals("A") || response.equals("B"))) {
							System.out.println("Please input a valid answer!");
						}
					} while (!(response.equals("A") || response.equals("B")));
				} while (!response.equals("B"));
			} else {
				System.out.println("Please input a valid answer!");
			}
		} while (!response.equals("B"));
	}
}
