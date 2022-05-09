package JavaBasicsImplementations;
class Salary{
	float salary = 50000;
}
class Employee1 extends Salary{
	int bonus = 1000;
}

public class EmpInheritance {
	public static void main(String[] args) {
		Employee1 empl = new Employee1();
		System.out.println("Employee Salary is:"+empl.salary);
	}
}

