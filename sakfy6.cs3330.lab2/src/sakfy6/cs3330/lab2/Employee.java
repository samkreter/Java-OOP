/**
 * 
 */
package sakfy6.cs3330.lab2;

/**
 * @author sakfy6
 *
 */
public class Employee {
	
	private String name;
	private int age;
	private double salary;
	/**
	 * constructor that sets all the attributes
	 * 
	 * @param name
	 *            is the name of the employee
	 * @param age 
	 * 			  is the age of the employee
	 * @param salary 
	 * 			  is the salary of the employee
	 *            
	 */
	Employee (String name, int age, double salary){
		setSalary(salary);
		setAge(age);
		setName(name);
	}
	/**
	 * 
	 * sets the salary attribute and check 
	 * 
	 * @param salary
	 *            the salary of the employee
	 */
	private void setSalary(double salary){
		if(salary >= 0){
			this.salary = salary;
		}
		else{
			this.salary = 25000.00;
		}
	}
	/**
	 * sets the age attribute
	 * 
	 * @param age
	 *            is the age of the employee
	 */
	private void setAge(int age){
		if(age < 150 && age >= 18){
			this.age = age;
		}
		else{
			this.age = 18;
		}
	}
	/**
	 * Sets the name attribute
	 * 
	 * @param name
	 *          is the name of the employee
	 */
	private void setName(String name){
		this.name = name;
	}
	/**
	 * returns the name of the employee
	 * 
	 * @return the name of the employee
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * returns the age of the employee
	 * 
	 * @return the age of the employee
	 */
	public int getAge(){
		return this.age;
	}
	/**
	 * returns the salary of the employee
	 * 
	 * @return the salary of the employee
	 */
	public double getSalary(){
		return this.salary;
	}
	
}
