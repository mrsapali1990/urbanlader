package day6;

//Java code to illustrate the clear() method
import java.util.*;

public class ClearAllHash {
	public static void main(String[] args)
	{

		// Creating an empty HashMap
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping string values to int keys
		hash_map.put(10, "Geeks");
		hash_map.put(15, "4");
		hash_map.put(20, "Geeks");
		hash_map.put(25, "Welcomes");
		hash_map.put(30, "You");

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Clearing the hash map using clear()
		hash_map.clear();

		// Displaying the final HashMap
		System.out.println("Finally the maps look like this: " + hash_map);
	}
}