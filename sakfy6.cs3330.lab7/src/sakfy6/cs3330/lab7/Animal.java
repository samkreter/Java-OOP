/*
 * Sam Kreter
 * sakfy6
 * 11/27/14
 * labc
 * derf
 * 
 * */
package sakfy6.cs3330.lab7;

import java.lang.StringBuffer;

public abstract class Animal {

	protected boolean legs;
	protected boolean wings;
	protected String type;
	
	/**
	 * constructor for the animal class
	 * @param wings
	 * @param legs
	 * @param type
	 */
	public Animal(boolean wings,boolean legs, String type){
		setLegs(legs);
		setWings(wings);
		setType(type);
	}
	/**
	 * abstract eat function  
	 *
	 * @param food
	 * @return
	 */
	abstract boolean eat(Animal food);
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		StringBuffer buffer = new StringBuffer(type+" ");
		buffer.append(((getWings())?"has ":"has no ")+"wings");
		if(type.equals("Monkey")){
			buffer.append(", but ");
		}
		else{
			buffer.append(" and ");
		}
		buffer.append(((getLegs())?"has ":"has no ")+"legs");
		return buffer.toString();
	} 
	
	/**
	 * setter
	 * @param legs
	 */
	protected void setLegs(boolean legs){
		this.legs = legs;
	}
	
	/**
	 * setter
	 * 
	 * @param wings
	 */
	protected void setWings(boolean wings){
		this.wings = wings;
	}
	
	/**
	 * setter
	 * 
	 * @param type
	 */
	protected void setType(String type){
		this.type = type;
	}
	
	/**
	 * getter
	 * 
	 * @return
	 */
	public boolean getLegs(){
		return this.legs;
	}
	
	/**
	 * getter
	 * @return
	 */
	public boolean getWings(){
		return this.wings;
	}
	
	/**
	 * getter
	 * @return
	 */
	public String getType(){
		return this.type;
	}
	
}
