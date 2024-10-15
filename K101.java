class Box{
    double width;
    double height;
    double depth;
    Box(double w, double h, double d){
        this.width=w;  
        this.height=h;
        this.depth=d;}
    Box(){           //overloaded constructor     
        this.width=2;
        this.height=3;   //standard box size
        this.depth=4;}
    Box(double len1){ //overloaded consructor
        this.width=len1;
        this.height=len1;  //all sides are equal
        this.depth=len1;}
    void volume(){
        double vol=this.width*this.height*this.depth;
        System.out.println("Volume is: " + vol);}}

public class K101 {
    public static void main(String[] args) {
        System.out.println("Constructor Overloading");
        Box b1=new Box(20.0, 30.0, 40.0);
        Box b2=new Box();
        Box b3=new Box(8);
        b1.volume();
        b2.volume();
        b3.volume();}}
