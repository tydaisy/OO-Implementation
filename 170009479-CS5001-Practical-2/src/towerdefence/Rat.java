package towerdefence;

/**
 * The Rat class is to illustrate the initial state of a rat and the subclass of
 * Enemy class.
 * 
 * @author CS5001 Yao Tong (cs5001.yt27@st-andrews.ac.uk)
 * @version 1
 * @since 19th October, 2017
 */
public class Rat extends Enemy {
	private final int myHealth = 1;
	private final int myTemPosition = 0;
	private final double myMovement = 2;

	/**
	 * Initialize Rat class.
	 */
	public Rat() {
		health = myHealth;
		temPosition = myTemPosition;
		movement = myMovement;
		name = "Rat";
	}

}
