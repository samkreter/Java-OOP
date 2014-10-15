/**
name: Sam Kreter
date: 9/22/2014
section: C
Homework 1
*/

package sakfy6.cs3330.hw2;

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