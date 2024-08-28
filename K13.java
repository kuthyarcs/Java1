import java.util.Scanner;
public class K13{
    public static void main(String[] args){
	int num1=0;
	String info1="";
	String info2="";
	String info3="";
	Scanner sc1=new Scanner(System.in);
	int start=sc1.nextInt();  //enter 3 from keyboard
	int end=sc1.nextInt();    //enter 6 from keyboard

	for(int j=start;j<end+1;j++){
	    num1=j;
	    info1=String.valueOf(num1);
	    for(int i=1;i<11;i++){
	        info2=String.valueOf(i);
	        info3=String.valueOf(num1*i);
	        System.out.println(info1+"*"+info2+"="+info3);
	    }
	    System.out.println();
	}
   }
}



//javac -d bin K13.java
//java -cp bin K13
//After executing the program is waiting for user to type 2 numbers
//For better user experience, add a print statement "Enter start number"

