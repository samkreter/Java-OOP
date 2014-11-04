/*
 * Sam kreter
 * sakfy6
 * 11/4/14
 * labC
 * I dont care
 * */

package sakfy6.cs3330.lab8;

@SuppressWarnings("serial")

public class InvalidAgeException extends Exception{

	/**
	 * base contructor for the program 
	 */
	public InvalidAgeException(){}	
	
	/**
	 * construtor to put a message on the exception
	 * 
	 * @param msg
	 */
	public InvalidAgeException(String msg){
		super(msg);
	}
}
