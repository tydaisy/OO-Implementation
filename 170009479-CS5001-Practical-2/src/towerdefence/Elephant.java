package towerdefence;

/**
 * The Elephant class is to illustrate the initial state of a elephant and the
 * subclass of Enemy class.
 * 
 * @author CS5001 Yao Tong (cs5001.yt27@st-andrews.ac.uk)
 * @version 1
 * @since 19th October, 2017
 */
public class Elephant extends Enemy {
	private final int myHealth = 10;
	private final int myTemPosition = 0;
	private final double myMovement = 0.5;

	/**
	 * Initialize Elephant class.
	 */
	public Elephant() {
		health = myHealth;
		temPosition = myTemPosition;
		movement = myMovement;
		name = "Elephant";
	}

}
