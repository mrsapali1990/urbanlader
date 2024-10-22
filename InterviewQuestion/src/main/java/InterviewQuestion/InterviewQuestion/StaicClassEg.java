package InterviewQuestion.InterviewQuestion;


	public class StaicClassEg {
		  
		   static class Nested_Demo {
		      public void my_method() {
		         System.out.println("This is my nested class");
		      }
		   }
		   public static void main(String args[]) {
		      StaicClassEg.Nested_Demo nested = new StaicClassEg.Nested_Demo();
		      nested.my_method();
		   }
		}

