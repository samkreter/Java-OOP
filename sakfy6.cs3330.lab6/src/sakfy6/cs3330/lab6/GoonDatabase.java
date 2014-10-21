/*
 * Sam Kreter
 * 10/20/2014
 * LAB C
 * Royals
 */
package sakfy6.cs3330.lab6;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class GoonDatabase {
	
	private TreeMap<String,Goon> goonDB;
	
	/**
	 * constructor for the goonDatabase
	 * 
	 * @param filePath
	 */
	public GoonDatabase(String filePath){
		importFile(filePath);
	}
	
	/**
	 * gives a menu to the users and implements the searching 
	 */
	public void searchMenu(){
		Scanner inputScanner = new Scanner(System.in);
		String input;
		TreeMap<String,Goon> temp;
		int count = 0;

		
		System.out.println("Please enter your query (q to exit): ");
		input = inputScanner.nextLine();
		
		while(!input.equals("q")){
			count = 1;
			temp = searchDatabase(input);
			if(temp.size() != 0){
				System.out.println("Results:");
				for(Map.Entry<String,Goon> i : temp.entrySet()){
					System.out.println(count+" - "+i.getValue().getName());
					count++;
				}
			}
			else{
				System.out.println("No results found ...");
			}
			System.out.println("Please enter your query (q to exit): ");
			input = inputScanner.nextLine();
		}
		System.out.println("Program Complete.");
		
		inputScanner.close();
	}
	
	/**
	 * loads the goonDB from a file past in 
	 * 
	 * @param filePath
	 */
	protected void importFile(String filePath){

		String[] splitList = new String[5];
		goonDB = new TreeMap<String,Goon>();
		File file = new File(filePath);
		 try {
			 Scanner sc = new Scanner(file);
			 while(sc.hasNextLine()){
				 splitList = sc.nextLine().split(","); 
				 switch(splitList[0]){
				 case "Don":
					 goonDB.put(splitList[0]+","+splitList[1],new Don(splitList[1],splitList[2],splitList[3],Integer.parseInt(splitList[4])));
				 	break;
				 case "Talent":
					 goonDB.put(splitList[0]+","+splitList[1],new Talent(splitList[1],splitList[2],splitList[3]));
					 break;
				 case "Overseer":
					 goonDB.put(splitList[0]+","+splitList[1],new Overseer(splitList[1],splitList[2],splitList[3]));
				 }
				 
			 }
			 sc.close();
		 } 
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		
	}
	
	/**
	 * searches the database for the pasted in query 
	 * 
	 * @param query
	 * @return
	 */
	protected TreeMap<String,Goon> searchDatabase(String query){
		TreeMap<String,Goon> temp = new TreeMap<String,Goon>();
		
		for(Map.Entry<String,Goon> i : goonDB.entrySet()){
			if(i.getKey().toLowerCase().contains(query.toLowerCase())){
				temp.put(i.getKey(),i.getValue());
			}
		}
		return temp;
		
	}
}
