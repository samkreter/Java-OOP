package sakfy6.cs3330.lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class LabFiveDriver {

	private ArrayList<Shape> shapes;
	private Scanner userInput;
	
	
	
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		System.out.print("Enter number of shapes to create: ");
		int size = Integer.parseInt(userInput.nextLine());
		initShapes(size);
		displayShapes();
		System.out.print("Enter a shape color to remove:");
		String shapeColor = userInput.nextLine();
		removeShape(shapeColor);
		displayShapes();
		userInput.close();

	}
	
	public void initShapes(int numberOfShapes){
		
	}
	public void displayShapes(){
		
	} 
	public void removeShape(String shapeColor){
		
	}



}
