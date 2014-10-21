package sakfy6.cs3330.lab6;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class GoonDatabase {
	
	private ArrayList<Goon> goonDB;
	
	public GoonDatabase(String filePath){
		importFile(filePath);
	}
	
	public void searchMenu(){
		Scanner inputScanner = new Scanner(System.in);
		String input;
		ArrayList<Goon> temp;
		int count = 0;

		
		System.out.println("Please enter your query (q to exit): ");
		input = inputScanner.nextLine();
		
		while(!input.equals("q")){
			count = 1;
			temp = searchDatabase(input);
			if(temp.size() != 0){
				System.out.println("Results:");
				for(Goon i : temp){
					System.out.println(count+" - "+i.getName());
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
	
	protected void importFile(String filePath){

		String[] splitList = new String[5];
		goonDB = new ArrayList<Goon>();
		File file = new File(filePath);
		 try {
			 Scanner sc = new Scanner(file);
			 while(sc.hasNextLine()){
				 splitList = sc.nextLine().split(","); 
				 switch(splitList[0]){
				 case "Don":
					 goonDB.add(new Don(splitList[1],splitList[2],splitList[3],Integer.parseInt(splitList[4])));
				 	break;
				 case "Talent":
					 goonDB.add(new Talent(splitList[1],splitList[2],splitList[3]));
					 break;
				 case "Overseer":
					 goonDB.add(new Overseer(splitList[1],splitList[2],splitList[3]));
				 }
				 
			 }
			 sc.close();
		 } 
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		
	}
	
	protected ArrayList<Goon> searchDatabase(String query){
		ArrayList<Goon> temp = new ArrayList<Goon>();
		
		for(Goon i : goonDB){
			if(i.getName().toLowerCase().equals(query.toLowerCase())){
				temp.add(new Goon(i.getName(),i.getDOB()));
				return temp;
			}
			if(i instanceof Don && query.toLowerCase().equals("don")){
				temp.add(i);
			}
			if(i instanceof Overseer && query.toLowerCase().equals("overseer")){
				temp.add(i);
			}
			if(i instanceof Talent && query.toLowerCase().equals("talent")){
				temp.add(i);
			}
		}
		return temp;
		
	}
}
