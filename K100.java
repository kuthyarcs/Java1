class Calculator{
    void add(){
        int sum1=0;  //0 parameter
        System.out.println("Sum: "+sum1);} 
    void add(int n1){   //1 paramter
        int sum1=n1;
        System.out.println("Sum: "+sum1);}
    void add(int n1, int n2){
        int sum1=n1+n2;   //2 parameters
        System.out.println("Sum: "+sum1);}
    void add(int n1, int n2, int n3){
        int sum1=n1+n2+n3;   //3 parameters
        System.out.println("Sum: "+sum1);}
    void add(byte b1, byte b2){
        int sum1=b1+b2;   //automatic widening to int
        System.out.println("Sum: "+sum1);}
    void add(short s1, short s2){
        int sum1=s1+s2;  //automatic widening to int
        System.out.println("Sum: "+sum1);}
    void add(float f1, float f2){
        int sum1=(int)(f1+f2);  //casting to int
        System.out.println("Sum: "+sum1);}
    void add(double d1, double d2){
        int sum1=(int)(d1+d2);  //casting to int
        System.out.println("Sum: "+sum1);}
    void add(double d1, float f1, int n1){
        int sum1=(int)(d1+f1+n1);
        System.out.println("Sum: "+sum1);}}

public class K100 {
    public static void main(String[] args) {
        System.out.println("Method Overloading");
        Calculator calc1=new Calculator();
        calc1.add();
        calc1.add(12345678);
        calc1.add(12345678, 87654321);
        calc1.add(33333333, 44444444, 55555555);
        calc1.add(-128, 128);
        calc1.add(-32000, -16000);
        calc1.add(12.34f, 56.78f);
        calc1.add(.012345678, .876543210);
        calc1.add(56.781234d, 12.34f, 66666666);}}
