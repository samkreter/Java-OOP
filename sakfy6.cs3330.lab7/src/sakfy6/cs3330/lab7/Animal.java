/*
 * Sam Kreter
 * sakfy6
 * 11/27/14
 * labc
 * derf
 * 
 * */
package sakfy6.cs3330.lab7;

public class Animal {

	protected boolean legs;
	protected boolean wings;
	protected String type;
	
	public Animal(boolean wings,boolean legs, String type){
		setLegs(legs);
		setWings(wings);
		setType(type);
	}
	public abstract boolean  eat(Animal food);
	
	public String toString(){
		
	} 
	
	protected void setLegs(boolean legs){
		this.legs = legs;
	}
	
	protected void setWings(boolean wings){
		this.wings = wings;
	}
	
	protected void setType(String type){}{
		this.type = type;
	}
	
}
