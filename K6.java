public class K6{
    public static void main(String[] args){
        String s1="ABCDEFG";
	String s2="";
	s2=s1.substring(0,1);
	System.out.println(s2);

	s2=s1.substring(1,2);
	System.out.println(s2);

	s2=s1.substring(2,3);
	System.out.println(s2);

	s2="";
	s2=s2+s1.charAt(6);
	System.out.println(s2);
	s2=s2+s1.charAt(5);
	System.out.println(s2);
	s2=s2+s1.charAt(4);
	System.out.println(s2);

	System.out.println();
	s2="";
	int len1=s1.length();
	for(int i=0;i<len1;i++){
	    s2=s2+s1.charAt(len1-1-i);
	    System.out.println(s2);
	}
    }
}



//javac -d bin K6.java
//java -cp bin K6
//substring() takes 2 integer parameters
//charAt() takes 1 integer parameter
