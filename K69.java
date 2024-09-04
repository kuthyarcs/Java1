class Box{
    double width;
    double height;
    double depth;
    Box(double w, double h, double d){
	width=w;
	height=h;
	depth=d;}
    double volume(){
	return (width*height*depth);}}
   public class K69{
    public static void main(String[] args){
	Box box1=new Box(10,20,15);
	Box box2=new Box(3,6,9);
	System.out.println("Volume is " + box1.volume());
	System.out.println("Volume is " + box2.volume());}}





