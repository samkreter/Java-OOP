/**
 * 
 */
package sakfy6.cs3330.hw1;



import java.util.Scanner;
import java.util.Random;

/**
 * @author sakfy6
 *
 */
public class Scanvenger {

	/**
	 * 
	 */
	private static Scanner userInput;
	private static Item[] playerItems;
	private static Item[] gameItems;
	private static Command[] gameCommands;
	private static int currentPlayerItemsIdx;
	
	/**
	 * 
	 */
	public Scanvenger() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initGameDataAndArrays();
		System.out.print("Enter a name: ");
		String name = userInput.nextLine();
		
		System.out.println("Welcome to the Scavenger Game "  + name );
		System.out.println("");
		
		while( currentPlayerItemsIdx < playerItems.length) {
			Item foundItem = scavengeArea();
			System.out.println("Item found: " + foundItem.getName());
			String[] splitStrings = null;
			do {
				System.out.print("Command: ");
				String input = userInput.nextLine();
				splitStrings = input.split(" ");
				while (!validCommand(splitStrings)) {
					System.out.print("Invalid Try Again, Command: ");
					input = userInput.nextLine();
					splitStrings = input.split(" ");
				}	
			}while (!runCommand(splitStrings[0],foundItem));
		}
		
		displayPlayerItems();
		PlayerItemsStats();

	}
	
	/**
	 * inits all game data for the start of the game 
	 * 
	 * 
	 */
	public static void initGameDataAndArrays(){
		userInput = new Scanner(System.in);
		playerItems = new Item[10];
		int i = 0;
		
		for (i=0; i<playerItems.length; i++){
			playerItems[i] = new Item("",0,0);
		}
		
		GameDataReader gamedatareader = new GameDataReader();
		gameItems = gamedatareader.getGameItems();
		currentPlayerItemsIdx = 0;
		gameCommands = new Command[5];
		gameCommands[0] = new Command("help");
		gameCommands[1] = new Command("pickup");
		gameCommands[2] = new Command("drop");
		gameCommands[3] = new Command("view");
		gameCommands[4] = new Command("quit");
	}
	
	/**
	 * @return the item that was found in the game
	 */
	private static Item scavengeArea(){
		Random randgen = new Random();
		int loopNum = randgen.nextInt(4) + 1;
		int itemindex = randgen.nextInt(gameItems.length);
		int i=0;
		
		for(i=0; i<loopNum; i++){
			System.out.println("Scavenging area for an Item...");
		}
		
		
		return gameItems[itemindex];
		
	}
	
	/**
	 * 
	 * runs the approproite action for each command 
	 * 
	 * @param commandName
	 * @param item
	 * @return boolean depeanding on continueign through the loop 
	 */
	public static boolean runCommand(String commandName, Item item){
		
		switch(commandName){
		
		case "pickup": 
			if(addItemToPlayerItems(item)){
				System.out.println("Item successfully added");
				return true;
			}
			else{
				System.out.println("Item not added successfully");
				return false;
			} 
		case "drop":
			System.out.println("Item not added");
			return true;
		case "help":
			displayGameCommands();
			return false;
		case "view":
			displayPlayerItems();
			return false;
		case "quit":
			System.out.println("Game Terminated");
			System.exit(0);
			return false;
		default:return false; 
		
		
		}
	}
	
	/**
	 * displays all the player's items to the user 
	 */
	public static void displayPlayerItems(){
		if(currentPlayerItemsIdx != 0){
			for(Item i : playerItems){
				if(!i.getName().equals("")){
					System.out.println(i.getName() + " " + i.getValue());
				}
			}
		}
		else{
			System.out.println("Bag is empty");
		}
	}
	
	/**
	 * 
	 * displays all the game commands 
	 * 
	 */
	public static void displayGameCommands(){
		for(Command i : gameCommands){
			System.out.println(i.getCommandName());
		}
	}
	
	/**
	 * 
	 * checks if a command is valid 
	 * 
	 * @param splitStrings has the current command from the user
	 * @return
	 */
	public static boolean validCommand(String[] splitStrings){
		for(Command i : gameCommands){
			if(splitStrings[0].equals(i.getCommandName())){
				return true;
			}
		}
		return false;

	}
	
	/**
	 * adds an item to the player items array 
	 * 
	 * @param item
	 * @return if array is full 
	 */
	public static boolean addItemToPlayerItems(Item item){
		if(currentPlayerItemsIdx >= playerItems.length ){
			return false;
		}
		else{
			playerItems[currentPlayerItemsIdx] = item;
			currentPlayerItemsIdx++;
			return true;
		}
	}
	
	/**
	 * 
	 * Displays all player stats to the user 
	 * 
	 */
	public static void PlayerItemsStats(){
		int value = 0;
		int weight = 0;
		int maxW = 0;
		int minW = playerItems[0].getWeight();
		int temp = 0;
		
		for(Item i : playerItems){
			value = value + i.getValue();
			temp = i.getWeight();
			weight = weight + temp;
			if(temp > maxW){
				maxW = temp;
			}
			if(temp < minW){
				minW = temp;
			}
		}
		
		System.out.println("Player Item Stats: Total Weight is "+weight+" Total Value is "+value+" Min Weight found is "+minW+" Max Weight found "+maxW);
	}
	
	
	
	

}
