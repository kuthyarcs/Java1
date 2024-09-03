public class K53{
    public static void main(String[] args){
	int sum;
	int nums[] ={1,2,3,4,5,6,7,8,9,10};
	sum=0;
	for(int i=0; i<10; i++){    //for loop
	    sum=sum+nums[i];
	    System.out.println(sum);}

	sum=0;	
	for (int x:nums){       //for-each loop
	    sum+=x;
	    System.out.println(sum);}
    }
}
//javac -d bin K53.java
//java -cp bin K53
// For Each
//Java-HerbertSchildt-Chap4




