/**
 * Sam Kreter
 * Sakfy6
 * LAB C
 * 10/16/14
 * hw2
 */

package sakfy6.cs3330.hw2;

import java.util.ArrayList;
import java.lang.StringBuffer;

public class Human {
	
	private String name;
	private Bag bag;
	private Health health;
	private CommandProcessor commandProcessor;

	/**
	 * constructor for the human setup 
	 * @param name
	 * @param hp
	 * @param emptyBag
	 */
	Human(String name, int hp, Bag emptyBag){
		setName(name);
		createHealth(hp);
		initBag(emptyBag);
		initCommandProcessor();
	} 
	
	/**
	 * setter
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	

	/**
	 * creates the health object 
	 * @param hp
	 */
	public void createHealth(int hp){
		this.health = new Health(hp);
	}
	
	/**
	 * initilizes the bag
	 * @param emptyBag
	 */
	public void initBag(Bag emptyBag){
		this.bag = emptyBag;
		bag.addItem( new Item("Crowbar",30,5));
	}
	
	/**
	 * sets up the command processor 
	 */
	public void initCommandProcessor(){
		this.commandProcessor = new CommandProcessor();
	}
	
	/**
	 * getter
	 * @return
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * getter
	 * @return
	 */
	public Health getHealth(){
		return this.health;
	}
	
	/**
	 * getter
	 * @return
	 */
	public Bag getBag(){
		return this.bag;
	}
	
	/**
	 * getter for the alive member
	 * @return
	 */
	public boolean isLiving(){
		return health.getAlive();
	}
		 
    /**
     * picks up an item 
     * @param item
     * @return
     */
    public boolean pickup(Item item){
    	if(this.bag.addItem(item)){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    
    /**
     * drops an item 
     * @param item
     * @return
     */
    public boolean drop(Item item){
    	return bag.dropItem(item);
    }
    
    /**
     * attacks the beasts past in 
     * @param beast
     * @param item
     * @return
     */
    public boolean attack(Beast beast, Item item){
    	return beast.injured(item);
    }
    
    /**
     * chekcs the commands 
     * @param commands
     * @param beast
     * @param item
     * @return
     */
    public HumanResponse processCommand(String commands, Beast beast, Item item){
    	String response = "";
    	boolean validAction = true;
    	String[] splitCommands = commands.split(" ");
    	
    	System.out.println(commands);
    	
    	switch(splitCommands[0]){
    	
    	case "attack":
    		if(splitCommands.length >= 4 && splitCommands[2].equals("with")){
    			if(splitCommands[1].equals(beast.getName()) && beast.isLiving()){
    				if(!this.attack(beast,bag.getItem(splitCommands[3]))){
    					response = "Not a valid weapon";
    					validAction = false;
    				}
    			}
    		}
    		break;
    	case "pickup":
    		if(this.pickup(item)){
    			response = "Item added successfully";
    		}
    		else{
    			response = "Item not added successfully";
    			validAction = false;
    		}
    		break;
    	case "drop":
    		if(splitCommands.length >= 2){
    			if(this.drop(bag.getItem(splitCommands[1]))){
    				response = "Item successfully dropped";
    			}
    			else{
    				response = "Item not successfully dropped";
    				validAction = false;
    			}
    		}
    		else{
    			response = "Item not successfully added";
    			validAction = false;
    		}
    	
    		break;
    	case "help":
    		StringBuffer buffer = new StringBuffer();
    		ArrayList<String> list = new ArrayList<String>();
    		list = commandProcessor.getCommands();
    		for(String i : list){
    			buffer.append(i+"\n");
    		}
    		response = buffer.toString();
    		break;
    	default:
    		response = "Invalid game command";
    		validAction = false;
    	}
    	
    	return new HumanResponse(response,validAction);
    	
    	
    } 
}

