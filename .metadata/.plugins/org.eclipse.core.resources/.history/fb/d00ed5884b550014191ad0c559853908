package sakfy6.cs3330.hw2;

import java.util.ArrayList;

public class CommandProcessor {
	
	private ArrayList<String> commands;
	
	
	public CommandProcessor(){
		setGameCommands();
	}
	
	public void setGameCommands(){
		GameDataReader gameReader = new GameDataReader();
		commands = gameReader.getGameCommands("GameData/Commands.txt");
	}
	
	public ArrayList<String> getCommands(){
		return this.commands;
	}
	
	public boolean validateUserCommand(String command){
		if(commands.contains(command)){
			return true;
		}
		else{
			return false;
		}
	}

}
