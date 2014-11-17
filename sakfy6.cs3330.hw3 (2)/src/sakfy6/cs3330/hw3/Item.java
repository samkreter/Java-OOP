/*
 * Sam Kreter
 * sakfy6
 * labc
 * hw3
 * 11/9/12
 * */

package sakfy6.cs3330.hw3;




/**
 * @author sakfy6
 *
 */
public abstract class Item {

	
	private String name;
	private String level;
	private int weight;
	
	
	
	/**
	 * constructor that uses the mutators 
	 * 
	 * @param name
	 * @param level
	 * @param weight
	 */
	public Item(String name, int weight, String level) {
		// TODO Auto-generated constructor stub
		setName(name);
		setLevel(level);
		setWeight(weight);
	}
	
	/**
	 * mutator for the name 
	 * 
	 * 
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * 
	 * mutator for the level
	 * 
	 * @param value
	 */
	public void setLevel(String level){
		this.level = level;
	}
	
	/**
	 * 
	 * mutator for the weight 
	 * 
	 * 
	 * @param weight
	 */
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	/**
	 * @return the name 
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * @return the level
	 */
	public String getLevel(){
		return this.level;
	}
	
	/**
	 * @return the weight 
	 */
	public int getWeight(){
		return this.weight;
	}
	
	/**
	 * 
	 * abstract function 
	 * */
	public abstract int getPoints();


}
