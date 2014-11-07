/**
 * Sam Kreter
 * Sakfy6
 * LAB C
 * 10/16/14
 * hw2
 */

package sakfy6.cs3330.hw2;

import java.util.ArrayList;

public class CommandProcessor {
	
	private ArrayList<String> commands;
	
	
	/**
	 * constructor 
	 */
	public CommandProcessor(){
		setGameCommands();
	}
	
	/**
	 * initlizes the commands 
	 */
	public void setGameCommands(){
		GameDataReader gameReader = new GameDataReader();
		commands = gameReader.getGameCommands("GameData/Commands.txt");
	}
	
	/**
	 * getter
	 * @return
	 */
	public ArrayList<String> getCommands(){
		return this.commands;
	}
	
	/**
	 * validates the users commands 
	 * @param command
	 * @return
	 */
	public boolean validateUserCommand(String command){
		if(commands.contains(command)){
			return true;
		}
		else{
			return false;
		}
	}

}
