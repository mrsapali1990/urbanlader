package InterviewQuestion.InterviewQuestion;

public class ImpStaticProg {
    static int x = 10;
    public static void main(String[] args) {

    	ImpStaticProg t1 = new ImpStaticProg();
    	ImpStaticProg t2 = new ImpStaticProg();
        t1.x = 20;
       // ImpStaticProg x;

        System.out.print(t1.x + " ");

        System.out.println(t2.x);
    }
}