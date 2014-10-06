package sakfy6.cs3330.lab5;

public class Ellipse extends Shape {
	
	private double majorAxis;
	private double minorAxis;
	
	
	public Ellipse(double minorAxis, double majorAxis, String color){
		super(color);
		setMajorAxis(majorAxis);
		setMinorAxis(minorAxis);
	} 
	
	public void setMajorAxis(double majorAxis){
		this.majorAxis = majorAxis;
	}
	
	public void setMinorAxis(double minorAxis){
		this.minorAxis = minorAxis;
	}
	

	public double calcArea(){
		return (Math.PI * this.majorAxis * this.minorAxis);
	} 
	public double calcPerimeter(){
		return 2*Math.PI*Math.sqrt((Math.pow(this.majorAxis,2)+Math.pow(this.minorAxis,2))/2);
	}
	public String toString(){
		return ("Eclipse "+super.getColor()+" "+calcArea()+" "+calcPerimeter());
	} 
}
