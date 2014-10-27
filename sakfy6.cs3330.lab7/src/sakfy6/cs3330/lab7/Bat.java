/*
 * Sam Kreter
 * sakfy6
 * 11/27/14
 * labc
 * derf
 * 
 * */

package sakfy6.cs3330.lab7;

public class Bat extends Animal implements Flying{
	
	
	/**
	 * constructor for bat class
	 * @param type
	 */
	public Bat(String type){
		super(true,true,type);
	}
	
	/** 
	 * abstract method definition from animal
	 * @param food 
	 */
	public boolean eat(Animal food){
		if(food instanceof Snake || food instanceof Bat){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * interface definiton for the takoff func
	 * @return 
	 */
	public void  takeoff(){
		System.out.println("The bat has taken off!");
	}
	/**
	 * interface definition for the land func
	 * 
	 */
	public void land(){
		System.out.println("The bat has landed");
	}
}
