/*
 * Sam Kreter
 * sakfy6
 * labc
 * hw3
 * 11/9/12
 * */
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
		setType(type);
	} 
	
	/**
	 * setter
	 * @param type
	 */
	private void setType(String type){
		this.type = type;
	}
	
	/**
	 * getter
	 * 
	 * @return
	 */
	public String getType(){
		return this.type;
	}
	


	/**
	 * 
	 * attacks the creature
	 * 
	 * @param creature
	 * @param weapon
	 * */
	public boolean attack(GameCreature creature, Item weapon){
		if(weapon instanceof Weapon){
			creature.injured(((Weapon)weapon).getPoints());
			return true;
		}
		return false; 
	}
	
	/**
	 * 
	 * heals the creature
	 * @param healer
	 * */
	public boolean heal(Item healer){
		if(healer instanceof Healer){
			health.heal(healer.getPoints());
			return true;
		}
		return false;
		
	}
	
	/**
	 * allows for picking up items
	 * @return
	 * */
	
	public boolean pickup(Item item){
	    	if(this.bag.addItem(item)){
	    		return true;
	    	}
	    	else{
	    		return false;
	    	}
	    }
	    
	    /**
	     * 
	     * drops an item 
	     * @param item
	     * @return
	     */
	    public boolean drop(Item item){
	    	return bag.dropItem(item);
	    }
	    
	    /**
	     * drops all items from bat 
	     * 
	     * 
	     * */
	    public void dropAll(){
	    	super.bag.dropItems();
	    }
}
