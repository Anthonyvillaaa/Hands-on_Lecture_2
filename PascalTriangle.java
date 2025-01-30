import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println("Please enter the number of rows for Pascal Triangle: ");
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();

		int[][] pascalTriangle = new int[rows][rows];
		
		for (int i = 0 ; i < rows ; i++){
			for (int j = 0; j <= i; j++){
				if(j == 0 || j == i){
					pascalTriangle[i][j] = 1;
				}
				else{
					pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
				}
			}
		}

		for (int i = 0 ; i < rows ; i++){
			for (int j = 0; j <= i; j++){
				System.out.print(pascalTriangle[i][j] + " ");
			}
			System.out.println();
		}


	}
}
