package InterviewQuestion.InterviewQuestion;

public class StringFinder
{

	public static void main(String[] args) {
		String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};
		String target = "orange";

		boolean found = false;

		// Iterating over the array to find the target string
		for (String str : strings) {
			if (str.equals(target)) {
				found = true;
				break;
			}
		}
		if(found)
		System.out.println("find element              "              +target);
		else
			System.out.println("not fond");
	}}
