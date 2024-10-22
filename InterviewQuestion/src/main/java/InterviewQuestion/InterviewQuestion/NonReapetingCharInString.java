package InterviewQuestion.InterviewQuestion;

import java.util.HashMap;

import org.apache.poi.util.SystemOutLogger;

public class NonReapetingCharInString {
	public static void main(String[] args) {
		
		
        String s = "rsrzdfsdf";
        for(char i:s.toCharArray())
        {
            if(s.indexOf(i)==s.lastIndexOf(i))
            {
                System.out.println(i);
                System.out.println(s.indexOf(i));
                break;
            }
        }
       
    }
}