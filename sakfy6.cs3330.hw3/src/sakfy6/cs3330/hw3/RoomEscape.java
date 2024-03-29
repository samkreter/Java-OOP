/*
 * Sam Kreter
 * sakfy6
 * labc
 * hw3
 * 11/9/12
 * */

package sakfy6.cs3330.hw3;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;



public class RoomEscape {

	private static Scanner userInput;
	private static Random randomGenerator;
	private static ArrayList<Item> gameItems;
	private static ArrayList<Beast> gameBeasts;
	private static ArrayList<Beast> currentRoomBeasts;
	private static Human currentPlayer;
	
	public static void main(String[] args) {
		 initGameData();
         System.out.print("Enter Character Name: ");
         String name = userInput.nextLine();
         System.out.print("Enter number of levels: ");
         int maxRooms = Integer.parseInt(userInput.nextLine());
         int battleResult = 0;
         int runawayCount = 0;
         
         currentPlayer = new Human(name,100, new Bag());
         int roomsBeat = 0;
         
         while (roomsBeat < maxRooms) {
                 /*
                  * Create room bad guys and items
                  */
                 System.out.println("Entering Room " + (roomsBeat + 1));
                 System.out.println(" ");
                 initCurrentRoomBeasts();
                 int creaturesDestroyed = 0;
                 
                 while (currentPlayer.isLiving() && creaturesDestroyed < 2) {
                         int encounterProb = randomGenerator.nextInt(100);
                         Item foundItem = null;
                         Beast foundEnemy = null;
                         /*
                          * 60 percent chance of being a Beast.
                          */
                         if (encounterProb <= 40) {
                                 foundItem = findItem();
                                 System.out.println("You have discovered the item " + foundItem.getLevel()+" "+foundItem.getName());
                                 while (noBattle(foundItem)); 
                                 
                         }
                         else {
                                 foundEnemy = findEnemy();
                                 System.out.println("You have encountered a(n) " + foundEnemy.getType()+" "+foundEnemy.getName());
                                 battleResult = battle(foundEnemy);
                                 if (battleResult == 1){
                                         creaturesDestroyed++;
                                 }
                                 else if(battleResult == 0){
                                         System.out.println("You are dead!");
                                         return;
                                 }
                                 else if(battleResult == 2){
                                	 if(runawayCount > 5){
                                		 System.out.println("You are dead!");
                                		 currentPlayer.injured(1000);
                                		 return;
                                	 }
                                	 runawayCount++;
                                	 
                                 }
                         }
                 }
                 roomsBeat++;
         }
         System.out.println("You have beat RoomEscape!");
	}
 
	 /**
	  * Allows the current player to engage in combat with the incoming beast. The player uses 
	  * items from his bag to kill the enemy. 
	  * 
	  * @param battlingBeast The found beast the player has encountered
	  * @return Whether the currentPlayer is dead being false or alive being true.
	  */
	 private static int battle (Beast battlingBeast) {
	         
	         while (currentPlayer.isLiving()) {
	                 System.out.println("Player Health: "+currentPlayer.currentHealthPoints());
	        	 	 displayBagContents();
	                 String attackString = "attack " + battlingBeast.getName() + " with ";
	                 System.out.print(attackString);
	                 String input = userInput.nextLine();
	                 System.out.println(" ");
	                 CreatureResponse response;
	                 
	                 if(input.equals("runaway")){
	                	 response = currentPlayer.processCommand(input,battlingBeast,null);
	                	 if (!response.getValidAction()) {
	                         System.out.println(response.getResponse());
	                	 }else{
	                		 System.out.println(response.getResponse());
	                		 return 2;
	                	 }
	                 }
	                 attackString += input;
	                 response = currentPlayer.processCommand(attackString, battlingBeast,null);
	                 if (!response.getValidAction()) {
	                         System.out.println(response.getResponse());
	                 }
	                 else if (currentPlayer.isLiving() && !battlingBeast.isLiving()) {
	                         System.out.println(battlingBeast.getName() + " is killed");
	                         System.out.println(" ");
	                         return 2;
	                 }
	                 else {
	                	 	 System.out.println(battlingBeast.getType()+" "+battlingBeast.getName()+" attacked you with "
	                	 	  +battlingBeast.getBag().getItem(0).getLevel()+" "+ battlingBeast.getBag().getItem(0).getName() );
	                	 	 battlingBeast.attack(currentPlayer,battlingBeast.getBag().getItem(0));
	                         System.out.println(battlingBeast.getName() + " HP: " + battlingBeast.currentHealthPoints());
	                 }
	         
	         }
	         return 0;
	 }
	
	
	 /**
	  * Displays the contents of the bag to player
	  *
	  */
	 private static void displayBagContents () {
	         System.out.println("Contents of Bag:");
	         System.out.println("#    Type      Name                Points  Weight");
	         Bag playerBag = currentPlayer.getBag();
	         int count = 0;
	         String type;
	         for (Item i : playerBag.getItems()) {
	        	 count++;
	        	 if(i instanceof Healer){
	        		type = "Healer";
	        	 }
	        	 else{
	        		type = "Weapon";
	        	 }
	        	 System.out.printf("%-5d%-10s%-20s%-8d%-10d\n",count,type,i.getLevel()+" "+ i.getName(),i.getWeight(),i.getPoints());
	         }
	         System.out.println(" ");
	 }
	 
