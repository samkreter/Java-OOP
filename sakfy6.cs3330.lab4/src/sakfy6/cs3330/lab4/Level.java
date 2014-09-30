/*
 * Sam Kreter 
 * sakfy6
 * Lab C 
 * quincy 
 * */


package sakfy6.cs3330.lab4;

import java.util.ArrayList;

public class Level {

	
	private ArrayList<Car> carsStored;
	private int numberOfParkingSpots;
	
	
	/**
	 * calls setters 
	 * 
	 * @param numberOfParkingSpots num of spots left 
	 */
	public Level(int numberOfParkingSpots){
		setParkingSpots(numberOfParkingSpots);
	}
	
	/**
	 * sets number of sops and carstores 
	 * 
	 * @param numberOfParkingSpots
	 */
	private void setParkingSpots(int numberOfParkingSpots){
		this.carsStored = new ArrayList<Car>();
		this.numberOfParkingSpots = numberOfParkingSpots;
	}
	
	/**
	 * @return if the car is full or not 
	 */
	public boolean isFull(){
		if(carsStored.size() == this.numberOfParkingSpots){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	/**
	 * @param incomingCar places a new car in the store 
	 */
	public void addCar(Car incomingCar){
		carsStored.add(incomingCar);
	}
	
	
	
	
}
