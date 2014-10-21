/*
 * Sam Kreter
 * 10/20/2014
 * LAB C
 * Royals
 */
package sakfy6.cs3330.lab6;

public class Goon {

	private String name;
	private String DOB;
	
	/**
	 * constructor for the Goon class	
	 * @param name
	 * @param DOB
	 */
	public Goon(String name, String DOB){
		setName(name);
		setDOB(DOB);
	}
	
	/**
	 * getter for the name 
	 * @return
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * setter for the name 
	 * 
	 * @param name
	 */
	protected void setName(String name){
		this.name = name;
	}
	
	/**
	 * getter for the DOB 
	 * 
	 * @return
	 */
	public String getDOB(){
		return this.DOB;
	}
	
	/**
	 * setter for the DOB 
	 * 
	 * @param DOB
	 */
	protected void setDOB(String DOB){
		this.DOB = DOB;
	}
}
