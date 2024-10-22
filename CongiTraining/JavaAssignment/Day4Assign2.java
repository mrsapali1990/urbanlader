package JavaAssignment;

class Da4Assign2
{
	   public static void main(String args[])
	   {
	     //create array of employee object  
	     Employee[] obj = new Employee[2] ;
	 
	     //create actual employee object
	     obj[0] = new Employee();
	     obj[1] = new Employee();
	     //assign data to employee objects
	     obj[0].setData(106,"ghansham");
	     obj[1].setData(1127,"rajat");
	 
	     //display the employee object data
	     System.out.println("Employee Object 1:");
	     obj[0].showData();
	     System.out.println("Employee Object 2:");
	     obj[1].showData();
	  }
	}
	//Employee class with empId and name as attributes
	class Employee{
	    int empId;
	    String name;
	    public void setData(int c,String d){
	        empId=c;
	        name=d;
	     }
	    public void showData(){
	        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
	        System.out.println();
	     }
	}