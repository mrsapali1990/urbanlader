package InterviewQuestion.InterviewQuestion;

public class FindNoPresentInArray {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 8, 10};
		int target = 5;

		boolean found = false;

		// Iterating over the array to find the target number
		for (int number : numbers) {
			if (number == target) {
				found = true;
				break;
			}
		}

		// Printing the result
		if (found) {
			System.out.println("Number " + target + " found in the array.");
		} else {
			System.out.println("Number " + target + " not found in the array.");
		}
	}
}


