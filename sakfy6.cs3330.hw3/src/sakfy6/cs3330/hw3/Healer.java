/*
 * Sam Kreter
 * sakfy6
 * labc
 * hw3
 * 11/9/12
 * */

package sakfy6.cs3330.hw3;

public class Healer extends Item{

	private int healPoints;
	
	/**
	 * constructor
	 * 
	 * @param name
	 * @param level
	 * @param weight
	 * @param healPoints
	 */
	public Healer(String name, String level, int weight, int healPoints){
		super(name,weight,level);
		setHealPoints(healPoints);
	}
	
	/**
	 * 
	 * setter for the points 
	 * @param healPoints
	 */
	private void setHealPoints(int healPoints){
		this.healPoints = healPoints;
	}
	
	/**
	 * getter for the points 
	 * 
	 * */
	public int getPoints(){
		return this.healPoints;
	}
	
}
