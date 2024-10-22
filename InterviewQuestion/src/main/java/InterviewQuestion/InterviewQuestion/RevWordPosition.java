package InterviewQuestion.InterviewQuestion;

public class RevWordPosition {
	public static void main(String[] args) {
        System.out.println("Automation test engg");
        String x="Automation test engg";
        String revWord[]=x.split("\\s");
        String y="";
        for(int i=revWord.length-1;i>=0;i--)
        {
            y=y+revWord[i]+" ";
        }
        System.out.println("reverse string ====    "+y );
        //engg test Automation
    }
}
