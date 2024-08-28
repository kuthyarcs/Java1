public class K10{
    public static void main(String[] args){
	int num1=3;
	String info1="";
	String info2="";
	String info3="";
	info1=String.valueOf(num1);
	
	for(int i=1;i<4;i++){
	    info2=String.valueOf(i);
	    info3=String.valueOf(num1*i);
	    System.out.println(info1+"*"+info2+"="+info3);
	}	
   }
}



//javac -d bin K10.java
//java -cp bin K10

