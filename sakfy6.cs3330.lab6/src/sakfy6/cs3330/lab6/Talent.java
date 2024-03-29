/*
 * Sam Kreter
 * 10/20/2014
 * LAB C
 * Royals
 */
package sakfy6.cs3330.lab6;

public class Talent extends Goon{
	private String skill;
	
	/**
	 * constructor for the talent 
	 * 
	 * @param name
	 * @param DOB
	 * @param skill
	 */
	public Talent(String name, String DOB, String skill){
		super(name, DOB);
		setSkill(skill);
	}
	
	/**
	 * getter for the skill
	 * 
	 * @return
	 */
	public String getSkill(){
		return this.skill;
	}
	
	/**
	 * setter for the skill
	 * 
	 * @param skill
	 */
	protected void setSkill(String skill){
		this.skill = skill;
	}
}
