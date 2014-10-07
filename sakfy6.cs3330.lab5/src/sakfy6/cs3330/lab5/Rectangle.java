/*
 * Sam Kreter
 * sakfy6
 * 10/6/2014
 * English is hard
 * 
 * */

package sakfy6.cs3330.lab5;

public class Rectangle extends Shape {

	private double width;
	private double height;
	
	
	/**
	 * constructor for the rectangle class
	 * 
	 * @param width
	 * @param height
	 * @param color
	 */
	Rectangle(double width, double height, String color){
		super(color);
		setWidth(width);
		setHeight(height);
	} 
	
	
	/**
	 * setter for the width
	 * 
	 * @param width
	 */
	public void setWidth(double width){
		this.width = width;
	}
	
	/**
	 * setter for the height
	 * 
	 * @param height
	 */
	public void setHeight(double height){
		this.height = height;
	}
	
	/**
	 * getter for width
	 * 
	 * @return
	 */
	public double getWidth(){
		return this.width;
	}
	
	/**
	 * getter for height
	 * 
	 * @return
	 */
	public double getHeight(){
		return this.height;
	}
	/**
	 * calculates area
	 * 
	 * @return
	 */
	public double calcArea() {
		return (this.height * this.width);
	}
	/**
	 * calculates perimeter
	 * 
	 * @return
	 */
	public double calcPerimeter(){
		return (2*this.height + 2*this.width);
	} 
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return ("Rectangle "+super.getColor()+" "+calcArea()+" "+calcPerimeter());
	}
}
