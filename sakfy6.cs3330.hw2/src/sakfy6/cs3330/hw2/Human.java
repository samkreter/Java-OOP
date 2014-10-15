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
	

	public void createHealth(hp : int)
	
	public void initBag(emptyBag : Bag)
	
	public void initCommandProcessor()
	
	public String getName()
	
	public Health getHealth()
	
	public Bag getBag()
	
	public boolean isLiving()
		 
    public boolean pickup(item : Item)
    
    public boolean drop(item : Item)
    
    public boolean attack(beast : Beast, item : Item)
    
    public HumanResponse processCommand(commands : String, beast : Beast, item : Item) 
}

