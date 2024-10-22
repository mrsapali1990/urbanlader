
package JavaTraning;

class Employee1 
{
	int employeeId;
	String employeeName;
	double salary;

	Employee1(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class Manager extends Employee1{

	public static final double BONUSPERCENT=0.2;
	public Manager(int employeeId, String employeeName, double salary) {
		super(employeeId, employeeName, salary);
	}
	public double getSalary() {
		return salary+salary*BONUSPERCENT;
	}
}


class Developer extends Employee1{ 
	public static final double BONUSPERCENT=0.1;

	public Developer(int employeeId, String employeeName, double salary) {
		super(employeeId, employeeName, salary);       
	}

	public double getSalary() {

		return salary+salary*BONUSPERCENT;
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		Developer d1=new Developer(1,"Arpit" ,20000);
		Developer d2=new Developer(2,"John" ,15000);
		Manager m1=new Manager(1,"Amit" ,30000);
		Manager m2=new Manager(2,"Ashwin" ,50000);

		System.out.println("Name of Employee:" +d1.getEmployeeName()+"---"+"Salary:"+d1.getSalary());
		System.out.println("Name of Employee:" +d2.getEmployeeName()+"---"+"Salary:"+d2.getSalary());
		System.out.println("Name of Employee:" +m1.getEmployeeName()+"---"+"Salary:"+m1.getSalary());
		System.out.println("Name of Employee:" +m2.getEmployeeName()+"---"+"Salary:"+m2.getSalary());
	}
}