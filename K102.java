class Box1{
    double width;
    double height;
    double depth;
    Box1(double w, double h, double d){
        this.width=w;  
        this.height=h;
        this.depth=d;}
    Box1(Box1 ob){           //Using Object as Parameter 
        this.width=ob.width;
        this.height=ob.height;   
        this.depth=ob.depth;}
    void volume(){
        double vol=this.width*this.height*this.depth;
        System.out.println("Volume is: " + vol);}}

public class K102 {
    public static void main(String[] args) {
        System.out.println("Using Objects as Parameters");
        Box1 b1=new Box1(20.0, 30.0, 40.0);
        Box1 b2=new Box1(b1);
        b1.volume();
        b2.volume();}}
