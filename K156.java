package pkg2;

class MyPoint4{
	int x;
	int y;
	public MyPoint4() {
		this.x=0;
		this.y=0;
	}
	public MyPoint4(int x1,int y1) {
		this.x=x1;
		this.y=y1;
	}
	public double calcDistance(int x1, int y1) {
		double xDiff=this.x-x1;
		double yDiff=this.y-y1;
		double distance=Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		return distance;
	}
}
public class K156 {

	public static void main(String[] args) {
		System.out.println("Point");
		MyPoint4 p1=new MyPoint4();
		MyPoint4 p2=new MyPoint4(3,4);
		MyPoint4 p3=new MyPoint4(9,12);
		System.out.println(p1.calcDistance(3,4));
		System.out.println(p2.calcDistance(9,12));
		

	}

}
