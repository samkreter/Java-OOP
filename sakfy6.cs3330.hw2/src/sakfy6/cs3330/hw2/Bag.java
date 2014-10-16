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
			if(name.toLowerCase().equals(i.getName().toLowerCase())){
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
		if((item.getWeight()+this.weight) <= 20){
			this.items.add(item);
			this.weight = weight + item.getWeight();
			return true;
		}
		else{
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
