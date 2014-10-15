package sakfy6.cs3330.hw2;

public class Human {
	
	private String name;
	private Bag bag;
	private Health health;
	private CommandProcessor commandProcessor;

	Human(String name, int hp, Bag emptyBag){
		
	} 
	
	public void setName(String name){
		this.name = name;
	}
	

	public void createHealth(int hp){
		this.health = new Health(hp);
	}
	
	public void initBag(Bag emptyBag){
		this.bag = emptyBag;
		bag.addItem( new Item("Crowbar",30,5));
	}
	
	public void initCommandProcessor(){
		this.commandProcessor = new CommandProcessor();
	}
	
	public String getName(){
		return this.name;
	}
	
	public Health getHealth(){
		return this.health;
	}
	
	public Bag getBag(){
		return this.bag;
	}
	
	public boolean isLiving(){
		return health.getAlive();
	}
		 
    public boolean pickup(Item item){
    	this.bag.addItem(item);
    }
    
    public boolean drop(Item item){
    	return bag.dropItem(item);
    }
    
    public boolean attack(Beast beast, Item item){
    	return beast.injured(item);
    }
    
    public HumanResponse processCommand(String commands, Beast beast, Item item){
    	String response = "";
    	boolean validAction = true;
    	String[] splitCommands = commands.split(",");
    	
    	if(!commandProcessor.validateUserCommand(splitCommands[0])){
    		return new HumanResponse("Invalid game command", false);
    	}
    	
    } 
}

