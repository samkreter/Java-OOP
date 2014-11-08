package sakfy6.cs3330.hw3;

import java.util.ArrayList;


public abstract class GameCreature implements Creature{

	protected String name;
	protected Health health;
	protected Bag bag;
	private CommandProcessor commandProcessor;
	
	public GameCreature(String name, int hp, Bag emptyBag){
		createHealth(hp);
		setName(name);
		initBag(emptyBag);
	}
	
	
	private void setName(String name){
		this.name = name;
	}
	
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
	
    public CreatureResponse processCommand(String commands, GameCreature creature, Item item){
    	String response = "";
    	boolean validAction = true;
    	String[] splitCommands = commands.split(" ");
    	
    	System.out.println(commands);
    	
    	switch(splitCommands[0]){
    	
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
    	
    	return new CreatureResponse(response,validAction);
    	
    	
    } 
	
	public Bag getBag(){
		return this.bag;
	}
	
	public void injured(int hp){
		health.hit(hp);
	}
	
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
