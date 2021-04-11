import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of rows ");
		m=sc.nextInt();
		System.out.println("Enter the dimensions of columns ");
		n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		int d[][]=new int[m][n];
		System.out.println("Enter the elements of matrix 1 ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix 2 ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of the two matrices is ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Multiplication of the two matrices is ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				d[i][j]=0;
				for(int k=0;k<n;k++) {
					d[i][j]+=a[i][k]*b[i][k];
				}
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}		
		sc.close();
	}

}
