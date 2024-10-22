package stringmethodes;

public class CountWords {

	public static void main(String[] args) {
		String words="one two thre four";
		int countWords=words.split("\\s").length;
		System.out.println(countWords);
	}

}
