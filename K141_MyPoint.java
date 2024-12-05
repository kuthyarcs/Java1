package pkg2;

class MyPoint{
	private int x;
	private int y;
	public MyPoint() {
		this.x=0;
		this.y=0;
	}
	public MyPoint(int x1,int y1) {
		this.x=x1;
		this.y=y1;
	}
	public void setXY(int x1,int y1) {
		this.x=x1;
		this.y=y1;
	}
	public int[] getXY(){
		int[]coordinates= {x,y};
		return coordinates;
	}
	public double distance(int x1, int y1) {
		int xDiff=this.x-x1;
		int yDiff=this.y-y1;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	public double distance(MyPoint another) {
		int xDiff=this.x-another.x;
		int yDiff=this.y-another.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	@Override
	public String toString() {
		return x + " " + y;
	}
}
public class K141_MyPoint {

	public static void main(String[] args) {
		System.out.println("MyPoint");
		MyPoint p1=new MyPoint();
		MyPoint p2=new MyPoint(3,4);
		p1.setXY(1, 2);
		int[] coordinates=p1.getXY();
		System.out.println(coordinates[0] + " "+ coordinates[1]);
		
		System.out.println(p1.distance(5,6));
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance());
		System.out.println(p1);
		System.out.println(p2);
	}
}
// A class called MyPoint which models a 2D point with x and y coordinates as follows
// 2 instance variables int x and int y
// A default no-arg constructor that defines a point at (0,0)
//Overloaded constructor that defines a point at (x,y)
//methods setXY() and getXY()
//methods distance(), distance(MyPoint another)
//develop the code for class MyPoint. Develop TestPoint to test all methods in the class