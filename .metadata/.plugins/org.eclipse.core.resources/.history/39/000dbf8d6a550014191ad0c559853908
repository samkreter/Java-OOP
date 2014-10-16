package sakfy6.cs3330.hw2;

public class Beast {

	private String name;
	private Health health;
	
	public Beast(String name, int hp){
		setName(name);
		createHealth(hp);
	} 
	
	public void setName(String name){
		this.name = name;
	}
	
	public void createHealth(int hp){
		health = new Health(hp);
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getHealth(){
		return health.getHealthPoints();
	}
	
	public boolean injured(Item item){
		if(item != null){
			health.hit(item.getValue());
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isLiving(){
		return health.getAlive();
	}
}
