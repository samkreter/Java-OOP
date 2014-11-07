/**
 * Sam Kreter
 * Sakfy6
 * LAB C
 * 10/16/14
 * hw2
 */

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
				 splitList = sc.nextLine().split(","); 
				 items.add(new Item(splitList[0],Integer.parseInt(splitList[1]),Integer.parseInt(splitList[2])));
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
		String[] splitList = new String[2];
		File file = new File(filePath);
		 try {
			 Scanner sc = new Scanner(file);
			 while(sc.hasNextLine()){
				 splitList = sc.nextLine().split(","); 
				 list.add(new Beast(splitList[0],Integer.parseInt(splitList[1])));
			 }
			 sc.close();
		 } 
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 
		 return list;
		
		
	}
}
