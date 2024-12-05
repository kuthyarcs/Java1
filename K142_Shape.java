package pkg2;

class Shape{
	public void draw() {
		System.out.println("Drawing a shape");
	}
	public void erase() {
		System.out.println("Erasing a shape");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
	@Override
	public void erase() {
		System.out.println("Erasing a circle");
	}
}
class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}
	@Override
	public void erase() {
		System.out.println("Erasing a triangle");
	}
}
class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing a square");	
	}
	@Override
	public void erase() {
		System.out.println("Erasing a square");
	}
}
public class K142_Shape {
	public static void main(String[] args) {
		System.out.println("Test Shape");
		Shape[] shapes=new Shape[3];
		shapes[0]=new Circle();
		shapes[1]=new Triangle();
		shapes[2]=new Square();
		for(int i=0;i<shapes.length;i++) {
			shapes[i].draw();
			shapes[i].erase();
			System.out.println("-----------------");
		}
	}
//Develop a Java program to create a class named Shape. Create 2 classes - Circle, Triangle, Square
//Each class has 2 member functions draw() and erase(). Demonstrate polymorphism by developing
//suitable methods 
}
