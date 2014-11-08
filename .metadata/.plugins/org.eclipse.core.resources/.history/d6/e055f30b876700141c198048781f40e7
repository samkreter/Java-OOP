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
	
	private void setType(type){
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
	
	/**
	 * setter for helth
	 * 
	 * @param hp
	 */
	public void createHealth(int hp){
		health = new Health(hp);
	}
	

	
	/**
	 * getter
	 * 
	 * @return
	 */
	public int getHealth(){
		return health.getHealthPoints();
	}
	
	/**
	 * injures the object in quetion
	 * 
	 * @param item
	 * @return
	 */
	public boolean injured(Item item){
		if(item != null){
			health.hit(item.getValue());
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * returns living status
	 * 
	 * @return
	 */
	public boolean isLiving(){
		return health.getAlive();
	}
}
