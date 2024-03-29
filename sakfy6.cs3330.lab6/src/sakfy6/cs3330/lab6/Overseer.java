/*
 * Sam Kreter
 * 10/20/2014
 * LAB C
 * Royals
 */

package sakfy6.cs3330.lab6;

public class Overseer extends Goon{
	private String sector;
	
	/**
	 * constructor for the overseers class
	 * 
	 * @param name
	 * @param DOB
	 * @param sector
	 */
	public Overseer(String name, String DOB, String sector){
		super(name,DOB);
		setSector(sector);
	}
	
	/**
	 * getter for the sector 
	 * 
	 * @return
	 */
	public String getSector(){
		return this.sector;
	}
	
	/**
	 * setter for the sector 
	 * 
	 * @param sector
	 */
	protected void setSector(String sector){
		this.sector = sector;
	}
}
