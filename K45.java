public class K45{
    public static void main(String[] args){
	String days[]={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
	for(int i=0;i<7;i++){
	    switch(i){
		case 0:	
		System.out.println(days[0]);
		break;

		case 1:
		System.out.println(days[1]);
		break;

		case 2:
		System.out.println(days[2]);
		break;

		case 3:
		System.out.println(days[3]);
		break;

		case 4:
		System.out.println(days[4]);

		case 5:
		System.out.println(days[5]);
		break;

		case 6:
		System.out.println(days[6]);
		break;

		default:
		System.out.println("Invalid input");}}
    }
}
//javac -d bin K45.java
//java -cp bin K45
// Switch statement
//Java-HerbertSchildt-Chap4




