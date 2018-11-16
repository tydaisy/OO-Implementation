package towerdefence;

/**
 * The Enemy class is to illustrate many different method of enemies and the
 * superclass of Rat class and Elephant class.
 * 
 * @author CS5001 Yao Tong (cs5001.yt27@st-andrews.ac.uk)
 * @version 1
 * @since 19th October, 2017
 */
public class Enemy {

	// Initialise 2 attributes of an enemy.
	protected int health;
	protected double temPosition; // temporary position
	protected int position;
	protected double movement;
	protected String name;

	/**
	 * Implement the instructor of Game class.
	 */
	public Enemy() {
	}

	/**
	 * Return the health of current enemy.
	 * 
	 * @return health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Return the position of the current enemy.
	 * 
	 * @return position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * Update the health of the current enemy.
	 * 
	 * @param t
	 *            the object of Tower class
	 */
	public void hit(Tower t) {
		if (position <= t.getPosition()) {
			health = health - t.damage;
		}
	}

	/**
	 * Update the health of the current postion.
	 */
	public void advance() {

		temPosition += movement;
		position = (int) temPosition;

	}

	/**
	 * Return the name of the current enemy.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Override toString method.
	 * 
	 * @return the name, postion and health of the current enemy
	 */
	public String toString() {
		return "Enemy" + "(" + name + ")" + ": position: " + position + ", health:" + health;
	}
}
