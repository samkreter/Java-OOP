/*
 * Sam kreter
 * sakfy6
 * 11/4/14
 * labC
 * I dont care
 * */

package sakfy6.cs3330.lab8;

@SuppressWarnings("serial")

public class InvalidNameException extends Exception{
	
	/**
	 * base constructor for the excpetion
	 */
	public InvalidNameException(){}
	
	/**
	 * 
	 * construtor to put a message on the exception
	 * @param msg
	 */
	public InvalidNameException(String msg){
		super(msg);
	}
}
