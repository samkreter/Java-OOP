/*
 * Sam Kreter
 * sakfy6
 * labc
 * hw3
 * 11/9/12
 * */

package sakfy6.cs3330.hw3;

import java.util.ArrayList;

public class Bag {

	private ArrayList<Item> items;
	private int weight;
	
	/**
	 * Constructor
	 */
	Bag(){
		initBag();
	}
	
	/**
	 * initilize the bag
	 */
	void initBag(){
		this.weight = 0;
		this.items = new ArrayList<Item>();
	}
	
	/**
	 * getter
	 * 
	 * @param name
	 * @return
	 */
	Item getItem(String name){
		for(Item i : items){
			if(name.toLowerCase().equals(i.getName().toLowerCase())){
				return i;
			}
			
		}
		return null;
		
	}
	
	/**
	 * getter for all items 
	 * 
	 * @return
	 */
	ArrayList<Item> getItems(){
		return items;
	}
	
	/**
	 * getter
	 * 
	 * @return
	 */
	int getSize() {
		return items.size();
	}
	
	/**
	 * adds item 
	 * 
	 * @param item
	 * @return
	 */
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
	
	/**
	 * drops an item 
	 * 
	 * @param item
	 * @return
	 */
	boolean dropItem(Item item){
		if(items.remove(item)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	/**
	 * drops all items in the bag
	 */
	public void dropItems(){
		items.clear();
		this.weight = 0;
	}
	
	/**
	 * gets an item by the index
	 * @param itemIdx
	 * @return
	 */
	public Item getItem(int itemIdx){
		return this.items.get(itemIdx);
	}
	
}