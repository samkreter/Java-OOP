/**

name: Sam Kreter
date: 9/22/2014
section: C
submission Code: poopsies 

attempting bonus
 */

package sakfy6.cs3330.lab3;

import java.util.Random;
import java.util.ArrayList;
/**
 * @author sakfy6
 *
 */

public class LabThreeDriver {

	
	private static int heroHits;
	private static int villainHits;

	/**
	 * 
	 * main function to set the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HeroFileReader heroFileReader = new HeroFileReader("DataFiles/Heroes.csv");
		ArrayList<Hero> heroes = heroFileReader.getHeroes();
		LabThreeDriver.displayHeroes(heroes);
		Hero villain = LabThreeDriver.createVillain();
		System.out.println("Villain: " + villain.getName());
		System.out.println("");
		LabThreeDriver.battle(heroes,villain,10);
		LabThreeDriver.displayFightResults();
		LabThreeDriver.heroTraining(heroes);
		LabThreeDriver.heroHits = 0;
		LabThreeDriver.villainHits = 0;
		battle(heroes,villain,10);
		LabThreeDriver.displayFightResults();
	}
	
	
	
	
	/**
	 * displays all the heroes 
	 * 
	 * @param heroes arraylist of all the heroes 
	 */
	public static void displayHeroes(ArrayList<Hero> heroes){
		for(Hero i : heroes){
			System.out.println("Hero: " + i.getName());
		}
		System.out.println("");
	}
	
	/**
	 * creates the villian 
	 * 
	 * @return a hero object that stores the villian 
	 */
	public static Hero createVillain(){
		Hero villian = new Hero("Loki","staff",20);
		return villian;
	}
	
	/**
	 * 
	 * raises the heroes attack power 
	 * 
	 * @param heroes arrayllist of all the heroes 
	 */
	public static void heroTraining(ArrayList<Hero> heroes){
		for(Hero i : heroes){
			i.updateAttackPoints((i.getAttackPoints()*2));
		}
	}
	
	/**
	 * starts the battle between the hero and the villian 
	 * 
	 * @param heroes arraylist of all the heros 
	 * @param villain is the hero object that stores the villian 
	 * @param battleRounds number of rounds for this particuler battle 
	 */
	public static void battle(ArrayList<Hero> heroes, Hero villain, int battleRounds){
		
		Random randgen = new Random();
		int randHero = 0;
		int herosAttack = 0;
		
		for(int i=0; i< battleRounds; i++){
			randHero = randgen.nextInt(heroes.size());
			herosAttack = randgen.nextInt(heroes.get(randHero).getAttackPoints()+1);
			if(herosAttack > villain.getAttackPoints()){
				heroHits++;
				System.out.println(heroes.get(randHero).getName()+" got a successful hit with his "+heroes.get(randHero).getWeapon());
			}
			else{
				villainHits++;
				System.out.println(villain.getName() + " got a successful hit with his " + villain.getWeapon());
			}
		}
		System.out.println("");
	}
	
	/**
	 * displays the fighting results
	 * 
	 */
	public static void displayFightResults(){
		System.out.println("Battle Stats");
		System.out.println("Hero Hits on Villian "+ heroHits);
		System.out.println("Villian Hits on Hero "+ villainHits);
		System.out.println("");
	}
	

}
