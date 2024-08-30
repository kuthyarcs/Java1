public class K22{
    public static void main(String[] args){
	int x=10;
	if (x==10){
	   int y;
	   y=x*2;
	   System.out.println(x + "  " + y);
	}

	//System.out.println(x + " " +y);  //y not known here
	//Try uncommenting this line and see the error
	

    }
}
//javac -d bin K22.java
//java -cp bin K22
//Here, the second print statement will fail because y is not initialised.




