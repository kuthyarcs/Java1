public class K46{
    public static void main(String[] args){
	for(int i=0;i<12;i++){
	    switch(i){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		    System.out.println("i is less than 5");
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		    System.out.println("i is less than 10");
		    break;
		default:
		    System.out.println("i is out of range");}}
    }
}
//javac -d bin K46.java
//java -cp bin K46
// Switch statement, break statement is optional
//Java-HerbertSchildt-Chap4




