class Test{
  int a,b;
  Test(int i, int j){
    a=i;
    b=j;
  }
  boolean equalTo(Test o){              //using objects as parameters
    if(o.a==a && o.b==b) return true;
    else return false;
  }
}
public class K74{
  public static void main(String[] args){
    Test ob1=new Test(100,22);
    Test ob2=new Test(100,22);
    Test ob3=new Test(-1,-1);
    System.out.println(ob1.equalTo(ob2));
    System.out.println(ob1.equalTo(ob3));
  }
}  






