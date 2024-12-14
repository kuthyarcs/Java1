package pkg2;

class Employee0512{
	int id;
	String name;
	double salary;
	public Employee0512(int i1,String n1,double s1) {
		this.id=i1;
		this.name=n1;
		this.salary=s1;
	}
	public String displayDetails() {
		return (id+" "+name+" "+salary);
	}
	public double raiseSalary(int percent) {
		double increment=salary*percent/100;
		salary=salary+increment;
		return salary;
	}
}
public class K158 {

	public static void main(String[] args) {
		System.out.println("Employee");
		Employee0512 chirag=new Employee0512(30,"chirag poojary",10000);
		System.out.println(chirag.displayDetails());
		chirag.raiseSalary(40);
		System.out.println(chirag.displayDetails());

	}

}
