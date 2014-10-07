/*
 * Sam Kreter
 * sakfy6
 * 10/6/2014
 * English is hard
 * 
 * */

package sakfy6.cs3330.lab5;

public class Square extends Rectangle{

	
	/**
	 * constructor for the square class
	 * 
	 * @param size
	 * @param color
	 */
	public Square(double size, String  color){
		super(size,size,color);
	} 
	/* (non-Javadoc)
	 * @see sakfy6.cs3330.lab5.Rectangle#toString()
	 */
	public String toString(){
		return ("Square "+super.getColor()+" "+super.calcArea()+" "+super.calcPerimeter());
	}
}
