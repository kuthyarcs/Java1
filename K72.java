class OverloadDemo{
    void test(){
	System.out.println("No parameters");}
    void test(int a, int b){
	System.out.println("a,b: "+a + " "+b);}
    void test(double a){
	System.out.println("double a: "+a);}}

public class K72{
    public static void main(String[] args){
	OverloadDemo ob = new OverloadDemo();
	int i=88;
	ob.test();
	ob.test(10,20);
	ob.test(i);         // will invoke test(double)
	ob.test(123.2);}}   // will invoke test(double)






