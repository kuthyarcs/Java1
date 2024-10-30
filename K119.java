package pkg1;
class MyRunnable implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(500);//suspend thread for 500ms
			System.out.println("Thread"+Thread.currentThread().getId()+" is running");}
		catch (InterruptedException e){
			e.printStackTrace();}}}

public class K119 {
	public static void main(String[] args) {
		String title0="Lab 10 program";
		String title1="Write a program to illustrate creation of threads using runnable class";
		String title2="Use start() to start new thread. Insider the run method, sleep(500)";
		MyRunnable mr=new MyRunnable();
		Thread t1=new Thread(mr);
		Thread t2=new Thread(mr);
		Thread t3=new Thread(mr);
		t1.start();
		t2.start();
		t3.start();}}
