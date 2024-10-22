package JavaTraning;
import java.util.*;

public class StrArray {// Java Program to Convert a String to Character Array
	// Using toCharArray() Method
	  
	// Importing required classes
	
	  
	    // Main driver method
	    public static void main(String args[])
	    {
	        // Custom input string
	        String str = "Tathagat";
	  
	        // Creating array and storing the array
	        // returned by toCharArray() method
	        char[] ch = str.toCharArray();
	  
	        // Lastly printing the array elements
	        for (char c : ch) {
	  
	            System.out.println(c);
	        }
	    }
	}