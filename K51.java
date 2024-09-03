public class K51{
    public static void main(String[] args){
	int num1;
	boolean isPrime;	
	
	num1=14;
	if (num1<2) isPrime=false;
	else isPrime=true;

	for(int i=2;i<=num1/i;i++){
	   if (num1%i==0){
		isPrime=false;
		break;}}
	if (isPrime) System.out.println("Prime");
	else System.out.println("Not Prime");
    }
}
//javac -d bin K51.java
//java -cp bin K51
// Program not working
//Java-HerbertSchildt-Chap4




