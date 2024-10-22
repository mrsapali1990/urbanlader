package AbstractProg;

class nontechnicalemp implements EmployeeData{
	int basic = 15000;
	int hra = 2000;
	static int incentives = 2000;
	int grosssalary;

	
	public void calculatesalary() {
		int grosssalary = basic + hra + incentives;
		System.out.println("the NontechnicalEMp salary is  " + grosssalary);

	}
}
public class EmployeeSalaryDemo implements EmployeeData{
	int basic = 25000;
	int hra = 7000;
	static int incentives = 12000;
	int grosssalary;

	
	
public void calculatesalary() {
	int grosssalary = basic + hra + incentives;
	System.out.println("the technicalEMp salary is  " + grosssalary);
	this.grosssalary = grosssalary;

}
	public static void main(String[] args) {
		EmployeeSalaryDemo jkl=new EmployeeSalaryDemo();
		jkl.calculatesalary();
		
		nontechnicalemp abc=new nontechnicalemp();
		abc.calculatesalary();
		
	}

}