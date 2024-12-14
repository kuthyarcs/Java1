package pkg2;
abstract class AbstractShape{
	abstract double calcArea(); 
	abstract double calcPerimeter();
}
class Rectangle0512 extends AbstractShape{
	int length;
	int breadth;
	public Rectangle0512(int l1,int b1) {
		this.length=l1;
		this.breadth=b1;
	}
	double calcArea() {
		return length*breadth;
	}
	double calcPerimeter() {
		return 2*(length+breadth);
	}
}
class Circle0512a{
	int radius;
	public Circle0512a(int r1) {
		this.radius=r1;
	}
	double calcArea() {
		return Math.PI*radius*radius;
	}
	double calcPerimeter() {
		return 2*Math.PI*radius;
	}
}
public class K160 {

	public static void main(String[] args) {
		System.out.println("AbstractShape");
		Rectangle0512 r1=new Rectangle0512(5,6);
		System.out.println(r1.calcArea());
		System.out.println(r1.calcPerimeter());
		Circle0512a c1=new Circle0512a(5);
		System.out.println(c1.calcArea());
		System.out.println(c1.calcPerimeter());
	}

}
