"# Java" 

javac K1.java   
java K1   

javac K2.java   
java K2   

mkdir bin - to create separate directory for .class files   
javac -d bin K1.java   
java -cp bin/ K1   

javac -d bin K2.java   
java -cp bin/ K2   

javac -d bin K3.java   
java -cp bin/ K3 8 4   

javac -d bin K4.java   
java -cp bin/ K4 8   

javac -d bin K5.java
java -cp bin/ K5 5  -  Factorial of 5 is 120   

```
  String s1="ABCDEFG";
	String s2="";
	s2=s1.substring(0,1);
	System.out.println(s2); ```

```for(int i=0;i<len1;i++){
	    s2=s2+s1.charAt(len1-1-i);
	    System.out.println(s2);
	}```




