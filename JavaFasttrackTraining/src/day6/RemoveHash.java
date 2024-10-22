package day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveHash {
   public static void main(String[] a) {
      String strArr[] = { "P", "Q", "R", "S" };
      Set s = new HashSet(Arrays.asList(strArr));
      strArr = new String[] { "R", "S", "T", "U" };
      s.addAll(Arrays.asList(strArr));
      System.out.println("Elements = " +s);
      // removing all elements
      s.clear();
      System.out.println("Set after removing all the elements = " +s);
   }
}