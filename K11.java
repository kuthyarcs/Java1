public class K11{
    public static void main(String[] args){
	int num1=0;
	String info1="";
	String info2="";
	String info3="";

	num1=3;
	info1=String.valueOf(num1);
	for(int i=1;i<11;i++){
	    info2=String.valueOf(i);
	    info3=String.valueOf(num1*i);
	    System.out.println(info1+"*"+info2+"="+info3);
	}
	System.out.println();

	num1=4;
	info1=String.valueOf(num1);
	for(int i=1;i<11;i++){
	    info2=String.valueOf(i);
	    info3=String.valueOf(num1*i);
	    System.out.println(info1+"*"+info2+"="+info3);
	}
	System.out.println();

	num1=5;
	info1=String.valueOf(num1);
	for(int i=1;i<11;i++){
	    info2=String.valueOf(i);
	    info3=String.valueOf(num1*i);
	    System.out.println(info1+"*"+info2+"="+info3);
	}
	System.out.println();

	
   }
}



//javac -d bin K11.java
//java -cp bin K11

