class Box{
	double width;	
	double height;
  double depth;
  Box(double w, double h, double d){  //constructor with 3 parameters
    width=w;
    height=h;
    depth=d;
  }
  Box(){                //constructor no parameters
    width=-1;
    height=-1;
    depth=-1;
  }
  Box(double len){      //constructor with 1 parameter
    width=height=depth=len;
  }
  
  double volume(){
    return width*height*depth;
  }
}
public class K73{
  public static void main(String[] args){
    Box box1=new Box(10,20,15);
    Box box2=new Box();
    Box box3 = new Box(7);
    double vol;
    vol=box1.volume();
    System.out.println(vol);
    vol=box2.volume();
    System.out.println(vol);
    vol=box3.volume();
    System.out.println(vol);
}
}  






