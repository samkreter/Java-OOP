package sakfy6.cs3330.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class EmployeeDataReader {

	String filePath;
	/**
	 *Constructor that sets all the necessary attributes
	 * 
	 * @param file
	 *            file path for the .csv file
	 */
	public EmployeeDataReader(String file) {
		setFilePath(file);
	}
	/**
	 * returns an array of employees loaded form the file
	 * 
	 * @param args
	 *            Nothing is used from the args for this program
	 * @return an array of employees 
	 */
	public Employee[] getEmployeeData(){
		
		String[] splitList = new String[3];
		Employee[] emp = new Employee[10];
		File file = new File(getFilePath());
		 try {
			 Scanner sc = new Scanner(file);
			 for(int i = 0; i < 10; i++){
				 if(sc.hasNextLine()){
					 splitList = sc.nextLine().split(","); 
					 emp[i] = new Employee(splitList[0],Integer.parseInt(splitList[1]),Double.parseDouble(splitList[2]));
				 }
			 }
			 sc.close();
		 } 
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 return emp;
	}
	/**
	 * sets the file path attribute 
	 * 
	 * @param filePath
	 *            is the file path passed by the user
	 */
	private void setFilePath (String filePath){
		this.filePath = filePath;
	}
	/**
	 * returns the filepath for the program 
	 * 
	 * @param args
	 *            Nothing is used from the args for this program
	 * @return the filepath string 
	 */
	private String getFilePath(){
		return this.filePath;
	}
}
