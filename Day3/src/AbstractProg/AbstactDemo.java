package AbstractProg;

class TechnicalEmp extends Employee {
	int basic = 26000;
	int hra = 7000;
	static int incentives = 12000;
	int grosssalary;

	@Override
	public void calculatesalary() {
		int grosssalary = basic + hra + incentives;
		System.out.println("the technicalEMp salary is  " + grosssalary);
		//this.grosssalary = grosssalary;

	}

}

public class AbstactDemo extends Employee {
	int basic = 16000;
	int hra = 2000;
	static int incentives = 2000;
	int grosssalary;

	@Override
	public void calculatesalary() {
		int grosssalary = basic + hra + incentives;
		System.out.println("the NontechnicalEMp salary is  " + grosssalary);

	}

	public static void main(String[] args) {
		TechnicalEmp obj = new TechnicalEmp();
		obj.calculatesalary();

		AbstactDemo abc = new AbstactDemo();
		abc.calculatesalary();

	}

}