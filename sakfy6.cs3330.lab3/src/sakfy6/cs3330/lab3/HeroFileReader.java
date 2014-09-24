/**

name: Sam Kreter
date: 9/22/2014
section: C
submission Code: poopsies

attempting bonus
 * 
 */
package sakfy6.cs3330.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;



/**
 * @author sakfy6
 *
 */
public class HeroFileReader {

	
	private String filePath;
	

	/**
	 * Constructor 
	 * 
	 * @param filePath
	 */
	public HeroFileReader(String filePath) {
		setFilePath(filePath);
	}
	
	/**
	 * sets the filepath varible 
	 * 
	 * @param filePath is the file path for the heroes.csv
	 */
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}
	
	/**
	 * @return the filepath 
	 */
	public String getFilePath(){
		return this.filePath;
	}
	
	
	/**
	 * @return and arraylist of all the heroes from the file 
	 */
	public ArrayList<Hero> getHeroes(){
		String[] splitList = new String[3];
		ArrayList<Hero> heroes = new ArrayList<Hero>(25);
		File file = new File(this.getFilePath());
		//error checking for reading the file  
		try {
			 Scanner sc = new Scanner(file);
			 for(int i = 0; i < 10; i++){
				 if(sc.hasNextLine()){
					 splitList = sc.nextLine().split(",");
					 if(splitList.length == 3){
						 heroes.add(new Hero(splitList[0],splitList[1],Integer.parseInt(splitList[2])));
					 }
				 }
			 }
			 sc.close();
		 } 
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 
		 return heroes;
	}

}
