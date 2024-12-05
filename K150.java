package pkg2;

class Shape4{
	public void draw() {
		System.out.println("Drawing Shape");
	}
	public void erase() {
		System.out.println("Erasing Shape");
	}
}
class Rectangle4 extends Shape4{
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	@Override
	public void erase(){
		System.out.println("Erasing Rectangle");
	}
}
public class K150 {

	public static void main(String[] args) {
		System.out.println("Shape");
		Shape4 s1=new Shape4();
		s1.draw();
		s1.erase();
		Rectangle4 r1=new Rectangle4();
		r1.draw();
		r1.erase();

	}

}
