package sakfy6.cs3330.lab7;

public class Snake extends Animal implements NonFlying{

	
	Snake(String type){
		super(false,false,type);
	}
	public boolean eat(Animal food){
		return false;
	}
	public void movement(){
		System.out.println("The snake slithers on the ground");
	}
}
