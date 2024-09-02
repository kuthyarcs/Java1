public class K36{
    public static void main(String[] args){
	int a=1;
	int b=2;
	int c;
	int d;
	c=++b;  //b=3, c=3
	d=a++;  //a=2, d=1
	c++;    //c=4
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
    }
}
//javac -d bin K36.java
//java -cp bin K36
// Increment and Decrement 
//Java-HerbertSchildt-Chap3




