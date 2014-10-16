/**
 * Sam Kreter
 * Sakfy6
 * LAB C
 * 10/16/14
 * hw2
 */


package sakfy6.cs3330.hw2;




/**
 * @author sakfy6
 *
 */
public class Item {

	
	private String name;
	private int value;
	private int weight;
	
	
	/**
	 * constructor that uses the mutators 
	 * 
	 * @param name
	 * @param value
	 * @param weight
	 */
	public Item(String name, int value, int weight) {
		// TODO Auto-generated constructor stub
		setName(name);
		setValue(value);
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
	 * mutator for the value
	 * 
	 * @param value
	 */
	public void setValue(int value){
		this.value = value;
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
	 * @return the value 
	 */
	public int getValue(){
		return this.value;
	}
	
	/**
	 * @return the weight 
	 */
	public int getWeight(){
		return this.weight;
	}
	


}
