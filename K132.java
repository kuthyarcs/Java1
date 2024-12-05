package pkg1;

public class K132 {

	public static void main(String[] args) {
		String []prison=new String[10];
		for(int i=0;i<10;i++) {
			prison[i]="C";
			
		}
		for(int i=0;i<10;i++) {
			prison[i]="O";
			
		}
		for(int i=1;i<10;i+=2) {
			prison[i]="C";
		}
		for(int j=2;j<10;j++) {
			for(int i=j;i<10;i+=j+1) {
				if(prison[i].equals("C")) {
					prison[i]="O";
				}
				else {
					prison[i]="C";
				}
		}
		}
		for(int i=0;i<10;i++) {
			System.out.print(prison[i]);
	
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			if(prison[i].equals("O")) {
				System.out.println((i+1)+" is a lucky prisoner");
			}
		}

	}

}
