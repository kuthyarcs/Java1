package pkg1;
class Tools{
	public void reverse(String s1) {
		String s2="";
		int len1=0;
		len1=s1.length();
		s2="";
		for(int i=0;i<len1;i++) {
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
		System.out.println(s2);
	}
}

public class K125 {
	

	public static void main(String[] args) {
		Tools t1 = new Tools();
		t1.reverse("Pavan Kulkarni");
		t1.reverse("Chandrashekar Rao Kuthyar");
		t1.reverse("Madan");

	}

}
