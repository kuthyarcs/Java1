public class K8{
    public static void main(String[] args){
	int num1=3;
	String info1="";
	String info2="";
	String info3="";
	info1=String.valueOf(num1);

	info2=String.valueOf(1);
	info3=String.valueOf(num1*1);
	System.out.println(info1+"*"+info2+"="+info3);	

	info2=String.valueOf(2);
	info3=String.valueOf(num1*2);
	System.out.println(info1+"*"+info2+"="+info3);

	info2=String.valueOf(3);
	info3=String.valueOf(num1*3);
	System.out.println(info1+"*"+info2+"="+info3);
   }
}



//javac -d bin K8.java
//java -cp bin K8

