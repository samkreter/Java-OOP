/**
name: Sam Kreter
date: 9/22/2014
section: C
Homework 1
*/



package sakfy6.cs3330.hw1;

/**
 * @author sakfy6
 *
 */
public class Command {

	private String commandName;
	
	
	/**
	 * 
	 */
	public Command(String commandName) {
		setCommandName(commandName);
	}
	
	
	/**
	 * set the command name
	 * 
	 * @param commandName what the command name should be set to 
	 */
	private void setCommandName(String commandName){
		this.commandName = commandName;
	}
	
	/**
	 * @return the name of the command 
	 */
	public String getCommandName(){
		return this.commandName;
	}

}
