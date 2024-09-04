class Box{
    double width;
    double height;
    double depth;
    void volume(){
	System.out.print("Volume is ");
	System.out.println(width*height*depth);}}
public class K65{
    public static void main(String[] args){
	Box box1=new Box();
	Box box2=new Box();
	box1.width=10;
	box1.height=20;
	box1.depth=15;
	box2.width=3;
	box2.height=6;
	box2.depth=9;
	box1.volume();
	box2.volume();}}





