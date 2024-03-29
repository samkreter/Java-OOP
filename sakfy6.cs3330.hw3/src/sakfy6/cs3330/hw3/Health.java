/*
 * Sam Kreter
 * sakfy6
 * labc
 * hw3
 * 11/9/12
 * */
package sakfy6.cs3330.hw3;


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
	
	
	/**
	 * 
	 * heals based on the passed in points 
	 * @param healPoints
	 * 
	 * */
	public void heal(int healPoints){
		this.healthPoints = healthPoints + healPoints;
	}
}
