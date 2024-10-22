package InterviewQuestion.InterviewQuestion;



class subclass extends parentClass {
    public void displayResult() {
      //  System.out.println("Displaying from sub class");
        int speed=100;
        System.out.println(speed);
    }
    void display1()
    {
    	System.out.println(super.speed);
    }


    public static void main(String args[]) {
        subclass sb=new subclass();
        sb.displayResult();
        sb.display1();
    }
}
