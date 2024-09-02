public class K38{
    public static void main(String[] args){
	byte a=64, b;      //a=0100 0000 = 64
	int i;
	i=a<<2;           // i=0001 0000 0000 = 256 
	b=(byte)(a<<2);   // 0
	System.out.println(a);
	System.out.println(i);
	System.out.println(b);
    }
}
//javac -d bin K38.java
//java -cp bin K38
// 
//Java-HerbertSchildt-Chap3




