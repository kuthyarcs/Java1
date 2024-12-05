package pkg1;
import pkg2.Tools8;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class K133 {
	public static void reverse2(String fname1,String fname2) throws FileNotFoundException {
		
		File f1=new File(fname1);
		File f2=new File(fname2);
		PrintStream ps = new PrintStream(f2);
		Tools8 t1=new Tools8();
		Scanner sc1=new Scanner(f1);
		String name="";
		String result="";
		
		while(sc1.hasNext()) {
			name=sc1.nextLine();
			result=t1.reverse(name);
			System.out.println(result);
			ps.println(result);
		}
		ps.close();
	
	}
	

	public static void main(String[] args) throws FileNotFoundException {
			reverse2("friends.txt", "friends_out2.txt");
		
			
	}

}
