package JavaProgram;

import java.util.ArrayList;
import java.util.Iterator;

class Emp {

	int salary;
	String name;

	Emp(int i, String g) {
		this.salary = i;
		this.name = g;

	}

}
public class MaxSalaryTest {

	public static void main(String[] args) {
		ArrayList<Emp> a = new ArrayList<Emp>();

		a.add(new Emp(100, "javed"));
		a.add(new Emp(500, "apporva"));
		a.add(new Emp(5000, "sumit"));


		Iterator<Emp> i = a.iterator();
		int maxsalary = 0;
		int sal = 0;
		while (i.hasNext()) {
			Emp e = i.next();
			sal = e.salary;
			if (sal > maxsalary) {
				maxsalary = sal;
			}
		}
		System.out.println("maximum salary..." + maxsalary);
	}
}