//I have attempted the bonus



package sakfy6.cs3330.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class LabOneDriver {
	
	private static Scanner input;

	/**
	 * Count the number of occurrences for prefix, suffix, and substring given a
	 * user input string compared against the strings stored in the file
	 * names.txt
	 * 
	 * @param args
	 *            Nothing is used from the args for this program
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		ArrayList<String> names = initArrayOfStrings("names.txt", 10);
		displayArrayOfStrings(names);
		displaySortedArrayOfStrings(names);
		
		System.out.print("Enter a string to do comparison with: ");
		String search = input.nextLine();
		final int oldSchoolSubStrCnt = oldSchoolSubstringOccurrences(names,
				search);
		System.out.println("Manual substring search, found: "
				+ oldSchoolSubStrCnt);

		final int oldSchoolPrefixCnt = oldSchoolPrefixOccurrences(names, search);
		System.out
				.println("Manual prefix search, found: " + oldSchoolPrefixCnt);

		System.out.println("Number of suffix found:"
				+ countSuffixOccurrences(names, search));

		if (countPrefixOccurrences(names, search) != oldSchoolPrefixCnt) {
			System.out.println("You have an incorrect solution!");
		}

		if (countSubstringOccurrences(names, search) != oldSchoolSubStrCnt) {
			System.out.println("You have an incorrect solution!");
		}

		input.close();
	}
	
	/**
	 * Initializes the an array of Strings from a file located at the names.txt
	 * 
	 * @param filePath
	 *            The location of the names used for the program
	 * @param num
	 *            The number of records the program wants to read
	 * @return an array of strings that is populated
	 */
	
	public static ArrayList<String> initArrayOfStrings(String filePath, int num) {
		 File file = new File(filePath);
		 ArrayList<String> arrayOfStrings = new ArrayList<String>();
		 try {
			 Scanner sc = new Scanner(file);
			 for(int i = 0; i < num; i++){
				 if(sc.hasNextLine()){
					 arrayOfStrings.add(sc.nextLine()); 
				 }
			 }
			 sc.close();
		 } 
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 return arrayOfStrings;
		 
	}

	/**
	 * Displays the contents of the passed array of strings. If the array is
	 * empty will not display contents.
	 * 
	 * @param arrayOfStrings
	 *            That is populated with strings
	 */
	public static void displayArrayOfStrings(ArrayList<String> arrayOfStrings) {
		System.out.println("Names stored in Array of Strings:");
		for (String i : arrayOfStrings) {
			System.out.println(i);
		}

	}
	/**
	 * Displays the contents of the passed array of strings. If the array is
	 * empty will not display contents.
	 * 
	 * @param arrayOfStrings
	 *            That is populated with strings
	 */

	public static void displaySortedArrayOfStrings(ArrayList<String> arrayOfStrings) {
		System.out.println(" ");
		System.out.println("Sorted Array of Strings:");
		Collections.sort(arrayOfStrings);
		for (String i : arrayOfStrings) {
			System.out.println(i);
		}
		System.out.println(" ");
	}

	/**
	 * Counts the occurrences of the prefix in each string
	 * 
	 * 
	 * @param arrayOfStrings
	 *            That is populated with strings
	 * @param prefix
	 * 			Contains the sub array to be searched in the beginning of the array
	 * @return an int for the number of string occurrences
	 * 
	 */
	public static int oldSchoolPrefixOccurrences(ArrayList<String> arrayOfStrings,
			String prefix) {
		int count = 0;
		boolean test = true;
		for(String i : arrayOfStrings){
			for (int j=0; j<prefix.length(); j++){
				if(i.charAt(j) != prefix.charAt(j)){
					test = false;
				}
			}
			if(test){
				count++;
			}
			else{
				test = true;
			}
		}
		return count;

	}
	
	/**
	 * Counts the occurrences of the prefix in each string
	 * 
	 * 
	 * @param arrayOfStrings
	 *            That is populated with strings
	 * @param substring
	 * 			Contains the sub array to be searched in the array
	 * @return an int for the number of string occurrences
	 * 
	 */
	public static int oldSchoolSubstringOccurrences(ArrayList<String> arrayOfStrings,
			String substring) {
		
		int count = 0, test = 0;
		for( String st : arrayOfStrings){
			for (int i = 0; i <= st.length() - substring.length(); i++)
		    {
		        for (int j = i; j < i + substring.length(); j++)
		        {
		            test = 1;
		            if (st.charAt(j) != substring.charAt(j - i))
		            {
		                test = 0;
		                break;
		            }
		        }
		        if (test == 1)
		            break;
		    }
		    if (test == 1)
		        count++;
		}
		return count;
	}

	/**
	 * Counts the occurrences of the prefix in each string
	 * 
	 * 
	 * @param arrayOfStrings
	 *            That is populated with strings
	 * @param prefix
	 * 			Contains the sub array to be searched in the beginning of the array
	 * @return an int for the number of string occurrences
	 * 
	 */
	public static int countPrefixOccurrences(ArrayList<String> arrayOfStrings,
			String prefix) {
		int count = 0;
		for(String i : arrayOfStrings){
			if(i.startsWith(prefix)){
				count++;
			}
		}
		return count;
	}

	/**
	 * Counts the occurrences of the suffix in each string
	 * 
	 * 
	 * @param arrayOfStrings
	 *            That is populated with strings
	 * @param suffix
	 * 			Contains the sub array to be searched in the beginning of the array
	 * @return an int for the number of string occurrences
	 * 
	 */
	public static int countSuffixOccurrences(ArrayList<String> arrayOfStrings,
			String suffix) {
		int count = 0;
		for( String i : arrayOfStrings){
			if(i.endsWith(suffix)){
				count++;
			}
		}
		return count;
	}

	/**
	 * Counts the occurrences of the substring in each string
	 * 
	 * 
	 * @param arrayOfStrings
	 *            That is populated with strings
	 * @param substring
	 * 			Contains the sub array to be searched in the array
	 * @return an int for the number of string occurrences
	 * 
	 */
	public static int countSubstringOccurrences(ArrayList<String> arrayOfStrings,
			String substring) {
		int count = 0;
		for( String i : arrayOfStrings){
			if(i.contains(substring)){
				count++;
			}
		}
		return count;
	}

}
