public class K32{
    public static void main(String[] args){
	int xyz[][][]=new int[3][4][5];
	for(int i=0;i<3;i++){
	    for(int j=0;j<4;j++){
		for(int k=0;k<5;k++){
		    xyz[i][j][k]=i*j*k;}}}
	for(int i=0;i<3;i++){
	    for(int j=0;j<4;j++){
		for(int k=0;k<5;k++){
		    System.out.print(xyz[i][j][k]);
		    System.out.print("\t");}
		System.out.println();}
	    System.out.println();}
	System.out.println();

    }
}
//javac -d bin K32.java
//java -cp bin K32
// Three Dimensional MAtrix
//Java-HerbertSchildt-Chap3




