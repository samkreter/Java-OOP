package sakfy6.cs3330.lab6;

import java.util.TreeMap;
import java.util.Scanner;

public class GoonDatabase {
	public GoonDatabase(String fileName){
		importFile(fileName);
	}
	
	public void searchMenu(){
		Scanner inputScanner = new Scanner(System.in);
		String input;
		do{
			System.out.println("Please enter your query (q to exit): ");
			input = inputScanner.nextLine();
		}while(!input.equals("q"));
	}
	
	protected void importFile(String fileName){
		
	}
	
	protected TreeMap searchDatabase(String x){
		
	}
}
