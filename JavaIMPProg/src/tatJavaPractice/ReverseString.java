
package tatJavaPractice;
class ReverseString {
    public static void main(String[] args) {
      //palindrome string
      String x="amit";
      String y=" ";
      for(int i=x.length()-1;i>=0;i--)
      {
          y=y+x.charAt(i);
      }
      System.out.println(y);
    }
}