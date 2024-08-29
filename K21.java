public class K21{
    public static void main(String[] args){
	boolean b;
	int n1,n2;

	n1=10;
	n2=20;
	if (n1<n2) {
		b=false;
		System.out.println(b);}
	n1=20;
	n2=10;
	if (n1<n2){
		b=false;
		System.out.println(b);}
	else{
		b=true;
		System.out.println(b);}

	System.out.println();
	System.out.println(n1>n2);
	System.out.println(n1<n2);

    }
}
//javac -d bin K21.java
//java -cp bin K21





