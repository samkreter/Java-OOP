/**

name: Sam Kreter
date: 9/22/2014
section: C
submission Code: poopsies

attempting bonus
 * 
 */

package sakfy6.cs3330.lab3;




/**
 * @author sakfy6
 *
 */
public class Hero {

	
	private String name;
	private String weapon;
	private int attackPoints;
	
	
	/**
	 * Constructor for the hero class
	 * 
	 * @param name the name of here being created 
	 * @param weapon the name of the weapon 
	 * @param attackPoints number of attack points for the hero 
	 */
	public Hero(String name, String weapon, int attackPoints) {
		setName(name);
		setWeapon(weapon);
		setAttackPoints(attackPoints);
	}

	/**
	 * sets the name of the hero
	 * 
	 * @param name name of the hero 
	 */
	private void setName(String name){
		this.name = name;
	}
	/**
	 * sets the weapon
	 * 
	 * @param weapon weapon used by the hero 
	 */
	private void setWeapon(String weapon){
		this.weapon = weapon; 
	}
	/**
	 * sets the attack points 
	 * 
	 * @param attackPoints  number of attack points 
	 */
	private void setAttackPoints(int attackPoints){
		if(attackPoints > 0){
			this.attackPoints = attackPoints;
		}
		else{
			this.attackPoints = 10;
		}
	}

	/**
	 * updates the attackpoints 
	 * 
	 * @param newAttackPoints amount of new attack points 
	 * 
	 */
	public void updateAttackPoints(int newAttackPoints){
		setAttackPoints(newAttackPoints);
	}
	
	/**
	 * @return the name of the hero 
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * @return the weapon of the hero 
	 */
	public String getWeapon(){
		return this.weapon;
	}
	
	/**
	 * @return the attack points of the hero 
	 */
	public int getAttackPoints(){
		return this.attackPoints;
	}
	
}
