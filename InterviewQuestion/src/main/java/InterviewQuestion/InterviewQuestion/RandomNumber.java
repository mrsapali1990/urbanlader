package InterviewQuestion.InterviewQuestion;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// Create an instance of the Random class
        Random random = new Random();

        // Generate a random number between 1 and 100 (inclusive)
        int randomNumber = random.nextInt(100) + 1;

        // Print the generated random number
        System.out.println("Random number: " + randomNumber);

	}

}
