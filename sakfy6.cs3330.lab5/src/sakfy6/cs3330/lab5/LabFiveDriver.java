/*
 * Sam Kreter
 * sakfy6
 * 10/6/2014
 * English is hard
 * 
 * */

package sakfy6.cs3330.lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class LabFiveDriver {

	private static ArrayList<Shape> shapes;
	private static Scanner userInput;
	
	
	
	/**
	 * @param args
	 */
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
	
	/**
	 * initiallizes the arraylist
	 * 
	 * @param numberOfShapes
	 */
	public static void initShapes(int numberOfShapes){
		shapes = new ArrayList<Shape>();
		String[] parseInput;
		int counter = 0;
		
		while(counter < numberOfShapes){
			System.out.println("Enter a Shape:");
			parseInput = userInput.nextLine().split(" ");
			switch(parseInput[0]){
			case "ellipse":
				if(parseInput.length == 4){
					if(Double.parseDouble(parseInput[1]) > 0 && Double.parseDouble(parseInput[2]) > 0){
						shapes.add(new Ellipse(Double.parseDouble(parseInput[1]),Double.parseDouble(parseInput[2]),parseInput[3]));
						counter++;
					}
					else{
						System.out.println("Invalid Shape! Try again");
					}
				}
				else{
					System.out.println("Invalid Shape! Try again");
				}
				break;
			case "circle":
				if(parseInput.length == 3){
					if(Double.parseDouble(parseInput[1]) > 0){
						shapes.add(new Circle(Double.parseDouble(parseInput[1]),parseInput[2]));
						counter++;
					}
					else{
						System.out.println("Invalid Shape! Try again");
					}
				}
				else{
					System.out.println("Invalid Shape! Try again");
				}
				break;
			case "rectangle":
				if(parseInput.length == 4){
					if(Double.parseDouble(parseInput[1]) > 0 && Double.parseDouble(parseInput[2]) > 0){
						shapes.add(new Rectangle(Double.parseDouble(parseInput[1]),Double.parseDouble(parseInput[2]),parseInput[3]));
						counter++;
					}
					else{
						System.out.println("Invalid Shape! Try again");
					}
				}
				else{
					System.out.println("Invalid Shape! Try again");
				}
				break;
			case "square":
				if(parseInput.length == 3){
					if(Double.parseDouble(parseInput[1]) > 0){
						shapes.add(new Square(Double.parseDouble(parseInput[1]),parseInput[2]));
						counter++;
					}
					else{
						System.out.println("Invalid Shape! Try again");
					}
				}
				else{
					System.out.println("Invalid Shape! Try again");
				}
				break;
			default:
				System.out.println("Invalid Shape! Try again");
			}
			
			

		}
	}
	/**
	 * 
	 * displays the shapes 
	 * 
	 */
	public static void displayShapes(){
		for(Shape i : shapes){
			System.out.println(i);
		}
		
	} 
	/**
	 * removes a shape with the matching color 
	 * 
	 * @param shapeColor
	 */
	public static void removeShape(String shapeColor){
		for(Shape i : shapes){
			if(i.getColor().equals(shapeColor)){
				System.out.println("removed shape");
				shapes.remove(i);
				break;
			}
		}
	}



}
