package sakfy6.cs3330.lab7;

@SuppressWarnings("serial")

public class InvalidBalanceException extends Exception{

	public InvalidBalanceException(){}
	
	public InvalidBalanceException(String msg){
		super(msg);
	}
}
