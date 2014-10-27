/*
 * Sam Kreter
 * sakfy6
 * 11/27/14
 * labc
 * derf
 * 
 * */

package sakfy6.cs3330.lab7;

import java.util.ArrayList;

public class LabSevenDriver {

	
	
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Hawk("Hawk"));
		animals.add(new Bat("Bat"));
		animals.add(new Snake("Snake"));
		animals.add(new Monkey("Monkey"));
		
		findWhoCanEatWho(animals);
		findWhoCanFly(animals);
		findWhoCantFly(animals);

	}
	
	/**
	 * prints out all animals that can fly 
	 * 
	 * @param animals
	 */
	private static void findWhoCanFly(ArrayList<Animal> animals){
		System.out.println("Animals that can fly");
		for(Animal i : animals){
			if(i instanceof Flying){
				System.out.println(i);
				if(i instanceof Bat){
					((Bat)i).takeoff();
					((Bat)i).land();
				}
				else{
					((Hawk)i).takeoff();
					((Hawk)i).land();
				}
				
			}
		}
		System.out.println("");
	} 
	/**
	 * prints out all animals that can't fly 
	 * 
	 * @param animals
	 */
	private static void findWhoCantFly(ArrayList<Animal> animals){
		System.out.println("Animals that can't fly");
		for(Animal i : animals){
			if(i instanceof NonFlying){
				System.out.println(i);
				if(i instanceof Snake){
					((Snake)i).movement();
				}
				else{
					((Monkey)i).movement();
				}
			}
		}
		System.out.println("");
	}
	/**
	 * prints out all animals and what they can eat 
	 * 
	 * @param animals
	 */
	private static void findWhoCanEatWho(ArrayList<Animal> animals){
		System.out.println("Editable Animals");
		for(Animal i : animals){
			for(Animal j : animals){
				if(i.eat(j)){
					System.out.println(i+" and ate a "+j.getType());
				}
			}
		}
		System.out.println("");
	
	}
}


