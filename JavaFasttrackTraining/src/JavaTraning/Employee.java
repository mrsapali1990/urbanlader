package JavaTraning;

class Employee
{
	private int empID;
	private String empName;
	private int empAge;
	

	Employee(int num1, String str, int num2)
	{
		this.empID=num1;
		this.empName=str;
		this.empAge=num2;
	}
	Employee(int empid,int empage)
	{
		this.empID=empid;
		this.empAge=empage;
		
	}
	public void display()
	{
		System.out.println("empId     :" +empID);
		System.out.println("empName   :" +empName);
		System.out.println("empAge    :" +empAge);
	}

	public void display1()
	{
		System.out.println("empId     :" +empID);
	
		System.out.println("empAge    :" +empAge);
	}

	public static void main(String args[])
	{
		//This object creation would call the default constructor
		Employee myobj[] = new Employee[3];
		myobj[0]=new  Employee(555, "Chaitanya", 25);
		myobj[1]=new  Employee(556, "Tathagat", 25);
		myobj[2]=new  Employee(557, "Shreehari", 25);
		//       System.out.println("Employee Name is: "+myobj.getEmpName());
		//       System.out.println("Employee Age is: "+myobj.getEmpAge());
		//       System.out.println("Employee ID is: "+myobj.getEmpID());

		/*This object creation would call the parameterized
		 * constructor StudentData(int, String, int)*/
		Employee myobj1[] = new Employee[3];
		myobj1[0]=new  Employee(555,25);
		myobj1[1]=new  Employee(555,25);
		myobj1[2]=new  Employee(555,25);
		//       System.ouprintln("Employee Age is: "+myobj2.getEmpAge());
		//       System.out.println("Employee ID is: "+myobj2.getEmpID()); 
		
		for(int i=0;i<=2;i++)
		{
			myobj[i].display();
		}

		for(int i=0;i<=2;i++)
		{
			myobj1[i].display1();
		}
	}
}