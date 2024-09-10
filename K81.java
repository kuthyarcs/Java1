class Stack{
  private int stck[]=new int[10];
  private int tos;
  Stack(){
    tos=-1;
  }
  void push(int item){
    if(tos==9)
      System.out.println("Stack is full");
    else
      stck[++tos]=item;
  }
   int pop(){
     if(tos<0){
       System.out.println("Stack underflow");
       return 0;
     }
     else
       return stck[tos--];
   }
}
public class K81{
  public static void main(String[] args){
    Stack stack1=new Stack();
    Stack stack2=new Stack();
    for(int i=0;i<10;i++){
      stack1.push(i);}
   
    System.out.println("Stack1 is");
    for(int i=0;i<10;i++)
      System.out.println(stack1.pop());
   
  }
}  
//stack1.tos=-2 ; Not valid
//stack2.stck[3]=100; Not valid



