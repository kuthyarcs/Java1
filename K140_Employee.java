package pkg2;

class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void raiseSalary(double percent) {
		if(percent>0) {
			double increment=salary*(percent/100);
			salary=salary+increment;
			System.out.println("New Salary: "+salary);
		}
		else {
			System.out.println("Invalid percentage. Salary remains unchanged");
		}
	}
	public void showEmployeeDetails() {
		System.out.println("Employee ID:"+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary "+salary);
	}
}
public class K140_Employee {
	public static void main(String[] args) {
		Employee ganesh=new Employee(1, "Ganesh", 10000);
		ganesh.showEmployeeDetails();
		ganesh.raiseSalary(20);
		ganesh.showEmployeeDetails();
	}  
}
//A class called Employee, which models an employee with an ID, name and salary is designed
//The method raiseSalary(percent)increases the salary by the given percentage. Develop the Employee class
//and suitable main method for demonstration