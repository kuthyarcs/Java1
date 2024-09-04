class Box{
    double width;
    double height;
    double depth;
    Box(){
	System.out.println("Constructing Box");
	width=10;
	height=10;
	depth=10;}
    double volume(){
	return (width*height*depth);}}
   public class K68{
    public static void main(String[] args){
	Box box1=new Box();
	Box box2=new Box();
	System.out.println("Volume is " + box1.volume());
	System.out.println("Volume is " + box2.volume());}}





