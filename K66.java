class Box{
    double width;
    double height;
    double depth;
    double volume(){
	return (width*height*depth);}}
public class K66{
    public static void main(String[] args){
	Box box1=new Box();
	Box box2=new Box();
	box1.width=10;
	box1.height=20;
	box1.depth=15;
	box2.width=3;
	box2.height=6;
	box2.depth=9;
	System.out.println("Volume is " + box1.volume());
	System.out.println("Volume is " + box2.volume());}}




