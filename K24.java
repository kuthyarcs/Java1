public class K24{
    public static void main(String[] args){
	byte a=40;
	byte b=50;
	byte c=100;
	int d = (a*b)/c;
	System.out.println(d);
    }
}
//javac -d bin K24.java
//java -cp bin K24
//When evaluating expression,Java promotes each byte,short or char operand 
//a*b is being done as integers not bytes
//Java-HerbertSchildt-Chap3




