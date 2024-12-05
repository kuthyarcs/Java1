package pkg2;
import java.util.Scanner;
class Stack{
	int top;
	int s1[]=new int[3];
 	int len1=s1.length;
	Stack() {
		top=-1;
	}
	void push(int item) {
		if(len1-1==top) {
			System.out.println("Stack overflow");
		}
		else {
			top=top+1;
			s1[top]=item;
		}
	}  
	void pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else {
			int item=s1[top];
			System.out.println(item+" has been popped");
			top=top-1;
		}
	}
	void display() {
		if(top==-1) {
			System.out.println("Stack is empty. No items to display");
		}
		else {
			System.out.println("Items in the Stack are ");
			for(int i=top;i>=0;i--) {
				System.out.println(s1[i]);
			}
		}
	}
}

public class K139_Stack {
	public static void main(String[] args) {
		System.out.println("Stack Program");
		int ch;
		int item;
		Stack stk=new Stack();
		Scanner sc1=new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1,2,3,4 for PUSH,POP,DISPLAY,EXIT");
			ch=sc1.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the items to be pushed");
				item=sc1.nextInt();
				stk.push(item);
				break;
			case 2:
				stk.pop();
				break;
			case 3:
				stk.display();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Enter a valid choice");
			}
		}
		
		
		
	}
	
}
//Develop a Stack class to hold a maximum of 3 integers with suitable methods.
//Develop a Java main method to illustrate Stack operations