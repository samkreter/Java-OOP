package sakfy6.cs3330.lab5;


public class Shape {
	
	private String color;
	
	public Shape(String color){
		setColor(color);
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
}
