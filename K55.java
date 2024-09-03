public class K55{
    public static void main(String[] args){
	int sum1=0;
	int nums[][]=new int[3][5];
	for(int i=0;i<3;i++){
	    for(int j=0;j<5;j++){
		nums[i][j]=(i+1)*(j+1);}}
	for(int x[]:nums){
	    for(int y:x){
		sum1=sum1+y;
		System.out.println(sum1);}}
    }
}
//javac -d bin K55.java
//java -cp bin K55
// 
//Java-HerbertSchildt-Chap4




