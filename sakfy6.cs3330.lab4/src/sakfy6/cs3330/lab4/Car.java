package sakfy6.cs3330.lab4;





public class Car {

	private String make;
	private String type;
	private String color;
	
	public Car(String make, String type, String color){
		setMake(make);
		setType(type);
		setColor(color);
	}
	
	private void setMake(String make){
		this.make = make;
	}
	
	private void setType(String type){
		this.type = type;
	}
	
	private void setColor(String color){
		this.color = color;
	}
	
	public String getMake(){
		return this.make;
	}
	
	public String getType(){
		return this.type;
	}
	
	public String getColor(){
		return this.color;
	}
	
	
	
}
