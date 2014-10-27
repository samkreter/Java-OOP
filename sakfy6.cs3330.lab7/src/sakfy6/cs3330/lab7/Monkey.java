/*
 * Sam Kreter
 * sakfy6
 * 11/27/14
 * labc
 * derf
 * 
 * */
package sakfy6.cs3330.lab7;

public class Monkey extends Animal implements NonFlying {

	
	
	/**
	 * constructor for the monkey class
	 * @param type
	 */
	public Monkey(String type){
		super(false,true,type);
	}
	/* implementatino from the abstract method in animal 
	 * @see sakfy6.cs3330.lab7.Animal#eat(sakfy6.cs3330.lab7.Animal)
	 */
	public boolean eat (Animal food){
		if(food instanceof Snake){
			return true;
		}
		else{
			return false;
		}
	}
	/* implementation from the nonflying interface
	 * @see sakfy6.cs3330.lab7.NonFlying#movement()
	 */
	public void movement(){
		System.out.println("The monkey is running on the ground");
	}
}
