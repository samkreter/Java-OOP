package sakfy6.cs3330.hw3;

public class Weapon extends Item{

	
	private int damagePoints;
	
	public Weapon(String name, String level, int weight, int damagePoints){
		super(name,weight,level);
		setDamagePoints(damagePoints);
	}
	
	private void setDamagePoints(int damagePoints){
		this.damagePoints = damagePoints;
	}
	
	public int getPoints(){
		return this.damagePoints;
	}
}
