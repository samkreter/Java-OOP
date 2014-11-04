/*
 * Sam kreter
 * sakfy6
 * 11/4/14
 * labC
 * I dont care
 * */

package sakfy6.cs3330.lab8;

@SuppressWarnings("serial")

public class InvalidBalanceException extends Exception{

	/**
	 * base constructor for the exception 
	 */
	public InvalidBalanceException(){}
	
	/**
	 * construtor to put a message on the exception
	 * 
	 * @param msg
	 */
	public InvalidBalanceException(String msg){
		super(msg);
	}
}
