package sakfy6.cs3330.hw2;


public class Health {

	private int healthPoints;
	private boolean alive;
	
	Health(){
		setHealth(100);
		setAlive(true);
	}
	
	Health(int hp){
		setHealth(hp);
		setAlive(true);
		
	}
	
	void setHealth(int hp){
		this.healthPoints = hp;
	}
	
	void setAlive(boolean alive){
		this.alive = alive;
	}
	
	int getHealthPoints(){
		return this.healthPoints;
	}
	
	boolean getAlive(){
		return this.alive;
	}
	
	void hit(int hitPoints){
		setHealth(this.healthPoints - hitPoints);
	}
}
