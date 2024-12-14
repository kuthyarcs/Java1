package pkg2;

abstract class Shape1412{
	abstract double calcArea();
}
class Rectangle1412 extends Shape1412{
	private double length;
	private double breadth;
	public Rectangle1412(int l, int b) {
		this.length=l;
		this.breadth=b;
	}
	public double calcArea() {
		return length*breadth;
	}
}
class Triangle1412 extends Shape1412{
	private double side1;
	private double side2;
	private double side3;
	public Triangle1412(double s1, double s2, double s3) {
		this.side1=s1;
		this.side2=s2;
		this.side3=s3;
	}
	
	double calcArea() {
		double s=(side1+side2+side3)/2;
		double result1=s*(s-side1)*(s-side2)*(s-side3);
		return Math.sqrt(result1);
	}
}
	
public class K163 {

	public static void main(String[] args) {
		System.out.println("Shape");
		Rectangle1412 r1=new Rectangle1412(10,5);
		System.out.println(r1.calcArea());
		Triangle1412 t1=new Triangle1412(8,6,4);
		System.out.println(t1.calcArea());

	}

}
