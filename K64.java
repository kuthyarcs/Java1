class Box{
    double width;
    double height;
    double depth;}
public class K64{
    public static void main(String[] args){
	Box box1=new Box();
	Box box2=new Box();
	double vol;
	
	box1.width=10;
	box1.height=20;
	box1.depth=15;
	
	box2.width=3;
	box2.height=6;
	box2.depth=9;
	
	vol=box1.width*box1.height*box1.depth;
	System.out.println(vol);
	vol=box2.width*box2.height*box2.depth;
	System.out.println(vol);
    }
}
//javac -d bin K64.java
//java -cp bin K64
// 
//Java-HerbertSchildt-Chap4




