public class K5{
    public static void main(String[] args){
        int num1=Integer.parseInt(args[0]);
        int factn=1;
	for (int i=1;i<num1+1;i++){
	    factn=factn*i;
	}
	System.out.println(factn);
	
    }
}

//fact1=1
//fact2=2*1
//fact3=3*2*1
//fact4=4*3*2*1
//fact5=5*4*3*2*1 = 120

//javac -d bin K5.java
//java -cp bin K5 5
