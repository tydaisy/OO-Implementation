package towerdefence;

/**
 * The Catapult class is to illustrate the initial state of a catapult and the
 * subclass of Tower class.
 * 
 * @author CS5001 Yao Tong (cs5001.yt27@st-andrews.ac.uk)
 * @version 1
 * @since 19th October, 2017
 */
public class Catapult extends Tower {
	private final int myDamage = 5;
	private final int myLoadFrequency = 3;

	/**
	 * Initialize Catapult class.
	 * 
	 * @param position
	 *            the position that is given by players
	 */
	public Catapult(int position) {
		damage = myDamage;
		this.position = position;
		loadFrequency = myLoadFrequency;
		name = "Catapult";
	}
}
