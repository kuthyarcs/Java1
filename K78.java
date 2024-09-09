class Factorial{
    int fact(int n){
      int result;
      if (n==1) return 1;
      result=fact(n-1)*n;
      return result;
    }
}
      
public class K78{
  public static void main(String[] args){
    Factorial f1 = new Factorial();
    System.out.println(f1.fact(5));
  }
}  


// Not properly understood



