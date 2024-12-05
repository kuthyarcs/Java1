package pkg2;

import java.util.Scanner;

public class K153 {

	public static void main(String[] args) {
		System.out.println("Matrix");
		int n1;
		Scanner sc1=new Scanner(System.in);
		n1=sc1.nextInt();
		int[][] a = new int[n1][n1];
		int[][] b = new int[n1][n1];
		int[][] sum = new int[n1][n1];
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				a[i][j]=sc1.nextInt();
			}
		}
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				b[i][j]=sc1.nextInt();
			}
		}
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}

}
