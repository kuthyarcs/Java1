package pkg2;
import java.util.Scanner;
public class K138_Matrix {

	public static void main(String[] args) {
		int[][] matrix1=new int[2][2];
		int[][] matrix2=new int[2][2];
		int[][] matrix3=new int[2][2];
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter size of matrix");
		int n=sc1.nextInt();
		System.out.println("Enter elements of Matrix1");
		for(int j=0;j<n;j++)  {
			for(int i=0;i<n;i++) {
				matrix1[i][j]=sc1.nextInt();
			}
		}
		System.out.println("Enter elements of Matrix2");
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				matrix2[i][j]=sc1.nextInt();
			}
		}
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				System.out.print(matrix3[i][j]+"\t");
			}
			System.out.println();
		}
		sc1.close();
	}

}
//Develop a Java program to add 2 matrices of suitable order N
//The value of N should be read from command line arguments