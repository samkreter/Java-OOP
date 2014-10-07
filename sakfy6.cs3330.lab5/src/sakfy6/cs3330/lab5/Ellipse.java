/*
 * Sam Kreter
 * sakfy6
 * 10/6/2014
 * English is hard
 * 
 * */

package sakfy6.cs3330.lab5;

public class Ellipse extends Shape {
	
	private double majorAxis;
	private double minorAxis;
	
	
	/**
	 * constructor for the Ellipse class
	 * 
	 * @param minorAxis 
	 * @param majorAxis
	 * @param color
	 */
	public Ellipse(double minorAxis, double majorAxis, String color){
		super(color);
		setMajorAxis(majorAxis);
		setMinorAxis(minorAxis);
	} 
	
	/**
	 * setter for te majorAxis
	 * 
	 * @param majorAxis
	 */
	public void setMajorAxis(double majorAxis){
		this.majorAxis = majorAxis;
	}
	
	/**
	 * setter for the minor axis
	 * 
	 * @param minorAxis
	 */
	public void setMinorAxis(double minorAxis){
		this.minorAxis = minorAxis;
	}
	

	/**
	 * finds the area 
	 * 
	 * @return
	 */
	public double calcArea(){
		return (Math.PI * this.majorAxis * this.minorAxis);
	} 
	/**
	 * finds the perimeter 
	 * 
	 * @return
	 */
	public double calcPerimeter(){
		return 2*Math.PI*Math.sqrt((Math.pow(this.majorAxis,2)+Math.pow(this.minorAxis,2))/2);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return ("Eclipse "+super.getColor()+" "+calcArea()+" "+calcPerimeter());
	} 
}
