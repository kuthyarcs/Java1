package pkg1;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Units{
       public static void main(String[] args) throws IOException{
           File f1=new File("in3.txt");
           FileWriter fw2=new FileWriter("out1.txt");
           Scanner sc1=new Scanner(f1);
           String[] arr1=new String[5];
           double lhsvalue,rhsvalue;
           String lhsunits,rhsunits,equals,info1,info2,s1;
           while (sc1.hasNext()){
        	   s1=sc1.nextLine();
    	       arr1=s1.split(" ");
    	       lhsvalue=Integer.parseInt(arr1[0]);
    	       rhsvalue=Integer.parseInt(arr1[3]);
    	       lhsunits=arr1[1];
    	       rhsunits=arr1[4];
    	       equals=" "+arr1[2]+" ";
    	       
    	       info1=1+" "+lhsunits+equals+(rhsvalue/lhsvalue)+" "+rhsunits;
    	       info2=1+" "+rhsunits+equals+(lhsvalue/rhsvalue)+" "+lhsunits;
    	       System.out.println(info1+"\n"+info2+"\n");
    	       fw2.write(info1+"\n"+info2+"\n"+"\n");
           }
	       fw2.close();
	       
	       
	       
	      
                
                }}

                
            



           
           
           
           