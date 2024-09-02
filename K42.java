public class K42{
    public static void main(String[] args){
	boolean a=true;
	boolean b=false;
	boolean c=a|b;
	boolean d=a&b;
	boolean e=a^b;
	boolean f=(!a&b) | (a&!b);
	boolean g=!a;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
    }
}
//javac -d bin K42.java
//java -cp bin K42
// Boolean Logical Operator
//Java-HerbertSchildt-Chap3




