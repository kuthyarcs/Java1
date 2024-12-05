package pkg2;
enum Day {
	Sun,Mon,Tue,Wed,Thu,Fri,Sat;}
public class K136 {
	public static void main(String[] args) {
		Day day=null;
		switch(day) {
		case Sun:
			System.out.println("Sun is a half-day"); break;
		case Sat:
			System.out.println("Sat is a half-day");break;
		default:
			System.out.println("is a working day");break;}}}

