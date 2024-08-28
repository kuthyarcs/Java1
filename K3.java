public class K3{
    public static void main(String[] args){
        int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);
	int sum1=n1+n2;
	System.out.println(sum1);
    }
}

// The name of the file should be same as the name of the public class. So, this file should be K3.java
// Every Java program requires a main method - public, static, void
// Try >java K3 8 4
// Try >java K3 8
// Try >java K3 
// If insufficient parameters provided, may throw Exception