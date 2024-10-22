package InterviewQuestion.InterviewQuestion;

public class ThisKeyword {

        int a, b;
        void getValues(int x, int y){
            this.a=x;//this.a represent class variable and a represent method variable.
            this.b=y;//this.b represent class variable and b represent method variable.
      
        }
        void printValues(){
             System.out.println(a);
             System.out.println(b);
        }
         public static void main(String[] args) {
        	 ThisKeyword hw = new ThisKeyword();
             hw.getValues(10,20);
             hw.printValues();
         }
             
}
