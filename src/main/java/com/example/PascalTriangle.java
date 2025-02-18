package com.example;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Please enter the number of rows for Pascal Triangle: ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        int[][] pascalTriangle = generatePascalTriangle(rows);

        for (int i = 0 ; i < rows ; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generatePascalTriangle(int rows){
        int[][] pascalTriangle = new int[rows][];
        
        for (int i = 0 ; i < rows ; i++){
            pascalTriangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    pascalTriangle[i][j] = 1;
                }
                else{
                    pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
                }
            }
        }

        return pascalTriangle;
    }
}
