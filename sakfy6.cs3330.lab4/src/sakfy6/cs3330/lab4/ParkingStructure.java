/*
 * Sam Kreter 
 * sakfy6
 * Lab C 
 * quincy 
 * */


package sakfy6.cs3330.lab4;

import java.util.ArrayList;


public class ParkingStructure {

	private ArrayList<Level> levels;
	
	
	/**
	 * @param numberOfLevels
	 */
	public ParkingStructure(int numberOfLevels){
		setLevels(numberOfLevels);
	}
	
	/**
	 * sets the number o levels, if less than zero places two levels
	 * 
	 * @param numberOfLevels 
	 */
	private void setLevels(int numberOfLevels){
		levels = new ArrayList<Level>();
		if(numberOfLevels > 0){
			for(int i = 0;i<numberOfLevels;i++){
				levels.add(new Level(10));
			}
			
		}
		else{
			levels.add(new Level(10));
			levels.add(new Level(10));
		}  
	}
	
	/**
	 * @return returns if the parkingStructure is full
	 */
	public boolean isFull(){
		for(Level i : levels){
			if(!i.isFull()){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * adds a car to the parking structure
	 * 
	 * @param incomingCar 
	 * @return
	 */
	public int addCar(Car incomingCar){
		int levelNumber = 0;
		for(Level i : levels){
			levelNumber++;
			if(!i.isFull()){
				i.addCar(incomingCar);
				return levelNumber;
			}
		}
		return 0;
	}
	
	
}
