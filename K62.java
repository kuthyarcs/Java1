public class K62{
    public static void main(String[] args){
	boolean t=true;
	System.out.println("Before the return");
	if (t){
	    return;}
	System.out.println("This won't execute");
    }
}
//javac -d bin K62.java
//java -cp bin K62
// 
//Java-HerbertSchildt-Chap4




