package pkg2;
interface Resizable6{
	public int resizeWidth(int w);
	public int resizeHeight(int h);
}
class Rectangle6 implements Resizable6{
	int width;
	int height;
	public Rectangle6(int w, int h) {
		this.width=w;
		this.height=h;
	}
	public int resizeWidth(int w) {
		this.width=w;
		return width;
	}
	public int resizeHeight(int h) {
		this.height=h;
		return height;
	}
	public String displayDetails() {
		String info=this.width+","+this.height;
		return info;
	}
}
public class K152 {

	public static void main(String[] args) {
		System.out.println("Resizable");
		Rectangle6 r1=new Rectangle6(5,8);
		System.out.println(r1.displayDetails());
		r1.resizeWidth(100);
		r1.resizeHeight(200);
		System.out.println(r1.displayDetails());
		

	}

}
