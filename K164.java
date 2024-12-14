package pkg2;
class TimeTable{
	int periodNo;
	String subject;
	public TimeTable(int p, String s) {
		this.periodNo=p;
		this.subject=s;
	}
	public void display() {
		String message="Mon " + subject;
		System.out.println(message);
	}
}
public class K164 {

	public static void main(String[] args) {
		System.out.println("Timetable");
		TimeTable t1=new TimeTable(1,"Physics");
		t1.display();
	}

}
