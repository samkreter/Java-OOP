/**
 * 
 */
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
	
	private Scanner userInput;
	private Random randomGenerator;
	private ArrayList<String> carMakes;
	private ArrayList<String> carTypes;
	private ArrayList<String> carColor;
	
	public static void main(String[] args) {
		initAttributes();
		
		System.out.print("Enter number of parking structure levels: ");
		String input = userInput.nextLine();
		System.out.println(" ");
		
		ParkingStructure parkingStructure = new ParkingStructure(Integer.parseInt(input));
		
		while (!parkingStructure.isFull()) {
			Car incomingCar = createCar();
			System.out.println(incomingCar.getMake()
					+ " " + incomingCar.getModel() + " " + incomingCar.getColor());
			int storageLevel = parkingStructure.addCar(incomingCar);
			System.out.println("Car Stored at level " + storageLevel);
			System.out.println(" ");
		}
	}
	
	private void initAttributes(){
		
	}
	
	private Car createCar(){
		
	}
	
	
	

}
