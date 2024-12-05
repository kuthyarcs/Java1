package pkg2;

public class Tools2{
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

