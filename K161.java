package pkg2;
class CustomException1 extends Exception{
	public CustomException1(String message) {
		super(message);
	}
}

public class K161 {
	public static void main(String[] args) {
		System.out.println("Exception");
		int nr=1;
		int dr=0;
		int result;
		try {
			if(dr==0) {
				throw new CustomException1("This is custom exception");
			}
			result=nr/dr;
			System.out.println("This is try block");
			
		}
		
		catch(Exception e) {
			System.out.println("This is catch block1");
		}
		finally {
			System.out.println("This is finally block");
		}

	}

}
