package pkg2;

class Employee4{
	String name;
	int id;
	double salary;
	public Employee4(String n1,int i1, double s1) {
		this.name=n1;
		this.id=i1;
		this.salary=s1;
	}
	public double raiseSalary(double percent) {
		salary=salary+(salary*(percent/100));
		return salary;
	}
	public String displayDetails() {
		return name+" "+id+ " "+salary;
	}
}
public class K155 {

	public static void main(String[] args) {
		System.out.println("Employee");
		Employee4 rahul = new Employee4("Rahul", 110, 20000);
		System.out.println(rahul.displayDetails());
		rahul.raiseSalary(40);
		System.out.println(rahul.displayDetails());

	}

}
