/*
 * Sam Kreter
 * sakfy6
 * 11/27/14
 * labc
 * derf
 * 
 * */
package sakfy6.cs3330.lab7;

public class Snake extends Animal implements NonFlying{

	
	/**
	 * constructor for the snake class
	 * @param type
	 */
	Snake(String type){
		super(false,false,type);
	}
	/* implementaitno of abstact method from animal
	 * @see sakfy6.cs3330.lab7.Animal#eat(sakfy6.cs3330.lab7.Animal)
	 */
	public boolean eat(Animal food){
		return false;
	}
	/* implementation from nonflying interface
	 * @see sakfy6.cs3330.lab7.NonFlying#movement()
	 */
	public void movement(){
		System.out.println("The snake slithers on the ground");
	}
}
