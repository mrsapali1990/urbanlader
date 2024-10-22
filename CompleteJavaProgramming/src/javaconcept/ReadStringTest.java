package javaconcept;

import java.io.Console;

public class ReadStringTest {
	public static void main(String[] args) {
//		Console c=System.console();
//		if(c == null) 
//        {
//            System.out.print("No console available");
//            return;
//        }
//		System.out.println("Enter your name");
//		String n=c.readLine(); 
//		System.out.println("Welcome   "+n);
		   String str;
	          
	        //Obtaining a reference to the console.
	        Console con = System.console();
	          
	        // Checking If there is no console available, then exit.
	        if(con == null) 
	        {
	            System.out.print("No console available");
	            return;
	        }
	          
	        // Read a string and then display it.
	        str = con.readLine("Enter your name: ");
	        con.printf("Here is your name: %s\n", str);
	  
	        //to read password and then display it
	        System.out.println("Enter the password: ");
	        char[] ch=con.readPassword();
	  
	        //converting char array into string
	        String pass = String.valueOf(ch);
	        System.out.println("Password is: " + pass);
	    }

	}


