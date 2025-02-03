import java.util.Scanner;
public class SpiralMatrix {
	public static void main(String[] args) {
		int rows, columns;
		Scanner scan = new Scanner(System.in);
	

		int [][] spiralMatrix =  {{1, 2, 3,4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

		int right_Boundary = spiralMatrix[0].length-1;
		int left_Boundary  = 0;
		int top_Boundary = 0;
		int bottom_Boundary = spiralMatrix.length-1;

		while (left_Boundary <= right_Boundary && top_Boundary <= bottom_Boundary) {

			for (int i = left_Boundary; i <= right_Boundary; i++) {
			    System.out.println(spiralMatrix[top_Boundary][i]);
			}
			top_Boundary++;
		   
			for (int j = top_Boundary; j <= bottom_Boundary; j++) {
			    System.out.println(spiralMatrix[j][right_Boundary]);
			}
			right_Boundary--;
		   
			if (top_Boundary <= bottom_Boundary) {
			    for (int k = right_Boundary; k >= left_Boundary; k--) {
				 System.out.println(spiralMatrix[bottom_Boundary][k]);
			    }
			    bottom_Boundary--;
			}
		   
			if (left_Boundary <= right_Boundary) {
			    for (int p = bottom_Boundary; p >= top_Boundary; p--) {
				 System.out.println(spiralMatrix[p][left_Boundary]);
			    }
			    left_Boundary++;
			}
		   }
		System.out.println(spiralMatrix[left_Boundary][top_Boundary]);

		
	}
}
