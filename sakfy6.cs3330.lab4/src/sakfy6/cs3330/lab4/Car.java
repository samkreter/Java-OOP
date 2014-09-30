
/*
 * Sam Kreter 
 * sakfy6
 * Lab C 
 * quincy 
 * */

package sakfy6.cs3330.lab4;





public class Car {

	private String make;
	private String type;
	private String color;
	
	/**
	 * @param make make of the car 
	 * @param type type of the car 
	 * @param color color of the car 
	 */
	public Car(String make, String type, String color){
		setMake(make);
		setType(type);
		setColor(color);
	}
	
	/**
	 * sets the make 
	 * 
	 * @param make make of the car 
	 * 
	 * 
	 */
	private void setMake(String make){
		this.make = make;
	}
	
	/**
	 * 
	 * sets the type type of the car 
	 * @param type
	 */
	private void setType(String type){
		this.type = type;
	}
	
	/**
	 * 
	 * sets the color 
	 * @param color color of the car 
	 */
	private void setColor(String color){
		this.color = color;
	}
	
	/**
	 * @return make of the car 
	 */
	public String getMake(){
		return this.make;
	}
	
	/**
	 * @return type of the car 
	 */
	public String getType(){
		return this.type;
	}
	
	/**
	 * @return color fo the car 
	 */
	public String getColor(){
		return this.color;
	}
	
	
	
}
