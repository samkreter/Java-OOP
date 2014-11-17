/*
 * Sam Kreter
 * sakfy6
 * labc
 * hw3
 * 11/9/12
 * */
package sakfy6.cs3330.hw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;



/**
 * @author sakfy6
 *
 */
public class GameDataReader {

	

	/*
	 * empty GameDataReader constructor 
	 */
	public GameDataReader() {}

	/**
	 * @param filePath
	 * @return the array of items that represent the game items 
	 */
	public ArrayList<Item> getGameItems(String filePath){
		
		String[] splitList = new String[3];
		ArrayList<Item> items = new ArrayList<Item>();
		File file = new File(filePath);
		 try {
			 Scanner sc = new Scanner(file);
			 while(sc.hasNextLine()){
				 splitList = sc.nextLine().split("[,\\s]+");
				 if(splitList.length != 5){
					 System.out.println("error in lenght for getGameItems");
				 }
				 if(splitList[0].equals("Weapon")){
					 items.add(new Weapon(splitList[2],splitList[1],Integer.parseInt(splitList[3]),Integer.parseInt(splitList[4])));
				 }
				 else{
					 items.add(new Healer(splitList[2],splitList[1],Integer.parseInt(splitList[3]),Integer.parseInt(splitList[4])));
				 }
			 }
			 sc.close();
		 } 
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 
		 return items;
	}
	
	/**
	 * returns the game commands form the file 
	 * @param filePath
	 * @return
	 */
	public ArrayList<String> getGameCommands(String filePath){
		ArrayList<String> list = new ArrayList<String>();
		File file = new File(filePath);
		try{
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()){
				list.add(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		return list;
	} 
	
	/**
	 * returns the beasts in the game 
	 * @param filePath
	 * @return
	 */
	public ArrayList<Beast> getGameBeasts(String filePath){
		ArrayList<Beast> list = new ArrayList<Beast>();
		String[] splitList;
		Item tempItem;
		Bag tempBag;
		File file = new File(filePath);
		 try {
			 Scanner sc = new Scanner(file);
			 while(sc.hasNextLine()){
				 splitList = sc.nextLine().split("[,\\s]+");
				 if(splitList.length == 7){
					 tempBag = new Bag();
					 tempItem = new Weapon(splitList[4],splitList[3],Integer.parseInt(splitList[5]),Integer.parseInt(splitList[6]));
					 tempBag.addItem(tempItem);
					 list.add(new Beast(splitList[0],splitList[1],Integer.parseInt(splitList[2]),tempBag));
				 }
			 }
			 sc.close();
		 } 
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 
		 return list;
		
		
	}
}