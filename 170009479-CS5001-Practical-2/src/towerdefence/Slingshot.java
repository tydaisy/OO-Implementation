package towerdefence;

/**
 * The Slingshot class is to illustrate the initial state of a slingshot an the
 * subclass of Tower class.
 * 
 * @author CS5001 Yao Tong (cs5001.yt27@st-andrews.ac.uk)
 * @version 1
 * @since 19th October, 2017
 */
public class Slingshot extends Tower {
	private final int myDamage = 1;
	private final int myLoadFrequency = 1;

	/**
	 * Initialize Slingshot class.
	 * 
	 * @param position
	 *            the position that is given by players
	 */
	public Slingshot(int position) {
		damage = myDamage;
		this.position = position;
		loadFrequency = myLoadFrequency;
		name = "Slingshot";
	}
}
