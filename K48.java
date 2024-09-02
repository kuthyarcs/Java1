public class K48{
    public static void main(String[] args){
	int i=100;
	int j=200;
	while(++i < --j);  //no body within while
	System.out.println("Midpoint is: " +i);
    }
}
//javac -d bin K48.java
//java -cp bin K48
// 
//Java-HerbertSchildt-Chap4




