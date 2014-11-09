/**
 * Sam Kreter
 * Sakfy6
 * LAB C
 * 10/16/14
 * hw2
 */


package sakfy6.cs3330.hw3;


public class Beast extends GameCreature {

	private String type;
	
	/**
	 * constructor
	 * @param name
	 * @param hp
	 */
	public Beast(String type, String name, int hp, Bag emptyBag){
		super(name,hp,emptyBag);
	} 
	
	private void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
	

	public boolean attack(GameCreature creature, Item weapon){
		if(weapon instanceof Weapon){
			creature.injured(((Weapon)weapon).getPoints());
			return true;
		}
		return false; 
	}
	
	public boolean heal(Item healer){
		if(healer instanceof Healer){
			health.heal(healer.getPoints());
			return true;
		}
		return false;
		
	}
	
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
	    
	    public void dropAll(){
	    	super.bag.dropItems();
	    }
}
