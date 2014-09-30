/*
 * Sam Kreter 
 * sakfy6
 * Lab C 
 * quincy 
 * */

package sakfy6.cs3330.lab4;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 * @author sakfy6
 *
 */
public class LabFourDriver {

	/**
	 * @param args
	 */
	
	private static Scanner userInput;
	private static Random randomGenerator;
	private static ArrayList<String> carMakes;
	private static ArrayList<String> carTypes;
	/**
	 * 
	 */
	private static ArrayList<String> carColors;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		initAttributes();
		
		System.out.print("Enter number of parking structure levels: ");
		String input = userInput.nextLine();
		System.out.println(" ");
		
		ParkingStructure parkingStructure = new ParkingStructure(Integer.parseInt(input));
		
		while (!parkingStructure.isFull()) {
			Car incomingCar = createCar();
			System.out.println(incomingCar.getMake()
					+ " " + incomingCar.getType() + " " + incomingCar.getColor());
			int storageLevel = parkingStructure.addCar(incomingCar);
			System.out.println("Car Stored at level " + storageLevel);
			System.out.println(" ");
		}
	}
	
	/**
	 * inits all the necessary attributes for the lab 
	 */
	private static void initAttributes(){
		randomGenerator = new Random(1337);
		userInput = new Scanner(System.in);
		
		carMakes = new ArrayList<String>();
		carMakes.add("Ford");
		carMakes.add("Toyota");
		carMakes.add("Dodge");
		carMakes.add("Honda");
		
		carTypes = new ArrayList<String>();
		carTypes.add("Sedan");
		carTypes.add("Truck");
		carTypes.add("Van");
		carTypes.add("Hatcback");
		
		carColors = new ArrayList<String>();
		carColors.add("Blue");
		carColors.add("Green"); 
		carColors.add("Red");
		carColors.add("Purple");
		carColors.add("Orange");
		carColors.add("Yellow");
		
		
		
	}
	
	/**
	 * @return a randomly generated car 
	 */
	private static Car createCar(){
		String make = carMakes.get(randomGenerator.nextInt(carMakes.size()));
		String type = carTypes.get(randomGenerator.nextInt(carTypes.size()));
		String color = carColors.get(randomGenerator.nextInt(carColors.size()));
		
		return new Car(make,type,color);
	}
	
	
	

}
