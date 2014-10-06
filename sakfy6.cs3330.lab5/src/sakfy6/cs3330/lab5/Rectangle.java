package sakfy6.cs3330.lab5;

public class Rectangle extends Shape {

	private double width;
	private double height;
	
	
	Rectangle(double width, double height, String color){
		super(color);
		setWidth(width);
		setHeight(height);
	} 
	
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public double getHeight(){
		return this.height;
	}
	public double calcArea() {
		return (this.height * this.width);
	}
	public double calcPerimeter(){
		return (2*this.height + 2*this.width);
	} 
	public String toString(){
		return ("Rectangle "+super.getColor()+" "+calcArea()+" "+calcPerimeter());
	}
}
