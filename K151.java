package pkg2;
abstract class AbstractShape5{
	abstract public double calcArea();
	abstract public double calcPerimeter();
}
class Rectangle5 extends AbstractShape5{
	double length;
	double breadth;
	public Rectangle5(double l, double b) {
		this.length=l;
		this.breadth=b;
	}
	public double calcArea() {
		return length*breadth;
	}
	public double calcPerimeter() {
		return 2*(length+breadth);
	}
}
public class K151 {

	public static void main(String[] args) {
		System.out.println("Abstract Shape");
		Rectangle5 r1=new Rectangle5(5,8);
		System.out.println(r1.calcArea());
		System.out.println(r1.calcPerimeter());
		

	}

}
