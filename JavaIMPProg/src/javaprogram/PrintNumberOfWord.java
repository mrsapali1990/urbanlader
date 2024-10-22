package javaprogram;

public class PrintNumberOfWord {
public static void main(String[] args) {
//	String str="Tathagat Wasnik";
//	int countWords=str.split("\\s").length;
//	System.out.println(countWords);
//}
//}
String str = "pr2ep4in5st1";
//int res = 0;
str = str.replaceAll("[^0-9]","");
int count=str.length();
//char[] ch = str.toCharArray();
//for(int i = 0;i<ch.length;i++){
//res = res + Character.getNumericValue(ch[i]);
//}
System.out.println(count); }}