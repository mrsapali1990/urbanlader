package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Type5Set {
public static void main(String[] args) {
	// creating LinkedHashSet using the Set  
	/*Set in Java
The set is an interface available in the java.util package.
 The set interface extends the Collection interface. 
An unordered collection or list in which duplicates are not 
allowed is referred to as a collection interface.
 The set interface is used to create the mathematical set.
  The set interface use collection interface's methods 
  to avoid the insertion of the same elements. 
  SortedSet and NavigableSet are two interfaces that extend the set implementation.*/
    Set<String> data = new LinkedHashSet<String>();   

    data.add("JavaTpoint");   
    data.add("Set");   
    data.add("Example");   
    data.add("Set");   

    System.out.println(data);
}
}
