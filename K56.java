public class K56{
    public static void main(String[] args){
	int nums[]={6,6,3,7,5,6,1,4};
	int val=5;
	boolean found=false;
	for(int x:nums){
	    if(x==val){
		found=true;
		break;}}
	if(found){
	    System.out.println("Value found");}
    }
}
//javac -d bin K56.java
//java -cp bin K56
// 
//Java-HerbertSchildt-Chap4




