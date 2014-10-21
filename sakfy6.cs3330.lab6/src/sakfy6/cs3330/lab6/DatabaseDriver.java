/*
 * Sam Kreter
 * 10/20/2014
 * LAB C
 * Royals
 * 
 * 
 * Note* my output is out of order from the document using the treemap instead of the ArrayList because
 * i used a cocatenated string of the ocupation and the name and the treemap orders them in sorted order
 * 
 * 
 * Treemap in many cases is more efficent than an arraylist becuase elements can be accessed in O(logn) time. This is because 
 * a treemap uses a redblack tree system to places the corrisponding key values into the balances tree in accending order of keys
 * This means to retreive a given key value pair you just have to travse the tree to the given node taking logn time 
 *   
 */
package sakfy6.cs3330.lab6;

public class DatabaseDriver {

	public static void main(String[] args) {
		GoonDatabase GoonDB = new GoonDatabase("Data/Goons.csv");
		GoonDB.searchMenu();
	}

}
