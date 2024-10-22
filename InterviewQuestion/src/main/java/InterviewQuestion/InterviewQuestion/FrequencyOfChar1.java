package InterviewQuestion.InterviewQuestion;

public class FrequencyOfChar1 {
	public static void main(String[] args) {


		// given string
		String str = "Scaler by InterviewBit";
		// character whose frequency must be determined
		char ch = 'e';
		
		// store the frequency in freq
		int freq = 0;

		// iterate through the string
		for(int i = 0; i < str.length(); i++) 
		{
			// if the specified character
			// appears in the string
			if(ch == str.charAt(i)) 
			{
				// increase freq by 1
				++freq;
			}
							
		}
//		 String s="sdfsdvddsdf";
//	        int totalCount= s.length();
//	        int countOfs=s.replace("d","").length();
//	        int totalCountOfS=totalCount-countOfs;
//	        System.out.println("frequency of d"+ totalCountOfS);
	        

		// print the total occurrence of 'ch'
		System.out.println("Frequency of " + ch + " = " + freq);
		
	}}

