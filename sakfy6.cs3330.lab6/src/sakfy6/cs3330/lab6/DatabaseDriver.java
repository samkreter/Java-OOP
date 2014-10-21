/*
 * Sam Kreter
 * 10/20/2014
 * LAB C
 * Royals
 * 
 * 
 * Treemap in many cases is more efficent than an arraylist becuase elements can be accessed in O(1) time or constant 
 * time. This is because a treemap uses a hash bucket system to places the corrisponding key values into certian hashes and 
 * will store the keys in sorted order mean it is not only possible to access a certain key value pair in constant time but
 * also have the data sorted for easier access through an iterative way.  
 */
package sakfy6.cs3330.lab6;

public class DatabaseDriver {

	public static void main(String[] args) {
		GoonDatabase GoonDB = new GoonDatabase("Data/Goons.csv");
		GoonDB.searchMenu();
	}

}
