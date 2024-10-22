package InterviewQuestion.InterviewQuestion;

import java.util.ArrayList;

public class NumberStringSearch {
	public static void main(String[] args) {

		String str[]={"12AS","dadAS","dascd22","dadad","ccc323","dadad","dadad"};
		
		ArrayList<String> stringsWithNumbers = new ArrayList<>();


		// Loop through each string in the array
		for (String s : str)
		{
			// Check if the string contains any digit using regular expression
			// The regular expression .*\\d.* means any
				      //number of characters (including none) followed by a digit 
				//and then followed by any number of characters (including none).
			if (s.matches(".*\\d.*"))
			{
				stringsWithNumbers.add(s);
			}
		}

		// Print the strings that contain numbers
		System.out.println("Strings with numbers:");
		for (String s : stringsWithNumbers) {
			System.out.println(s);
		}
	}

}
////int $_=5;
////System.out.println($_);//5
//try(retun)
//{
//	break;
//}
//finally
//{
//	syso("sdfsdf");
//}



