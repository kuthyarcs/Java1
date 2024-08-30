public class K30{
    public static void main(String[] args){
	int xy[][]=new int[4][];
	xy[0]=new int[1];  //1st row has 1 column
	xy[1]=new int[2];  //2nd row has 2 columns
	xy[2]=new int[3];  //3rd row has 3 columns
	xy[3]=new int[4];  //4th row has 4 columns

	xy[0][0]=50;

	xy[1][0]=51;
	xy[1][1]=52;

	xy[2][0]=53;
	xy[2][1]=54;
	xy[2][2]=55;
	
	xy[3][0]=56;
	xy[3][1]=57;
	xy[3][2]=58;
	xy[3][3]=59;

	for(int i=0;i<1;i++){
	    System.out.print(xy[0][i]);
	    System.out.print("\t");}
	System.out.println();

	for(int i=0;i<2;i++){
	    System.out.print(xy[1][i]);
	    System.out.print("\t");}
	System.out.println();

	for(int i=0;i<3;i++){
	    System.out.print(xy[2][i]);
	    System.out.print("\t");}
	System.out.println();

	for(int i=0;i<4;i++){
	    System.out.print(xy[3][i]);
	    System.out.print("\t");}
	System.out.println();
    }
}
//javac -d bin K30.java
//java -cp bin K30
//row 1 has 1 column
//row 2 has 2 columns
//row 3 has 3 columns
//row 4 has 4 columns
//Java-HerbertSchildt-Chap3




