package towerdefence;

/**
 * The Tower class is to illustrate many different method of towers.
 * 
 * @author CS5001 Yao Tong (cs5001.yt27@st-andrews.ac.uk)
 * @version 1
 * @since 19th October, 2017
 */
public class Tower {
	// Initialise 2 attributes of an enemy.
	protected int gameStep;
	protected boolean willFire;
	protected int damage;
	protected int position;
	protected int loadFrequency;
	protected String name;

	/**
	 * Implement the instructor of Game class.
	 */
	public Tower() {

	}

	/**
	 * Return dameage of the current tower.
	 * 
	 * @return damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * Return the position of the current tower.
	 * 
	 * @return position
	 */
	public int getPosition() {

		return position;
	}

	/**
	 * Decide if shot the enemy.
	 * 
	 * @param timeStep
	 *            is used to count the number of steps.
	 * @return true or false
	 */

	public boolean willFire(int timeStep) {
		if (timeStep % loadFrequency == 0) {
			return true;
		} else {
			return false;
		}
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
	 * @return the name, postion and damage of the current enemy
	 */
	public String toString() {
		if (position > 0 && position < Game.corridorLength) {
			return "Tower" + "(" + name + ")" + ": position: " + position + ", damage:" + damage;
		} else {
			return "The position of the tower can not be" + position;
		}
	}

}
