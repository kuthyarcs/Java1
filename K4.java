public class K4{
    public static void main(String[] params){
        int n1=Integer.parseInt(params[0]);
	int square1=n1*n1;
	System.out.println(square1);
    }
}

//Instead of String[] args,  we have used String[] params. We can use any name, but args is the normal convention
// javac K4.java - If this executes correctly, then K4.class will be created
// java K4.java 5 - Here we are passing one argument. Whatever is passed is considered as a String. To convert to an Integer, we use Integer.parseInt().  Here Integer is the class, parseInt() is the method
