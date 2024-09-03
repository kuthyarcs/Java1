public class K54{
    public static void main(String[] args){
	int sum1;
	int nums[]={1,2,3,4,5,6,7,8,9,10};
	sum1=0;
	for(int i:nums){
	    sum1=sum1+nums[i];
	    System.out.println(sum1);
	    if(i==5){	
		break;}}
    }
}
//javac -d bin K54.java
//java -cp bin K54
// 
//Java-HerbertSchildt-Chap4




