package JavaTraning;

public class OverRidingAreaCircle  {
	   public static void main (String []agrs) {
		   Circle f = new Circle(10 , 10);
		      Rectangle r = new Rectangle(9 , 5);
		      Circle Circle;
		      Circle = f;
		      System.out.println("Area is :"+Circle.area());
		      Circle = r;
		      System.out.println("Area is :"+Circle.area());
		   }
		}
		class Circle {
		   double dim1;
		   double dim2;
		   Circle(double a , double b) {
		      dim1 = a;
		      dim2 = b;
		   }
		   Double area() {
		      System.out.println("Inside area for figure.");
		      return(dim1*dim2);
		   }
		}
		class Rectangle extends Circle {
		   Rectangle(double a, double b) {
		      super(a ,b);
		   }
		   Double area() {
		      System.out.println("Inside area for rectangle.");
		      return(dim1*dim2);
		   }
		}