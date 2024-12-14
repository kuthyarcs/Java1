package pkg2;
class MyThread1412 extends Thread{
	public MyThread1412(String name) {
		super(name);
		start();}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			
		}
		
		
		
	}
}


public class K162 {

	public static void main(String[] args) {
		System.out.println("Threads program");
		MyThread1412 t1=new MyThread1412("poorvik");
		for(int i=0;i<=5;i++) {
			System.out.println("MainThread "+ i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			
		}

	}

}
