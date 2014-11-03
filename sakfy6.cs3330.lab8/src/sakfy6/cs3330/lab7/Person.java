package sakfy6.cs3330.lab7;

public class Person {

	
	private String name;
	private int age;
	private double bankAccountbalance;
	
	
	public Person(int age, String name, double BAB){
		setName(name);
		setAge(age);
		setBAB(BAB);
	}
	
	private void setName(String name){
		this.name = name;
	}
	
	private void setAge(int age){
		this.age = age;
	}
	
	private void setBAB(double BAB){
		this.bankAccountbalance = BAB;
	}
	
	protected String getName(){
		return this.name;
	}
	
	protected int getAge(){
		return this.age;
	}
	
	protected double getBAB(){
		return this.bankAccountbalance;
	}
	
	public String toString(){
		
	}
	
	
	
	
	
}
