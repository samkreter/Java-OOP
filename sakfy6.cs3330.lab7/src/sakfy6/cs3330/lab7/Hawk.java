/*
 * Sam Kreter
 * sakfy6
 * 11/27/14
 * labc
 * derf
 * 
 * */

package sakfy6.cs3330.lab7;

public class Hawk extends Animal implements Flying{

	
	/**
	 * 
	 * constructor for the Hawk class
	 * @param type
	 */
	public Hawk(String type){
		super(true,true,type);
	}
	/* concrete definition of the abstract method from the super class
	 * @see sakfy6.cs3330.lab7.Animal#eat(sakfy6.cs3330.lab7.Animal)
	 */
	public boolean eat(Animal food){
		if(food instanceof Bat || food instanceof Snake){
			return true;
		}
		else{
			return false;
		}
	}
	/* implementation from the flying interface
	 * @see sakfy6.cs3330.lab7.Flying#takeoff()
	 */
	public void takeoff(){
		System.out.println("The hawk has taken off!");
	}
	/* implementation from the flying interface
	 * @see sakfy6.cs3330.lab7.Flying#land()
	 */
	public void land(){
		System.out.println("The hawk has landed on the ground");
	} 
}
