class Box{
    double width;
    double height;
    double depth;}
public class K63{
    public static void main(String[] args){
	Box box1 = new Box();	
	double vol;
	
	box1.width=10;
	box1.height=20;
	box1.depth=15;
	vol=box1.width*box1.height*box1.depth;
	System.out.println(vol);
    }
}
//javac -d bin K63.java
//java -cp bin K63
// 
//Java-HerbertSchildt-Chap4




