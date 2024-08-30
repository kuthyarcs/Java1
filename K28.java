public class K28{
    public static void main(String[] args){
	double nums[]={10.1, 11.2, 12.3, 13.4,14.5};
	double sum=0;
	double average=0;
	for(int i=0;i<5;i++){
	    sum=sum+nums[i];
	}
	average=sum/5;
	System.out.println(average);
    }
}
//javac -d bin K28.java
//java -cp bin K28
//Find average of 5 numbers in an array
//Java-HerbertSchildt-Chap3




