package pkg1;
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
		start();}}

public class K120 {
	public static void main(String[] args) {
		String s1="Develop a program to create a class MyThread";
		String s2="In this class, call the base class constructor using super and start the thread";
		String s3="The run method of the class starts after this";
		String s4="It can be observed that both main thread and created child thread are executed concurrently";
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n");
		
		for (int i=0;i<=5;i++) {
			System.out.println("Child Thread: "+i);
			try {
				Thread.sleep(1000);}
			catch (InterruptedException e) {
				System.out.println("Child Thread interrupted");}}}}
