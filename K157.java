package pkg2;

class Calculator{
	public void calc1(int num1,int num2) {
		int sum1=num1+num2;
		int diff1=num1-num2;
		int mul1=num1*num2;
		double div1=(double)num1/(double)num2;
		System.out.println(sum1+" "+diff1+" "+mul1+" "+div1);
	}
	public void calc2(int num1,int num2) {
		int rem1=num1%num2;
		double exp1=Math.pow(num1,num2);
		System.out.println(rem1+" "+exp1);
		
		
	}

}

public class K157 {
	
	public static void main(String[] args) {
		Calculator casio=new Calculator();
		casio.calc1(8, 4);
		casio.calc2(8, 4);
		
	}

}
