package com.GFG.Matrix;
//we need to rotate matrix 90 degree in anticlockwise direction
public class Q4_RotateMatrixAntiClockWise {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        switchColumn(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void switchColumn(int[][] matrix) {
        int n = matrix.length-1;
        for (int i = 0; i < matrix.length/2; i++) { //decided by 2 otherwise it will switch again
            for (int j = 0; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-i][j];
                matrix[n-i][j] = temp;
            }
        }
    }
    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
