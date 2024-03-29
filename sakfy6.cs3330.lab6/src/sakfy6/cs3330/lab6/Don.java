/*
 * Sam Kreter
 * 10/20/2014
 * LAB C
 * Royals
 */
package sakfy6.cs3330.lab6;

public class Don extends Goon{
	private String mobName;
	private int netWorth;
	
	/**
	 * constructor for the don class
	 * 
	 * @param name
	 * @param DOB
	 * @param mobName
	 * @param netWorth
	 */
	public Don(String name, String DOB, String mobName, int netWorth){
		super(name,DOB);
		setNetWorth(netWorth);
		setMobName(mobName);
	}
	
	/**
	 * getter for networth
	 * 
	 * @return
	 */
	public int getNetWorth(){
		return this.netWorth;
	}
	
	/**
	 * setter 
	 * 
	 * @param netWorth
	 */
	protected void setNetWorth(int netWorth){
		this.netWorth = netWorth;
	}
	
	/**
	 * getter for mobname 
	 * 
	 * @return
	 */
	public String getMobName(){
		return this.mobName;
	}
	
	/**
	 * setter 
	 * 
	 * @param mobName
	 */
	protected void setMobName(String mobName){
		this.mobName = mobName;
	}
}
