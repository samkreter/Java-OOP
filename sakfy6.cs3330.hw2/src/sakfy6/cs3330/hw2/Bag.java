package sakfy6.cs3330.hw2;

import java.util.ArrayList;

public class Bag {

	private ArrayList<Item> items;
	private int weight;
	
	Bag(){
		initBag();
	}
	
	void initBag(){
		this.weight = 0;
		this.items = new ArrayList<Item>();
	}
	
	Item getItem(String name){
		for(Item i : items){
			if(name.equals(i.getName())){
				return i;
			}
			
		}
		return null;
		
	}
	
	ArrayList<Item> getItems(){
		return items;
	}
	
	int getSize() {
		return items.size();
	}
	
	boolean addItem(Item item){
		System.out.println(this.weight);
		if((item.getWeight()+this.weight) < 20){
			this.items.add(item);
			this.weight = weight + item.getWeight();
			System.out.println("inside the right");
			return true;
		}
		else{
			System.out.println("in the wrong");
			return false;
		}
		
	}
	
	boolean dropItem(Item item){
		if(items.remove(item)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
}
