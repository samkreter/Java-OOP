/*
 * Sam kreter
 * sakfy6
 * 11/4/14
 * labC
 * I dont care
 * */

package sakfy6.cs3330.lab8;

import java.text.DecimalFormat;

public class Person {

	
	private String name;
	private int age;
	private double bankAccountbalance;
	
	
	
	//class constructor 
	public Person(int age, String name, double BAB){
		setName(name);
		setAge(age);
		setBAB(BAB);
	}
	
	/**
	 * name setter
	 * 
	 * @param name
	 */
	private void setName(String name){
		this.name = name;
	}
	
	/**
	 * age setter
	 * 
	 * @param age
	 */
	private void setAge(int age){
		this.age = age;
	}
	
	/**
	 * bab setter
	 * 
	 * @param BAB
	 */
	private void setBAB(double BAB){
		this.bankAccountbalance = BAB;
	}
	
	/**
	 * name getter
	 * 
	 * @return
	 */
	protected String getName(){
		return this.name;
	}
	
	/**
	 * age getter
	 * 
	 * @return
	 */
	protected int getAge(){
		return this.age;
	}
	
	/**
	 * 
	 * bab getter
	 * @return
	 */
	protected double getBAB(){
		return this.bankAccountbalance;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		
		DecimalFormat df = new DecimalFormat("#.00");
		return "Name "+this.name+"\nBank Balance: $"+df.format(this.bankAccountbalance)+"\nAge: "+this.age+"\n";
		
	}
	
	
	
	
	
}
