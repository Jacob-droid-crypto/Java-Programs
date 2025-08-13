import java.util.Scanner;
public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the number of columns:");
		int cols = sc1.nextInt();
		int [][] matrix = new int[rows][cols];
		int [][] transpose = new int [cols][rows];
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the elements of the matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j] = sc2.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				transpose [j][i] = matrix[i][j];
			}
		}
		System.out.println("The Transposed  Matrix:");
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
