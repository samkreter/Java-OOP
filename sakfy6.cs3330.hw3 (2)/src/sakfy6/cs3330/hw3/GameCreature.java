/*
 * Sam Kreter
 * sakfy6
 * labc
 * hw3
 * 11/9/12
 * */

package sakfy6.cs3330.hw3;

import java.util.ArrayList;


public abstract class GameCreature implements Creature{

	protected String name;
	protected Health health;
	protected Bag bag;
	private CommandProcessor commandProcessor;
	
	/**
	 * constructor
	 * 
	 * @param name
	 * @param hp
	 * @param emptyBag
	 */
	public GameCreature(String name, int hp, Bag emptyBag){
		createHealth(hp);
		setName(name);
		initBag(emptyBag);
	}
	
	
	/**
	 * setter
	 * @param name
	 */
	private void setName(String name){
		this.name = name;
	}
	
	/**
	 * 
	 * getter
	 * @return
	 */
	public String getName(){
		return this.name;
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
	}
	
	/**
	 * sets up the command processor 
	 */
	public void initCommandProcessor(){
		this.commandProcessor = new CommandProcessor();
	}
	
    /**
     * processes the command passed in 
     * 
     * @param commands
     * @param creature
     * @param item
     * 
     * */
    public CreatureResponse processCommand(String commands, GameCreature creature, Item item){
    	String response = "";
    	boolean validAction = true;
    	String[] splitCommands = commands.split(" ");
    	
    	switch(splitCommands[0]){
    	
    	case "runaway":
    		this.dropAll();
    		validAction = true;
    		response = "fled and dropped all items";
    		break;
    	case "heal":
    		if(splitCommands.length < 3){
    			validAction = false;
    			response = "Not in valid format";
    		}
    		if(creature.heal(bag.getItem(splitCommands[2]))){
    			response = "Item successfully used for healing";
    			validAction = true;
    			creature.drop(bag.getItem(splitCommands[2]));
    		}
    		else{
    			validAction = false;
    			response = "Item not successuflly used for healing";
    		}
    		break;
    	case "attack":
    		if(splitCommands.length >= 4 && splitCommands[2].equals("with")){
    			if(splitCommands[1].equals(creature.getName()) && creature.isLiving()){
    				if(!this.attack(creature,bag.getItem(splitCommands[3]))){
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
    		if(splitCommands.length == 2){
    			if(this.drop(bag.getItem(splitCommands[1]))){
    				response = "Item successfully dropped";
    			}
    			else{
    				response = "Item not successfully dropped";
    				validAction = false;
    			}
    		}
    		else if(splitCommands.length == 3){
    			  try { 
    				  int index = Integer.parseInt(splitCommands[2]);
    				  index--;
					  if(bag.getItem(index).getName().toLowerCase().equals(splitCommands[1].toLowerCase())){
						  this.drop(bag.getItem(index));
						  validAction = true;
						  response = "Item successfully dropped";
					  }
					  else{
						  validAction = false;
						  response = "Item not successfully dropped";
					  }
    			    } catch(NumberFormatException e) { 
    			        response = "Item not successfully dropped";
    			    	validAction = false; 
    			    }
    		}
    		else{
    			response = "Item not successfully dropped";
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
    	
    	return new CreatureResponse(response,validAction);
    	
    	
    } 
	
	/**
	 * getter
	 * @return
	 */
	public Bag getBag(){
		return this.bag;
	}
	
	/**
	 * injuries with the attack
	 * @param hp
	 * */
	public void injured(int hp){
		health.hit(hp);
	}
	
	/**
	 * 
	 * gets current health points 
	 * 
	 * */
	public int currentHealthPoints(){
		return this.health.getHealthPoints();
	}
	

	

	/**
	 * getter for the alive member
	 * @return
	 */
	public boolean isLiving(){
		return health.getAlive();
	}
	
	
}
