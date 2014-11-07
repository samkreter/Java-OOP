/**
 * Sam Kreter
 * Sakfy6
 * LAB C
 * 10/16/14
 * hw2
 */


package sakfy6.cs3330.hw3;


public class Beast {

	private String name;
	private Health health;
	
	/**
	 * constructor
	 * @param name
	 * @param hp
	 */
	public Beast(String name, int hp){
		setName(name);
		createHealth(hp);
	} 
	
	/**
	 * setter
	 * 
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
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
	public String getName(){
		return this.name;
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
