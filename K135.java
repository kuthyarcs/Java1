package pkg2;
public class K135 {
	enum Color{  //enum within a class
		RED,GREEN,BLUE;}
	public static void main(String[] args) {
		Color c1=Color.RED;
		Color c2=Color.GREEN;
		Color c3=Color.BLUE;
		System.out.println(c1);
		System.out.println(c1.ordinal());
		System.out.println(Color.valueOf("GREEN"));
		for(int i=0;i<3;i++) {
			System.out.println(Color.values());
		}
		

	}

}
