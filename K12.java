public class K12{
    public static void main(String[] args){
	int num1=0;
	String info1="";
	String info2="";
	String info3="";
	for(int j=3;j<6;j++){
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



//javac -d bin K12.java
//java -cp bin K12

