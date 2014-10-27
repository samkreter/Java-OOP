package sakfy6.cs3330.lab7;

public class LabSevenDriver {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Hawk());
		animals.add(new Bat());
		animals.add(new Snake());
		animals.add(new Monkey());
		
		findWhoCanEatWho(animals);
		findWhoCanFly(animals);
		findWhoCantFly(animals);

	}
	
	findWhoCanFly(animals : ArrayList) 
	findWhoCantFly(animals : ArrayList)
	findWhoCanEatWho(animals : ArrayList)
}
