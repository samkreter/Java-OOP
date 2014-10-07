/*
 * Sam Kreter
 * sakfy6
 * 10/6/2014
 * English is hard
 * 
 * */

package sakfy6.cs3330.lab5;

public class Circle extends Ellipse {

	
	/**
	 * @param radius of the circle
	 * @param color of the circle
	 */
	public Circle(double radius, String color){
		super(radius,radius,color);
	}
	

	/* (non-Javadoc)
	 * @see sakfy6.cs3330.lab5.Ellipse#toString()
	 */
	public String toString(){
		return("Circle "+super.getColor()+" "+super.calcArea()+" "+super.calcPerimeter());
	}
}
