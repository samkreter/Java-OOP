package sakfy6.cs3330.hw2;

public class Human {
	
	private String name;
	private Bag bag;
	private Health health;
	private CommandProcessor commandProcessor;

	Human(name : String, hp : int, emptyBag : Bag) 
	
	void setName(name: String)
	

	void createHealth(hp : int)
	
	void initBag(emptyBag : Bag)
	
	void initCommandProcessor()
	
	String getName()
	
	Health getHealth()
	
	Bag getBag()
	
	boolean isLiving()
		 
    boolean pickup(item : Item)
    
    boolean drop(item : Item)
    
    boolean attack(beast : Beast, item : Item)
    
    HumanResponse processCommand(commands : String, beast : Beast, item : Item) 
}

