/**
 * Sam Kreter
 * Sakfy6
 * LAB C
 * 10/16/14
 * hw2
 */

package sakfy6.cs3330.hw3;


public class Human extends GameCreature{
	
	
	
	
	
	/**
	 * constructor for the human setup 
	 * @param name
	 * @param hp
	 * @param emptyBag
	 */
	Human(String name, int hp, Bag emptyBag){
		super(name,hp,emptyBag);
		bag.addItem(new Weapon("Crowbar","Standard", -30, 5));
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
    
    public boolean attack(GameCreature creature, Item item){
    	
    	if(item instanceof Weapon){
    		creature.injured(((Weapon)item).getPoints()*2);
    		return true;
    	}
    	return false; 
    }
    
    
    public void dropAll(){
    	super.bag.dropItems();
    }
    
    public boolean heal(Item item){
    	if(item == null){
    		return false;
    	}
    	if(item instanceof Healer){
    		health.heal(item.getPoints());
    		return true;
    	}
    	return false;
    }
}

