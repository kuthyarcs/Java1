package pkg1;
class MultiThreadingSix implements Runnable{
	int threadNumber;
	MultiThreadingSix(int tNo){
		this.threadNumber=tNo;
	}
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println("Task"+i+ " by ThreadNumber "+ threadNumber);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
			}
		}
	}
}
public class K114 {
	public static void main(String[] args) {
		for(int i=1; i<8; i++) {
			MultiThreadingSix mt1=new MultiThreadingSix(i);
			Thread t1=new Thread(mt1);
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
