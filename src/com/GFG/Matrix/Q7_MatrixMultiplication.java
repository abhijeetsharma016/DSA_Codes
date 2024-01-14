package com.GFG.Matrix;

public class Q7_MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = { { 5, 6 },
                { 8, 9 } };
        int[][] matrix2 = { { 1, 2 },
                { 4, 5 } };

        int r1 = matrix1.length, c1 = matrix1[0].length;
        int r2 = matrix2.length, c2 = matrix2[0].length; //r2 == c1
        multiply(matrix1, matrix2,r1,c1,r2,c2);
    }

    public static void multiply(int[][] matrix1, int[][] matrix2,int r1, int c1, int r2,int c2) {
        int[][] res = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    res[i][j]+= matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                System.out.print(res[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
