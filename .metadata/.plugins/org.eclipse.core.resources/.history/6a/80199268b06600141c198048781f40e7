/**
 * Sam Kreter
 * Sakfy6
 * LAB C
 * 10/16/14
 * hw2
 */

package sakfy6.cs3330.hw2;


public class Health {

	private int healthPoints;
	private boolean alive;
	
	/**
	 * contructor 
	 */
	public Health(){
		setHealth(100);
		setAlive(true);
	}
	
	/**
	 * contructor that sets the hp
	 * @param hp
	 */
	public Health(int hp){
		setHealth(hp);
		setAlive(true);
		
	}
	
	/**
	 * 
	 * setter
	 * @param hp
	 */
	public void setHealth(int hp){
		this.healthPoints = hp;
	}
	
	/**
	 * setter
	 * @param alive
	 */
	public void setAlive(boolean alive){
		this.alive = alive;
	}
	
	/**
	 * 
	 * getter
	 * @return
	 */
	public int getHealthPoints(){
		return this.healthPoints;
	}
	
	/**
	 * getter
	 * @return
	 */
	public boolean getAlive(){
		return this.alive;
	}
	
	/**
	 * makes the hit against the points 
	 * @param hitPoints
	 */
	public void hit(int hitPoints){
		setHealth(this.healthPoints - hitPoints);
		if(this.healthPoints <= 0){
			this.alive = false;
		}
	}
}
