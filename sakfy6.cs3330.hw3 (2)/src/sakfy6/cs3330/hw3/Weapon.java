/*
 * Sam Kreter
 * sakfy6
 * labc
 * hw3
 * 11/9/12
 * */

package sakfy6.cs3330.hw3;

public class Weapon extends Item{

	
	private int damagePoints;
	
	/**
	 * constructor for the weapons
	 * @param name
	 * @param level
	 * @param weight
	 * @param damagePoints
	 */
	public Weapon(String name, String level, int weight, int damagePoints){
		super(name,weight,level);
		setDamagePoints(damagePoints);
	}
	
	/**
	 * setter for the damage poitns 
	 * @param damagePoints
	 */
	private void setDamagePoints(int damagePoints){
		this.damagePoints = damagePoints;
	}
	
	/**
	 * 
	 * gets the points 
	 * */
	public int getPoints(){
		return this.damagePoints;
	}
}
