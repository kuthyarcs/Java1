package pkg1;
import pkg2.Factorial; //Factorial class is in a different package pkg2
public class K118 {
	public static void main(String[] args) {
		String title0="Lab 10 Program";
		String title1="Develop a JAVA program to create a package pkg1";
		String title2="Import the package and implement it in a class";
		System.out.println(title0+"\n"+title1+"\n"+title2+"\n");
		
		Factorial fact=new Factorial();
		fact.calcFact(5);
		fact.calcFact(6);
		fact.calcFact(7);
		fact.calcFact(8);}}
