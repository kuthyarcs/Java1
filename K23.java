public class K23{
    public static void main(String[] args){
	byte b;
	int i=257;
	double d=323.142;

	b=(byte)i;
	System.out.println(i);
	System.out.println(b);  //after casting
	System.out.println();

	b=(byte)d;
	System.out.println(d);
	System.out.println(b);  //after casting
	System.out.println();

	i=(int)d;
	System.out.println(d);
	System.out.println(i);  //after casting
	System.out.println();



    }
}
//javac -d bin K23.java
//java -cp bin K23
//when 257 is cast into byte, b=remainder of 257/256
//when 323.142 is cast into byte, b=remainder of (323/256)
//when 323.142 is cast into int, remove the decimals
//Java-HerbertSchildt-Chap3




