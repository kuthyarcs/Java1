public class K3{
    public static void main(String[] args){
        int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);
	int sum1=n1+n2;
	System.out.println(sum1);
    }
}

// The name of the file should be same as the name of the public class. So, this file should be K3.java
// Every Java program requires a main method.  This main method is written inside the public class.  main() method is public because it needs to be accessed from anywhere. main() method is static because the JVM can call it without having to create an instance. main() method is void because it does not return anything. main() method takes a string array as a parameter. ie. it can take 1 string, 2 strings, 3 strings...or any number of strings.  In this example, we are providing 2 string parameters