	 /**
	  * Allows the player to run the following game commands "pickup" on the found item, “view” the player bag contents,
	  * "drop" an item from their bag, show the game commands using "help", current item, and the enter key allow you to skip past an item (the string is empty).
	  *  
	  * 
	  * @param foundItem An instantiated Item that the player has found
	  */
	 
	 private static boolean noBattle (Item foundItem) {
	         System.out.println("");
		 	 System.out.println("Player Health: "+currentPlayer.currentHealthPoints());
		 	 displayBagContents();
	         System.out.print("Command: ");
	         String input = userInput.nextLine();
	         if (input.isEmpty()) {
	                 return false;
	         }
	         CreatureResponse response = currentPlayer.processCommand(input, currentPlayer,foundItem);
	         while (!response.getValidAction()) {
	                 System.out.print(response.getResponse() + ", Try Again: ");
	                 input = userInput.nextLine();
	                 response = currentPlayer.processCommand(input, currentPlayer,foundItem);                
	                 if (input.isEmpty()) {
	                         return false;
	                 }
	         }        
	         System.out.println(response.getResponse());
	         return true;
	 
	 }
	 
	 /**
	 * inits all the game data 
	 */
	private static void initGameData(){
		 userInput = new Scanner(System.in);
		 randomGenerator = new Random(1337);
		 GameDataReader datareader = new GameDataReader();
		 gameItems = datareader.getGameItems("GameData/GameItems.csv");
		 gameBeasts = datareader.getGameBeasts("GameData/GameCreatures.csv");
	 }
	 
	 /**
	 * sets up the Current room beasts 
	 */
	private static void initCurrentRoomBeasts (){
		 currentRoomBeasts = new ArrayList<Beast>(); 
		 for(Beast i : gameBeasts){
			 Bag bag = new Bag();
			 currentRoomBeasts.add(new Beast(i.getType(),i.getName(),i.currentHealthPoints(),bag));
		 }
	 }
	 
	 /**
	  * finds an item to pick up 
	 * @return
	 */
	private static Item findItem(){
			int itemindex = randomGenerator.nextInt(gameItems.size());
		 	int loopNum = randomGenerator.nextInt(4) + 1;
			int i=0;
			for(i=0; i<loopNum; i++){
				System.out.println("Searching Area...");
			}
			
			
			return gameItems.get(itemindex);
	 } 
	
	 /**
	  * finds an enemy to attack 
	 * @return
	 */
	private static Beast findEnemy(){
		int itemindex = randomGenerator.nextInt(gameBeasts.size());
		int loopNum = randomGenerator.nextInt(4) + 1;
		int i=0;
		for(i=0; i<loopNum; i++){
			System.out.println("Scavenging area for an Item...");
		}
		
		
		return gameBeasts.get(itemindex);
		 
	 }
	 
	

}


