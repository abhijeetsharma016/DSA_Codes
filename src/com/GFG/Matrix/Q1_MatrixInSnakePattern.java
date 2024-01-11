package com.GFG.Matrix;

public class Q1_MatrixInSnakePattern {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSnake(matrix);
    }

    public static void printSnake(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
            else{
                for (int j = matrix.length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
            System.out.println("");
        }
    }
}
