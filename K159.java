package pkg2;
class Shape0512{
	public void draw() {
		System.out.println("drawing a shape");
	}
	public void erase() {
		System.out.println("erasing a shape");
	}
}
class Circle0512 extends Shape0512{
	public void draw() {
		System.out.println("drawing a circle");
	}
	public void erase() {
		System.out.println("erasing a circle");
	}
}
public class K159 {

	public static void main(String[] args) {
		System.out.println("shape");
		Shape0512 s1=new Shape0512();
		s1.draw();
		s1.erase();
		Circle0512 c1=new Circle0512();
		c1.draw();
		c1.erase();
	}

}
