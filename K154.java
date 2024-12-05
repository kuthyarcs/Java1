package pkg2;

class Stack2{
	int top=-1;
	int[] st=new int[3];
	void push(int item) {
		top=top+1;
		st[top]=item;
		System.out.println(item+ " Pushed. Top: "+top);
	}
	void pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else {
			int item=st[top];
			top=top-1;
			System.out.println(item+ " Popped. Top: "+top);
			if(top==-1) {
				System.out.println("Stack is empty");
			}
		}
		
	}
	void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(st[i]);
		}
	}
}

public class K154 {

	public static void main(String[] args) {
		System.out.println("Stack");
		Stack2 stack1=new Stack2();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		
		stack1.pop();
		stack1.pop();
		stack1.pop();
		
	
		}

}
