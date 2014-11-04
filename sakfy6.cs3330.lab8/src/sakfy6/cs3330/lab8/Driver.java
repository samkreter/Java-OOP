/*
 * Sam kreter
 * sakfy6
 * 11/4/14
 * labC
 * I dont care
 * */

package sakfy6.cs3330.lab8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Driver implements IsValidData{
	
	
	//main function for the program 
	public static void main(String args[]){
		ArrayList<Person> people = new ArrayList<Person>();
		String input = "";
		Scanner sc = new Scanner(System.in);
		String age, name, balance;
		
		while(!input.equals("q")){
			
			try{
				System.out.println("Enter person info or q to quit.");
				System.out.println("Please enter the name of this person:");
				name = sc.nextLine();
				if(name.equals("q")){
					input = "q";
					break;
				}
				isName(name);
				System.out.println("Please enter an age for this person:");
				age = sc.nextLine();
				isValidAge(age);
				System.out.println("Please enter a bank account balance for this person:");
				balance = sc.nextLine();
				isBalance(balance);
				people.add(new Person(Integer.parseInt(age),name,Double.parseDouble(balance)));
			
			}
			catch(InvalidNameException e){
				System.out.println(e);
			}
			catch(InvalidAgeException e){
				System.out.println(e);
			}
			catch(InvalidBalanceException e){
				System.out.println(e);
			}
			
			System.out.println("");
			
		}
		
		for(Person i : people){
			System.out.println(i);
		}
		
		sc.close();
	}
	
	/**
	 * tests and throws exceptions for the age
	 * 
	 * @param input
	 * @throws InvalidAgeException
	 */
	public static void isValidAge(String input) throws InvalidAgeException{
		
		int number = 0;
		
		if(input.equals("")){
			throw new InvalidAgeException("You did not enter an age.");
		}
		
		try{
				 number = Integer.parseInt(input);
				 if(number < 0 ){
					 throw new InvalidAgeException("Age can not be negitive");
				 }
				 else if(number >= 150){
					 throw new InvalidAgeException("Age can not be equal to or more than 150.");
				 }
			 }
			 catch (NumberFormatException e){
				 throw new InvalidAgeException("You did not enter an Integer.");
			 }
	}
	
	/**
	 * tests and throws exceptions for the balance
	 * 
	 * @param balance
	 * @throws InvalidBalanceException
	 */
	public static void isBalance(String balance) throws InvalidBalanceException{
		
		if(balance.equals("")){
			throw new InvalidBalanceException("You did not enter a balance");
		}
		
		try{
			double number = Double.parseDouble(balance);
		}
		catch(NumberFormatException e){
			throw new InvalidBalanceException("You did not enter a double.");
		}
		
	}
	
	/**
	 * tests and throws exceptions for the name
	 * 
	 * @param name
	 * @throws InvalidNameException
	 */
	public static void isName(String name) throws InvalidNameException{
		char[] chars = name.toCharArray();

		if(name.equals("")){
			throw new InvalidNameException("You did not enter a name.");
		}
		
	    for (char c : chars) {
	        if(!Character.isLetter(c)) {
	            throw new InvalidNameException("You did not enter a name.");
	        }
	    }
	}

	
}