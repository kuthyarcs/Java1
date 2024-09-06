class Box{
  double width;
  double height;
  double depth;
  Box(Box ob){           // Constructor - parameter object of type Box
    width=ob.width;
    height=ob.height;
    depth=ob.depth;
  }
  Box(double w, double h, double d){  //Constructor - dimension as parameters
    width=w;
    height=h;
    depth=d;
  }
  Box(){                         //Constructor - no dimensions
    width=-1;
    height=-1;
    depth=-1;
  }
  Box(double len){               //Constructor - all dimensions are same
    width=height=depth=len;
  }
  double volume(){
    return width*height*depth;
  }
}
public class K75{
  public static void main(String[] args){
    Box box1 = new Box(10,20,15);
    Box box2 = new Box();
    Box box3 = new Box(7);
    Box box4 = new Box(box1);         //create copy of box1;
    double vol;
    vol=box1.volume();
    System.out.println(vol);
    vol=box2.volume();
    System.out.println(vol);
    vol=box3.volume();
    System.out.println(vol);
    vol=box4.volume();
    System.out.println(vol);
  }
}  






