package pkg2;

public class Factorial {
	public void calcFact(int num1) {
		int result=1;
		for(int i=1;i<num1+1;i++) {
			result=result*i;
		}
		System.out.println(num1+ " "+result);
	}

}
