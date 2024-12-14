package pkg2;
class MyThread1412a extends Thread{
	String name;
	public MyThread1412a(String n1) {
		this.name=n1;
	}
	void display() {
		String message="This " +name+ " thread is running";
		System.out.println(message);
	}
}
public class K165 {

	public static void main(String[] args) {
		System.out.println ("Thread program");
		MyThread1412a t1 = new MyThread1412a("chota");
		t1.display();

	}

}
