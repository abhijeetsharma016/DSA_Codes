package com.GFG.Matrix;

public class Q2_MatrixBoundaryTraversal {
    static int R = 4,C = 4;
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printBoundry(matrix);
    }

    public static void printBoundry(int[][] matrix) {
         if(R == 1){
             for (int i = 0; i < C; i++) {
                 System.out.println(matrix[0][i]);
             }
        } else if (C==1) {
             for (int i = 0; i < R; i++) {
                 System.out.println(matrix[i][0]);
             }
         }
        for (int i = 0; i < C; i++) {
            System.out.print(matrix[0][i]);
        }
        System.out.println("");
        for (int j = 1; j < R; j++) {
            System.out.println(matrix[j][C-1]);
        }
        for (int i = 0; i < C-1; i++) {
            System.out.print(matrix[R-1][i]);
        }
        System.out.println("");
        for (int j = 1; j < R; j++) {
            System.out.println(matrix[j][0]);
        }

    }
}
