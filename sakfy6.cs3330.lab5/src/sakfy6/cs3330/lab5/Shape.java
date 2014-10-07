/*
 * Sam Kreter
 * sakfy6
 * 10/6/2014
 * English is hard
 * 
 * */

package sakfy6.cs3330.lab5;


public class Shape {
	
	private String color;
	
	/**
	 * constructor for the Shapes class
	 * 
	 * @param color
	 */
	public Shape(String color){
		setColor(color);
	}
	
	/**
	 * setter for color 
	 * 
	 * @param color
	 */
	public void setColor(String color){
		this.color = color;
	}
	
	/**
	 * returns the color 
	 * 
	 * @return
	 */
	public String getColor(){
		return this.color;
	}
}
