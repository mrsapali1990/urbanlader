package InterviewQuestion.InterviewQuestion;

public class StaticMethod {
	int rollNumber;
    String name;
    static String collegeName= "XYZ";
    static void change(){
       collegeName = "PQRS";
    }
    StaticMethod(int roll, String sname){
        rollNumber=roll;
        name=sname;
    }
    void detais(){
        System.out.println(rollNumber+" "+name+" "+collegeName);
    }
    public static void main(String[] args) {
    	StaticMethod.change();
    	StaticMethod s1 = new StaticMethod(111,"ABCD");
    	StaticMethod s2 = new StaticMethod(112,"ABCDED");
    	
    	StaticMethod s3 = new StaticMethod(113,"ABCDytr");
        s1.detais();
        s2.detais();
        s3.detais();
        
    }
}


