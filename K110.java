package pkg1;
class MultiThreadingTwo implements Runnable{
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}
		catch (Exception e){
			System.out.println("Exception is caught");
		}
	}
}
public class K110 {
	public static void main(String[] args) {
		for(int i=0;i<8;i++) {
			MultiThreadingTwo mt1= new MultiThreadingTwo();
			//mt1.start();
			mt1.run();
		}

	}

}
