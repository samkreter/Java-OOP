package sakfy6.cs3330.hw2;


public class Health {

	private int healthPoints;
	private boolean alive;
	
	public Health(){
		setHealth(100);
		setAlive(true);
	}
	
	public Health(int hp){
		setHealth(hp);
		setAlive(true);
		
	}
	
	public void setHealth(int hp){
		this.healthPoints = hp;
	}
	
	public void setAlive(boolean alive){
		this.alive = alive;
	}
	
	public int getHealthPoints(){
		return this.healthPoints;
	}
	
	public boolean getAlive(){
		return this.alive;
	}
	
	public void hit(int hitPoints){
		setHealth(this.healthPoints - hitPoints);
	}
}
