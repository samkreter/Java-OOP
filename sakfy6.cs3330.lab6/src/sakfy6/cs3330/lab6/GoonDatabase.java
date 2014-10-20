package sakfy6.cs3330.lab6;

import java.util.TreeMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class GoonDatabase {
	
	private TreeMap goonDB;
	
	public GoonDatabase(String filePath){
		importFile(filePath);
	}
	
	public void searchMenu(){
		Scanner inputScanner = new Scanner(System.in);
		String input;
		do{
			System.out.println("Please enter your query (q to exit): ");
			input = inputScanner.nextLine();
		}while(!input.equals("q"));
		
		inputScanner.close();
	}
	
	protected void importFile(String filePath){

		String[] splitList = new String[5];
		goonDB = new TreeMap();
		File file = new File(filePath);
		 try {
			 Scanner sc = new Scanner(file);
			 while(sc.hasNextLine()){
				 splitList = sc.nextLine().split(","); 
				 switch(splitList[0]){
				 case: "Don":
					 goonDB.put(splitList[1],new Don(splitList[1],splitList[2],splitList[3],Integer.parseInt(splitList[4])));
				 	break;
				 case "Talent":
					 goonDB.put(splitList[1], new Talent(splitList[1],splitList[2],splitList[3]));
					 break;
				 case "Overseer":
					 goonDB.put(splitList[1],new Overseer(splitList[1],splitList[2],splitList[3]));
				 }
				 
			 }
			 sc.close();
		 } 
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		
	}
	
	protected TreeMap searchDatabase(String x){
		
	}
}
