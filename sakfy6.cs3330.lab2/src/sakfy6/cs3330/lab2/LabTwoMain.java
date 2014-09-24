package sakfy6.cs3330.lab2;

public class LabTwoMain{

	public static void main(String[] args) {
		EmployeeDataReader employeeDataReader = new EmployeeDataReader("EmployeeData.csv");
		Employee[] employeeDatabase = employeeDataReader.getEmployeeData();
		displayEmployees(employeeDatabase);
		System.out.println("");
		Employee highestPaid = findHighestPaidEmployee(employeeDatabase);
		
		System.out.println("Highest Paid Employee is " + highestPaid.getName() + " at " + highestPaid.getSalary());
		System.out.println("Total Cost of All Employees is " +  totalCostOfAllEmployees(employeeDatabase));
		findBiggestAgeDifferenceBetweenEmployees(employeeDatabase);
	}
	
	/**
	 * displays all the employees in the array 
	 * 
	 * @param employeeDatabase
	 *            an array of all the employees
	 */
	public static void displayEmployees(Employee[] employeeDatabase){
		for(Employee i : employeeDatabase){
			System.out.println(i.getName() + " " + i.getAge() );
		}
	}
	/**
	 *returns the employee with the highest pay
	 * 
	 * @param employeeDatabase
	 *            an array of all the employees
	 * @return the employee with the highest pay 
	 */
	public static Employee findHighestPaidEmployee(Employee[] employeeDatabase){
		Employee highest = new Employee("",0,0);
		for(Employee i : employeeDatabase){
			if(i.getSalary() > highest.getSalary()){
				highest = i;
			}
		}
		
		return highest;
	}
	/**
	 * finds the total cost for all the employees
	 * 
	 * @param employeeDatabase
	 *           an array of all the employees
	 *           
	 * @return the total cost of the employees 
	 */
	public static double totalCostOfAllEmployees(Employee[] employeeDatabase){
		double cost = 0;
		for(Employee i : employeeDatabase){
			cost += i.getSalary();
		}
		
		return cost;
	}
	/**
	 * finds the biggest age difference between the employees
	 * 
	 * @param employeeDatabase
	 *            array of all the employees
	 */
	public static void findBiggestAgeDifferenceBetweenEmployees(Employee[] employeeDatabase){
		String youngestN = employeeDatabase[0].getName();
		int youngestAge = employeeDatabase[0].getAge();
		String oldestN = "";
		int oldestAge = 0;
		
		for(Employee i : employeeDatabase){
			if(i.getAge() > oldestAge){
				oldestAge = i.getAge();
				oldestN = i.getName();
			}
			else if(i.getAge() < youngestAge){
				youngestAge = i.getAge();
				youngestN = i.getName();
			}
		}
		
		System.out.println("");
		System.out.println("Biggest age difference is between "+youngestN+" and "+oldestN);
		System.out.println("The difference is "+(oldestAge-youngestAge));
		
	}

}