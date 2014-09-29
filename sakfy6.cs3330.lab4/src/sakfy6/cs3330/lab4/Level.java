package sakfy6.cs3330.lab4;

import java.util.ArrayList;

public class Level {

	
	private ArrayList<Car> carsStored;
	private int numberOfParkingSpots;
	
	
	public Level(int numberOfParkingSpots){
		setParkingSpots(numberOfParkingSpots);
	}
	
	private void setParkingSpots(int numberOfParkingSpots){
		this.carsStored = new ArrayList<Car>();
		this.numberOfParkingSpots = numberOfParkingSpots;
	}
	
	public boolean isFull(){
		if(carsStored.size() == this.numberOfParkingSpots){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public void addCar(Car incomingCar){
		carsStored.add(incomingCar);
	}
	
	
	
	
}
